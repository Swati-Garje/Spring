package com.crud.crudDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crudDemo.dao.AuthorDao;
import com.crud.crudDemo.exception.AuthorAlreadyExists;
import com.crud.crudDemo.exception.AuthorNotExist;
import com.crud.crudDemo.model.Author;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	AuthorDao authorDao;
	
	@Override
	public Author saveAuthor(Author author) {
		Author found = getAuthorById(author.getAuthorId());
		if(found!=null)
			throw new AuthorAlreadyExists("author already exists");		
			return authorDao.save(author);
	}
	
	public Author getAuthorById(int authorId)
	{
		Optional<Author> optAuhtor= authorDao.findById(authorId);
		 if(optAuhtor.isPresent())
		 {
			return  optAuhtor.get();		 
		 } 
		 return null;
	}


	public List<Author> getAllAuthors(){
		return (List<Author>) authorDao.findAll();
	}
	
	public Author getAuthorByName(String authorName) {
		return authorDao.findByAuthorName(authorName);
	}
	
	@Override
	public List<Author> findByAuthorNameOrBookTitle(String authorName, String bookTitle){
		return authorDao.findByAuthorNameOrBookTitle(authorName, bookTitle);	
	}

	@Override
	public Author updateAuthor(Author author, int authorId) {
		return authorDao.save(author);
	}

	@Override
	public String deleteAuthor(int authorId) {
		Author found = getAuthorById(authorId);
		if(found==null) {
			throw new AuthorNotExist("author not exists");
		}else {
		authorDao.deleteById(authorId);
		return "Author deleted";
		}
	}
}




















