package com.griddynamics.olga.controllers;

import com.griddynamics.olga.repository.BookRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class PostController {

    BookRepository bookRepository;

    // Create a new book note
    @PostMapping("/books")
    public Book createNote(){
        return 0;
    }

    // Create a new genre note
    @PostMapping("/genres")
    public Genre createGenreNote(){
        return 0;
    }

    // Create a new user note
    @PostMapping("/users")
    public User createUserNote(){
        return 0;
    }

    // Create a new author note
    @PostMapping("/authors")
    public Author createAuthorNote(){
        return 0;
    }
}
