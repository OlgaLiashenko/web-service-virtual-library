package com.griddynamics.library.dao;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "orders")

public class OrderDao {
    @Id
    @GeneratedValue
    long order_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserDao userDao;

    @ManyToOne
    @JoinColumn(name = "book_id")
    BookDao bookDao;

    Date order_date;

    int read_on_page;
}
