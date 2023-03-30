package com.api.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.book.dto.Book;

@Service
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(1, "Ramayana", "Hrishi Valmki"));
		list.add(new Book(2, "Wings Of fire", "APJ Abdul Kalam"));
		list.add(new Book(3, "Adventures of Tom Sawyer", "Mark Twain"));

	}

	// Fetch all books
	public List<Book> getAllBooks() {
		return list;
	}

	// Fetch single book
	public Book getBookById(int id) {
		try {
			for (Book b : list) {
				if (b.getId() == id) {
					return b;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Add book to list
	public void addBook(Book b) {
		System.out.println("Book In service layer");
		list.add(b);
	}

	// delete book by Id
	public void deleteBook(int bid) {
		try {
			for (Book book : list) {
				if (book.getId() == bid) {
					list.remove(book);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void updateBook(Book book,int bookId) {
		
		Book b = getBookById(bookId);
		b.setAuthor(book.getAuthor());
		b.setName(book.getName());
		

		
	}

}
