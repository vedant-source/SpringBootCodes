package com.api.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.dto.Book;
import com.api.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/books")
	public List<Book> handleBooks() {

//		Book b = new Book();
//		b.setId(1);
//		b.setName("Namo Mantra");
//		b.setAuthor("Modi");
//		
//		return b;

		return bookService.getAllBooks();

	}

	@GetMapping("/bookById")
	public Book getSingleBook() {
		return bookService.getBookById(2);
	}
	
	@PostMapping("/addBook")
	public void addBookHandler(@RequestBody Book book) {
		System.out.println("Book In POST contr");
//		Book book2 = new Book();
//		book2.setId(book.getId());
//		book2.setName(book.getName());
//		book2.setAuthor(book.getAuthor());
		System.out.println(book);
		bookService.addBook(book);
	}
	
	//Id coming from URI from postman
	@DeleteMapping("/deleteBook/{bookId}")
	public void deleteBookHandler(@PathVariable("bookId") int bookId ) {
		bookService.deleteBook(bookId);
	}
	
	//Updating book if exist
	
	@PutMapping("/updateBook/{bookId}")
	public void updateHandler(@RequestBody Book book,@PathVariable("bookId") int bookId ) {
		System.out.println(book);
		bookService.updateBook(book,bookId);
	}
	
	
	
	
	
	
}
