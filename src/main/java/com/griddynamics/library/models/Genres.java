package com.griddynamics.library.models;

import lombok.Getter;

import java.util.List;

@Getter

public class Genres {
    long genre_id;

    String genre_name;

    List<Book> books;
}
