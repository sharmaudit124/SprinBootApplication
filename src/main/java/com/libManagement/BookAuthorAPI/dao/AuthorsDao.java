package com.libManagement.BookAuthorAPI.dao;

import org.springframework.data.repository.CrudRepository;

import com.libManagement.BookAuthorAPI.entities.Authors;

public interface AuthorsDao extends CrudRepository<Authors, Integer> {

}
