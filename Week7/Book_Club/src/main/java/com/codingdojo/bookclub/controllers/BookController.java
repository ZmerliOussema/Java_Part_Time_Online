package com.codingdojo.bookclub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.services.BookService;
import com.codingdojo.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

	@Autowired
	private BookService bookServ;

	@Autowired
	private UserService userService;

	@GetMapping("/books")
	public String dashboard(Model model, HttpSession session) {
		// Grab the user id from session
		Long userId = (Long) session.getAttribute("user_id");
		// Route Guard
		if (userId == null) {
			return "redirect:/";
		} else {

			// Grab all Books
			List<Book> books = bookServ.getAllBooks();
			model.addAttribute("books", books);

			// Find the current User by Id
			User user = userService.findById(userId);
			model.addAttribute("user", user);

			return "dashboard.jsp";
		}

	}

	@GetMapping("/books/new")
	public String bookForm(@ModelAttribute("book") Book book, HttpSession session) {
		// Grab the user id from session
		Long userId = (Long) session.getAttribute("user_id");
		// Route Guard
		if (userId == null) {
			return "redirect:/";
		} else {

			return "createBookForm.jsp";
		}

	}

	@PostMapping("/books")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {

		// Grab the user id from session
		Long userId = (Long) session.getAttribute("user_id");
		// Route Guard
		if (userId == null) {
			return "redirect:/";
		} else {

			if (result.hasErrors()) {
				return "createBookForm.jsp";
			} else {
				// Grab the logged in user Object
				User currentUser = userService.findById(userId);
				// Set the User id inside the car Object
				book.setUser(currentUser);

				Book newBook = bookServ.createBook(book);

				return "redirect:/books";
			}

		}

	}

	@GetMapping("/books/{id}")
	public String getBookById(Model model, @PathVariable("id") Long id, HttpSession session) {

		// Grab the user id from session
		Long userId = (Long) session.getAttribute("user_id");
		// Route Guard
		if (userId == null) {
			return "redirect:/";
		} else {
			Book book = bookServ.findBook(id);
			model.addAttribute("book", book);
			return "bookDetails.jsp";
		}

	}

	@GetMapping("/books/{id}/edit")
	public String updateBook(@PathVariable("id") Long id, Model model, @ModelAttribute("book") Book book) {

		Book foundedBook = bookServ.findBook(id);
		model.addAttribute("book", foundedBook);

		return "editBookForm.jsp";
	}

	@PutMapping("/books/{id}")
	public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {

		// Grab the user id from session
		Long userId = (Long) session.getAttribute("user_id");
		// Route Guard
		if (userId == null) {
			return "redirect:/";
		} else {
			if (result.hasErrors()) {
				return "editBookForm.jsp";
			} else {
				// Grab the logged in user Object
				User currentUser = userService.findById(userId);
				// Set the User id inside the car Object
				book.setUser(currentUser);

				bookServ.updateBook(book);
				return "redirect:/books";
			}
		}
	}

	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
		// Grab the user id from session
		Long userId = (Long) session.getAttribute("user_id");
		// Route Guard
		if (userId == null) {
			return "redirect:/";
		} else {
			bookServ.deleteBook(id);
			return "redirect:/books";
		}
	}

}
