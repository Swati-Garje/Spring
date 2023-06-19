package com.crud.crudDemo.service;

import java.util.List;

import com.crud.crudDemo.model.Author;

public interface AuthorService {
	
	public Author saveAuthor(Author author);
	public Author getAuthorByName(String authorName);
	public List<Author> getAllAuthors();
	public List<Author> findByAuthorNameOrBookTitle(String authorName, String bookTitle);
	public Author updateAuthor(Author author, int authorId);
	public String deleteAuthor(int authorId);
}
