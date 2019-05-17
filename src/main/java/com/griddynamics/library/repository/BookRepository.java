package com.griddynamics.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BookRepository extends JpaRepository<Book, Long> { // CrudRepository ???


}

//@Repository: Annotation used to Indicate the DAO
// (Data Access Object) component in the persistence layer.

//imported the JpaRepository package to use that repository in the BookRepository interface
// by connecting most recently coded Book model to do CRUD operations.