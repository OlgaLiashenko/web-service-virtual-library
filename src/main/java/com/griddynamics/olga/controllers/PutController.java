package com.griddynamics.olga.controllers;

import com.griddynamics.olga.repository.BookRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class PutController {

    BookRepository bookRepository;

    // Update a book note
    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable String bookId){
        return 0;
    }

    // Update book read pages
    @PutMapping("/books/{bookId}")
    public Book updateReadBookPages(@PathVariable String bookId){
        return 0;
    }

    // Make Gift a book to another user
    @PutMapping("/books/{bookId}")
    public Book makeGift(@PathVariable String bookId){
        return 0;
    }

}
