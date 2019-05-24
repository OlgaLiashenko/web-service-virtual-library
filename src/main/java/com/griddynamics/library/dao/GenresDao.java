package com.griddynamics.library.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genres")
public class GenresDao {

    @Id
    @GeneratedValue
    long genre_id;

    String genre_name;

    @ManyToMany
    List<BookDao> books;


}
