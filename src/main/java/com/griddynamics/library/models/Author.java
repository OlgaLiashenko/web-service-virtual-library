package com.griddynamics.library.models;

import lombok.Getter;

import java.util.List;

@Getter

//@Data
public class Author {

    long author_id;

    String author_name;

    List<Book> books;
}
