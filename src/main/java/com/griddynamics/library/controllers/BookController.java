package com.griddynamics.library.controllers;

import com.griddynamics.library.models.Book;
import com.griddynamics.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Get all books
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllNotes() {
        return new ResponseEntity<List<Book>>(bookService.getAllNotes(), HttpStatus.OK);
    }

    // Get a single book by id
    @GetMapping("/books/{bookId}")
    public Book getBookById() {
        return null;
    }

    // Get a title of most popular book
    @GetMapping("/books/popular/")
    public Book getPopularBook() {
        return null;
    }

    // Get books by author
    @GetMapping("/books/author")
    public List<Book> getBooksByAuthor() {
        return null;
    }

    // Get list of books by genre
    @GetMapping("/books/genre")
    public List<Book> getBooksByGenre() {
        return null;
    }


    // Create a new book note
    @PostMapping("/books")
    public Book createNote(){
        return null;
    }

    // Update a book note
    @PutMapping("/books/")
    public Book updateBook(){
        return null;
    }


    // Update book read pages
    @PutMapping("/books/pages")
    public Book updateReadBookPages(){
        return null;
    }

    // Make Gift a book to another user
    @PutMapping("/books/gift")
    public Book makeGift(@PathVariable String bookId){
        return null;
    }


    // Delete book by id
    @DeleteMapping("/books/{bookId}")
    public void deleteBookById(){
        return;
    }


    @GetMapping("/")
    public String homeMapping() {
        return "Hello!";
    }


}
