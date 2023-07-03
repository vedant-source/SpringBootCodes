package com.BookProjectWithDB.dao;

import org.springframework.data.repository.CrudRepository;

import com.BookProjectWithDB.dto.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	public Book findById(int id);
}
