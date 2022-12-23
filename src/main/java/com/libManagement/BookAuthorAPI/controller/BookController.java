package com.libManagement.BookAuthorAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libManagement.BookAuthorAPI.entities.Books;
import com.libManagement.BookAuthorAPI.services.BooksService;

@RestController
public class BookController {

	@Autowired
	private BooksService bookService;

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/{id}")
	public Optional<Books> getBooks(@PathVariable int id) {
		return bookService.getBooks(id);
	}

	@PostMapping("/books")
	public void addBooks(@RequestBody Books books) {
		bookService.addBooks(books);
	}

	@PutMapping("/books/{id}")
	public void updateBooks(@RequestBody Books books, @PathVariable int id) {
		bookService.updateBooks(id, books);
	}

	@DeleteMapping("/books/{id}")
	public void deleteBooks(@PathVariable int id) {
		bookService.deleteBooks(id);
	}
	
	@RequestMapping("/")
	public String welcomeMessage() {
		return "Hello There welcome to the Book Author Api Application";
	}
}
