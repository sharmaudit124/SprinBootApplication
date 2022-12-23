package com.libManagement.BookAuthorAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libManagement.BookAuthorAPI.entities.Authors;
import com.libManagement.BookAuthorAPI.services.AuthorsService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorsService authorsService;
	
	@RequestMapping("/authors")
	public List<Authors> getAllAuthors() {
		return authorsService.getAllAuthors();
	}
	
	@RequestMapping("authors/{id}")
	public Optional<Authors> getAuthors(@PathVariable int id) {
		return authorsService.getAuthors(id);
	}
}