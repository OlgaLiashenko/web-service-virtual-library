package com.griddynamics.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceVirtualLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceVirtualLibraryApplication.class, args);
	}

}


//Create a web service for a virtual library app.
//Library has a set of digital books. Each book has a name, authors name, publication date and a list of genres.
//There can be several users registered.
//User can own access to several books. For each order a date is saved, as well as a percentage of the book that
// the user read (this value can be updated when user reads more pages).
//There should be an option to "gift" your book to another user. The book will be removed from your library
// and added to other users library.
//For each user you should be able to get the list of the genres he reads the most.