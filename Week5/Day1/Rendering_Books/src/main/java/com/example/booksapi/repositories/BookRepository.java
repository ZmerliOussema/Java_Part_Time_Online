package com.example.booksapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.booksapi.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	 // This method retrieves all the books from the database
    List<Book> findAll();
   
}
