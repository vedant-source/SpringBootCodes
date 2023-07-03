package com.BookProjectWithDB.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookProjectWithDB.dao.BookRepository;
import com.BookProjectWithDB.dto.Book;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	// Fetch all books
	public List<Book> getAllBooks() {
		List<Book> blist = (List<Book>) bookRepository.findAll();
		return blist;
	}

	// Fetch single book
	public Book getBookById(int id) {
		try {
			bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Add book to list
	public void addBook(Book b) {
		System.out.println("Book In service layer");
		bookRepository.save(b);
	}

	// delete book by Id
	public void deleteBook(int bid) {
		try {
			bookRepository.deleteById(bid);
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void updateBook(Book book, int bookId) {
		try {
			if (bookRepository.findById(bookId) != null) {
				bookRepository.save(book);
			}			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
