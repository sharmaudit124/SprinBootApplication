package com.libManagement.BookAuthorAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libManagement.BookAuthorAPI.dao.BooksDao;
import com.libManagement.BookAuthorAPI.entities.Books;

@Service
public class BooksService {

	@Autowired
	private BooksDao bookDao;


	public List<Books> getAllBooks() {
		return bookDao.findAll();

	}

	public Optional<Books> getBooks(int id) {
		return bookDao.findById(id);
	}

	public void addBooks(Books books) {
		bookDao.saveAndFlush(books);
	}

	public void updateBooks(int id, Books books) {
		bookDao.saveAndFlush(books);
	}

	public void deleteBooks(int id) {
		bookDao.deleteById(id);

	}

}