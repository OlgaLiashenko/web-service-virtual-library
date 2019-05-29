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
    @MapsId("author_name")
    @JoinColumn(name = "author")
    private AuthorDao authorDao;

    private String title;

    private Date publication_date;

    private int pages;

    @OneToMany(mappedBy = "bookDao")
    private List<OrderDao> orders;

    @ManyToMany
    @JoinTable(name = "book_genres",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "genre_id"))
    private List<GenresDao> genres;

}
