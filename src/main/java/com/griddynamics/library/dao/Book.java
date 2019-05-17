package com.griddynamics.library.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Table(name = "book_library")
@Entity
public class Book {
    @Id
    @GeneratedValue
    private int book_id;
    private String author;
    private String title;
    private int publication_date;
    private int pages;


}
