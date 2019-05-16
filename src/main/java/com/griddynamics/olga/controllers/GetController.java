package com.griddynamics.olga.controllers;

import com.griddynamics.olga.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class GetController {

    BookRepository bookRepository;

    // Get all books
    @GetMapping("/books")
    public List<Book> getAllNotes() {
        return bookRepository.findAllBooks();
    }

    // Get a single book by id
    @GetMapping("/books/{bookId}")
    public Book getNoteById(@PathVariable String bookId) {
        return bookRepository.findById();
    }

    // Get a title of most popular book
    @GetMapping("/books")
    public Book getPopularBook() {
        return 0;
    }


    // Get books by author
    @GetMapping("/books/{bookId}}")
    public List<Book> getBooksByAuthor(@PathVariable String bookId) {
        return 0;
    }

    // Get list of books by genre
    @GetMapping("/books")
    public List<Book> getBooksByGenre() {
        return 0;
    }

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

    // Get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return 0;
    }

    // Get user by id
    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable String userId) {
        return 0;
    }

    // Get users from some country
    @GetMapping("/users")
    public List<User> getUsersFromCountry() {
        return 0;
    }

    // Get one most active user
    @GetMapping("/users")
    public User getMostActiveUser() {
        return 0;
    }

    // Get most popular genre for some user
    @GetMapping("/users/{userId}")
    public User getPopularGenreForUser(@PathVariable String userId) {
        return 0;
    }
}
