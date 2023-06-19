package com.crud.crudDemo.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {
	
	
	String authorName;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int authorId;
	String bookTitle;
	@Type(type="yes_no")
	boolean isActive;
	
	@Column(name="userr")//database will get this column name 
	String use;//this property name should use in postman but
	
	@Transient
	int somecalc;
	
	@Embedded
	Address officeaddress;
	
	 @AttributeOverrides({
	      @AttributeOverride(name = "city", column = @Column(name = "Home_City")),
	      @AttributeOverride(name = "state", column = @Column(name = "HOme_State"))
	    })
	@Embedded
	Address homeAddress;

	@ElementCollection 
	@Embedded
	List<Book> books;
	
}




























