package com.javatraining.librarymanagementsystem.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatraining.librarymanagementsystem.dao.BooksDAO;
import com.javatraining.librarymanagementsystem.entities.Books;

@Service
public class BooksManager {

	@Autowired
	private BooksDAO booksDAO;

	public List<Books> getBooksList() {

		List<Books> books = (List<Books>) booksDAO.findAll();
		return books;
	}

	public Books inserBookDetails(Books books) {
		return booksDAO.save(books);

	}

}
