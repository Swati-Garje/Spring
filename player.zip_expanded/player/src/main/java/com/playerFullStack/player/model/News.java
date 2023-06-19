package com.playerFullStack.player.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
		@Id
//	   	int id;
	    String author;
	    String title;
	    String content;
	    String description;
	    String publishedAt;
	    String url;
	    String urlToImage;
}
