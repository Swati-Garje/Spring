package com.crud.crudDemo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.crud.crudDemo.model.Author;

public interface AuthorDao extends CrudRepository<Author, Integer>{
	
	public Author findByAuthorName(String authorName);
	
	public List<Author> findByAuthorNameOrBookTitle(String authorName, String bookTitle);
}
