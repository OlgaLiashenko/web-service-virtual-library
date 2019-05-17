package com.griddynamics.library.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class AuthorController {



    // Get all authors
    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return 0;
    }

    // Get author by id
    @GetMapping("/authors/{authorId}")
    public Author getAuthorById(@PathVariable String authorId) {
        return 0;
    }

    // Create a new author note
    @PostMapping("/authors")
    public Author createAuthorNote(){
        return 0;
    }

    // Delete all books by author id
    @DeleteMapping("/authors/{authorId}")
    public deleteAuthor(){
        return ;
    }
}
