package com.griddynamics.library.service.implementation;

import com.griddynamics.library.repository.BookRepository;
import com.griddynamics.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    //@Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getAllNotes() {
        return null;
    }

    @Override
    public Book getBookById(long id) {
        return null;
    }
}


