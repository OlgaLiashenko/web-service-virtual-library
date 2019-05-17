package com.griddynamics.library.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {



    // Get all books
    @GetMapping("/books")
    public List<Book> getAllNotes() {
        return ;
    }

    // Get a single book by id
    @GetMapping("/books/{bookId}")
    public Book getBookById() {
        return ;
    }

    // Get a title of most popular book
    @GetMapping("/books/popular/")
    public Book getPopularBook() {
        return 0;
    }

    // Get books by author
    @GetMapping("/books/author")
    public List<Book> getBooksByAuthor() {
        return 0;
    }

    // Get list of books by genre
    @GetMapping("/books/genre")
    public List<Book> getBooksByGenre() {
        return 0;
    }


    // Create a new book note
    @PostMapping("/books")
    public Book createNote(){
        return 0;
    }

    // Update a book note
    @PutMapping("/books/")
    public Book updateBook(){
        return 0;
    }


    // Update book read pages
    @PutMapping("/books/pages")
    public Book updateReadBookPages(){
        return 0;
    }

    // Make Gift a book to another user
    @PutMapping("/books/gift")
    public Book makeGift(@PathVariable String bookId){
        return 0;
    }


    // Delete book by id
    @DeleteMapping("/books/{bookId}")
    public deleteBookById(){
        return ;
    }



}
