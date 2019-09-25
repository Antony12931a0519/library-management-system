package com.javatraining.librarymanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatraining.librarymanagementsystem.entities.Books;

public interface BooksDAO extends CrudRepository<Books, Integer> {

}
