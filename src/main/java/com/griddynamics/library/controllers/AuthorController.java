package com.griddynamics.library.controllers;

import com.griddynamics.library.models.Author;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AuthorController {



    // Get all authors
    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return null;
    }

    // Get author by id
    @GetMapping("/authors/{authorId}")
    public Author getAuthorById(@PathVariable String authorId) {
        return null;
    }

    // Create a new author note
    @PostMapping("/authors")
    public Author createAuthorNote(){
        return null;
    }

    // Delete all books by author id
    @DeleteMapping("/authors/{authorId}")
    public void deleteAuthor(){
        return;
    }
}
