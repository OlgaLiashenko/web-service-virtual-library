package com.griddynamics.olga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.awt.print.Book;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    Book findById();

    List<Book> findAllBooks();

}

//@Repository: Annotation used to Indicate the DAO
// (Data Access Object) component in the persistence layer.

//imported the JpaRepository package to use that repository in the BookRepository interface
// by connecting most recently coded Book model to do CRUD operations.