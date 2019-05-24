package com.griddynamics.library.service.implementation;

import com.griddynamics.library.dao.BookDao;
import com.griddynamics.library.models.Book;
import com.griddynamics.library.repository.BookRepository;
import com.griddynamics.library.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getAllNotes() {
        List<BookDao> daos = bookRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();

        List<Book> result = new ArrayList<>();
        for (BookDao dao : daos) {
            Book map = modelMapper.map(dao, Book.class);
            result.add(map);
        }
/*
        List<Book> result = daos.stream()
                .map(dao -> modelMapper.map(dao, Book.class))
                .collect(Collectors.toList());

        //   Mapper.map(new Book(), bookDao);
 */
        return result;
        // return productRepository.findAll().stream().map(Mapper::mapToProductFromEntity).collect(Collectors.toList());
    }


    @Override
    public Book getBookById(long id) {
        return null;
    }
}



