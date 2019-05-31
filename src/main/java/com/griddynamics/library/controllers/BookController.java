package com.griddynamics.library.controllers;

import com.griddynamics.library.models.Book;
import com.griddynamics.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;


@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String homeMapping() {
        return "Hello, this is book library!";
    }

    // Get all books
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllNotes() {
        return new ResponseEntity<List<Book>>(bookService.getAllBookNotes(), HttpStatus.OK);
    }

    // Get a book title by book id
    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable long bookId, HttpServletResponse response) {
        try {
            return new ResponseEntity<Book>(bookService.getBookById(bookId), OK);
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    NOT_FOUND, "Book with this Id not found.", exc);
        }
    }

    // Get books by author
    @GetMapping("/books/author")
    public List<Book> getBooksByAuthor() {

        return null;
    }

    // Get a title of most popular book
    @GetMapping("/books/popular/")
    public Book getPopularBook() {

        return null;
    }


    // Get list of books by genre
    @GetMapping("/books/genre")
    public List<Book> getBooksByGenre() {
        return null;
    }


    // Create a new book note
    @PostMapping("/books")
    public Book createNote() {
        return null;
    }

    // Update a book note
    @PutMapping("/books/")
    public Book updateBook() {
        return null;
    }


    // Update book read pages
    @PutMapping("/books/pages")
    public Book updateReadBookPages() {
        return null;
    }

    // Make Gift a book to another user
    @PutMapping("/books/gift")
    public Book makeGift(@PathVariable String bookId) {
        return null;
    }


    // Delete book by id
    @DeleteMapping("/books/{bookId}")
    public void deleteBookById(@PathVariable long bookId) {
        bookService.deleteBookById(bookId);
    }


}
