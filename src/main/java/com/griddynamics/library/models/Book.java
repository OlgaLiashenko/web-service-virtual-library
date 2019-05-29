package com.griddynamics.library.models;

import lombok.Data;

import java.sql.Date;
import java.util.List;

//@Getter
//@Setter

@Data
public class Book {
    private long book_id;
   // private Author authorDao;
    private String author_name;
    private String title;
    private Date publication_date;
    private int pages;
    private List<String> genres;

}
