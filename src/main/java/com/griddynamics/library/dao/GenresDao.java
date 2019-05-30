package com.griddynamics.library.dao;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name = "genres")
public class GenresDao {

    @Id
    @GeneratedValue
    long genre_id;

    String genreName;

    @ManyToMany
    List<BookDao> books;
}
