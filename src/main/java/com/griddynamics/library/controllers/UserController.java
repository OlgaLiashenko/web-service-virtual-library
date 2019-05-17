package com.griddynamics.library.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {



    // Get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return 0;
    }

    // Get user by id
    @GetMapping("/users/{userId}")
    public User getUserById() {
        return 0;
    }

    // Get users from some country
    @GetMapping("/users/country")
    public List<User> getUsersFromCountry() {
        return 0;
    }

    // Get one most active user
    @GetMapping("/users/active")
    public User getMostActiveUser() {
        return 0;
    }

    // Get most popular genre for some user
    @GetMapping("/users/genre")
    public User getPopularGenreForUser() {
        return 0;
    }

    // Create a new user note
    @PostMapping("/users")
    public User createUserNote(){
        return 0;
    }


    // Delete all users from England
    @DeleteMapping("/users/country")
    public deleteUser(){
        return ;
    }



}
