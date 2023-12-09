package com.example.booksapi.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.booksapi.models.Book;
import com.example.booksapi.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public String getAllBooks(Model model) {
		List<Book> allBooks = bookService.findAll();
		model.addAttribute("books", allBooks);
		
		return "index.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String getOneBook(@PathVariable("id") Long id, Model model) {
		
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		
		return "showOneBook.jsp";
	}


}
