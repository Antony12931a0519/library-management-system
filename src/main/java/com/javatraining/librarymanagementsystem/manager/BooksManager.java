package com.javatraining.librarymanagementsystem.manager;

import java.util.List;
import java.util.Optional;

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

	public Books updateBookDetails(Books books) throws Exception {

		Optional<Books> bookDetails = null;
		Books book = null;
		bookDetails = booksDAO.findById(books.getBookId());

		if (bookDetails != null) {
			book = bookDetails.get();
		} else {
			throw new Exception(
					"No book details are matching with the given Id");
		}

		if (book != null) {

			book.setAuthor(books.getAuthor());
			book.setPrice(books.getPrice());
			book.setBookName(books.getBookName());
		}

		return booksDAO.save(book);

	}

}
