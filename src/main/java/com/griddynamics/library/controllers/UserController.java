package com.griddynamics.library.controllers;

import com.griddynamics.library.models.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {



    // Get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return null;
    }

    // Get user by id
    @GetMapping("/users/{userId}")
    public User getUserById() {
        return null;
    }

    // Get users from some country
    @GetMapping("/users/country")
    public List<User> getUsersFromCountry() {
        return null;
    }

    // Get one most active user
    @GetMapping("/users/active")
    public User getMostActiveUser() {
        return null;
    }

    // Get most popular genre for some user
    @GetMapping("/users/genre")
    public User getPopularGenreForUser() {
        return null;
    }

    // Create a new user note
    @PostMapping("/users")
    public User createUserNote(){
        return null;
    }


    // Delete all users from England
    @DeleteMapping("/users/country")
    public void deleteUser(){
        return;
    }



}
