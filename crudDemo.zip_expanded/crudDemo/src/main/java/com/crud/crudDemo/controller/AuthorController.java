package com.crud.crudDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crudDemo.model.Author;
import com.crud.crudDemo.service.AuthorService;

@RequestMapping("author")
@RestController
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	@GetMapping
	public ResponseEntity<List<Author>> getAuthor()
	{
		List<Author> author = authorService.getAllAuthors();
		return new ResponseEntity<List<Author>>(author,HttpStatus.FOUND);
	}
	
	@GetMapping("/{authorName}")
	public ResponseEntity<Author> getAuthorByName(@PathVariable String authorName)
	{
		Author authorByName = authorService.getAuthorByName(authorName);
		return new ResponseEntity<Author>(authorByName,HttpStatus.FOUND);
	}
	
	@PostMapping
	public ResponseEntity<Author> saveAuthor(@RequestBody Author author)
	{
		Author savedAuthor = authorService.saveAuthor(author);
		return new ResponseEntity<Author>(savedAuthor,HttpStatus.CREATED);
	}
	
	@GetMapping("{authorName}/{bookTitle}")
	public ResponseEntity<List<Author>> findByAuthorNameOrBookTitle
	(@PathVariable String authorName,@PathVariable String bookTitle)
	{
		List<Author> authorByNameOrBookTitle = authorService.findByAuthorNameOrBookTitle
																(authorName, bookTitle);
		return new ResponseEntity<List<Author>>(authorByNameOrBookTitle,HttpStatus.FOUND);
	}
	
	@PutMapping("{authorId}")
	public ResponseEntity<Author> updateAuthor(@RequestBody Author author, 
												@PathVariable int authorId)
	{
		Author savedAuthor=authorService.updateAuthor(author,authorId);
		return new ResponseEntity<Author>(savedAuthor,HttpStatus.CREATED);
	}

	@DeleteMapping("{authorId}")
	public ResponseEntity<String> deleteAuthor(@PathVariable int authorId)
	{
		String status=authorService.deleteAuthor(authorId);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	
}



















