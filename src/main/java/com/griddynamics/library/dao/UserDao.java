package com.griddynamics.library.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserDao {

    @Id
    @GeneratedValue
    long user_id;

    String user_name;

    String country;

    @OneToMany(mappedBy = "userDao")
    List<OrderDao> orders;
}
