package com.griddynamics.library.service;


import com.griddynamics.library.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> getAllNotes();

    Book getBookById(long id);

}
