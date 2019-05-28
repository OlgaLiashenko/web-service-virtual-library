package com.griddynamics.library.mappers;

import com.griddynamics.library.dao.BookDao;
import com.griddynamics.library.models.Book;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static Book mapBookGenre(BookDao dao) {
        ModelMapper modelMapper = new ModelMapper();

        Book map = modelMapper.map(dao, Book.class);

        List<String> genres = dao.getGenres().stream().map((genre -> genre.getGenre_name())).collect(Collectors.toList());

        map.setGenres(genres);

        return map;
    }

    /*
    public static Book mapToId(BookDao dao) {
        ModelMapper modelMapper = new ModelMapper();
        Book map = modelMapper.map(dao, Book.class);
      //  List<String> titles = dao.getBook().stream().map((title -> title.getTitle())).collect(Collectors.toList());


     //  map.getTitle();


        return map;
    }
    /*

   public static Book mapToAuthor(BookDao dao) {
        ModelMapper modelMapper = new ModelMapper();
        Book map = modelMapper.map(dao, Book.class);
       // List<String> authors = dao.getAuthor().stream().map((author -> author.getAuthor_name())).collect(Collectors.toList());
       //  map.setAuthorDao(modelMapper.map(dao.getAuthorDao(), AuthorDao.class));


       return map;
    }



     */


}



