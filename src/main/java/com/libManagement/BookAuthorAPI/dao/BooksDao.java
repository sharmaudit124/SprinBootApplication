package com.libManagement.BookAuthorAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libManagement.BookAuthorAPI.entities.Books;

public interface BooksDao extends JpaRepository<Books, Integer> {

}
