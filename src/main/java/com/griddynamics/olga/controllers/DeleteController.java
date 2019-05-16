package com.griddynamics.olga.controllers;

import com.griddynamics.olga.repository.BookRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {

    BookRepository bookRepository;

    // Delete all users from England
    @DeleteMapping("/users")
        public deleteUser(){
            return ;
    }


    // Delete book by id
    @DeleteMapping("/books/{bookId}")
    public deleteBookById(){
        return ;
    }
}
