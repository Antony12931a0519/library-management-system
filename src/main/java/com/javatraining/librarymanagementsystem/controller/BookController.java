package com.javatraining.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javatraining.librarymanagementsystem.entities.Books;
import com.javatraining.librarymanagementsystem.manager.BooksManager;

@RestController
public class BookController {

	@Autowired
	private BooksManager booksManager;

	@RequestMapping(value = "/books/total", produces = "application/json", method = { RequestMethod.GET })
	public String getTotalNoOfBooks() {
		return "The totabl books in the lib are :" + 500;

	}

	@RequestMapping(value = "/books/list", produces = "application/json", method = { RequestMethod.GET })
	public List<Books> getBooksList() {

		List<Books> books = booksManager.getBooksList();
		return books;

	}

	@RequestMapping(value = "/books/details", produces = "application/json", method = { RequestMethod.GET })
	public String getBookDetails() {
		return "Author : xxxx" + "fghbj" + "ftgyhujik" + "dfghj";

	}

	@RequestMapping(value = "/add/books",
			produces = "application/json",
			consumes = "application/json",
			method = { RequestMethod.POST })
	public Books insertBookDetails(@RequestBody Books books) {
		return booksManager.inserBookDetails(books);

	}
}
