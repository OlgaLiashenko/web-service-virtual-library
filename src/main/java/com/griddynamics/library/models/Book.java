package com.griddynamics.library.models;

import com.griddynamics.library.dao.AuthorDao;
import lombok.Data;

import java.sql.Date;
import java.util.List;

//@Getter
//@Setter

@Data
public class Book {
    private long book_id;
    private AuthorDao authorDao;
    private String title;
    private Date publication_date;
    private int pages;
    private List<String> genres;

}
