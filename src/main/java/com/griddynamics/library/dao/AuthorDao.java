package com.griddynamics.library.dao;

import javax.persistence.*;
import java.util.List;

//@Getter

@Entity
@Table(name = "authors")
public class AuthorDao {

    @Id
    @GeneratedValue
    long author_id;

    String author_name;

    @OneToMany(mappedBy = "authorDao")
    List<BookDao> books;
}
