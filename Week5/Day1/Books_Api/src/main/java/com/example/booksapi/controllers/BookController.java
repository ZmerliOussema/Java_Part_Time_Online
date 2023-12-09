package com.example.booksapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.booksapi.models.Book;
import com.example.booksapi.services.BookService;

@RestController
public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/api/books")
	public List<Book> getAllBooks() {

		return bookService.allBooks();
	}

	@PostMapping("/api/books")
	public Book createBook(@RequestParam("title") String title, @RequestParam("description") String description,
			@RequestParam("language") String language, @RequestParam("pages") int pages) {

		Book newlyCreatedBook = new Book(title, description, language, pages);

		return bookService.createBook(newlyCreatedBook);

	}

	@GetMapping("/api/books/{id}")
	public Book getBookById(@PathVariable("id") Long id) {
		return bookService.findBook(id);
	}

	@RequestMapping(value = "/api/books/{id}", method = RequestMethod.PUT)
	public Book update(@PathVariable("id") Long id, @RequestParam(value = "title") String title,
			@RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
			@RequestParam(value = "pages") Integer numOfPages) {
		Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
		return book;
	}

	@RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
	public void destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
}
