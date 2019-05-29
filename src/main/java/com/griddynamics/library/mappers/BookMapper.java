package com.griddynamics.library.mappers;

import com.griddynamics.library.dao.BookDao;
import com.griddynamics.library.dao.GenresDao;
import com.griddynamics.library.models.Book;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static Book mapBookGenre(BookDao dao) {
        ModelMapper modelMapper = new ModelMapper();

        Book booksWithGenres = modelMapper.map(dao, Book.class);

        List<String> genres = dao.getGenres().stream().map(GenresDao::getGenreName).collect(Collectors.toList());

        booksWithGenres.setGenres(genres);

        booksWithGenres.setAuthor_name(dao.getAuthorDao().getAuthor_name());

        return booksWithGenres;
    }


    public static Book mapToId(BookDao dao) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dao, Book.class);

    }
}



