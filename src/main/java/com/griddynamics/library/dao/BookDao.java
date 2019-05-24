package com.griddynamics.library.dao;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter

@Table(name = "book")
@Entity
public class BookDao {

    @Id
    @GeneratedValue
    private long book_id;

    @ManyToOne
    @JoinColumn(name = "author")
    private AuthorDao authorDao;

    private String title;

    private Date publication_date;

    private int pages;

    @OneToMany(mappedBy = "bookDao")
    private List<OrderDao> orders;

    @ManyToMany
    private List<GenresDao> genres;
}
