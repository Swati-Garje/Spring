package com.playerFullStack.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playerFullStack.player.model.News;
import com.playerFullStack.player.model.Player;
import com.playerFullStack.player.service.NewsService;

@CrossOrigin
@RequestMapping("news")
@RestController
public class NewsController {
	@Autowired
	NewsService newsService;
	
	@PostMapping
	public ResponseEntity<News> savePlayer(@RequestBody News news) {
		News favNews = newsService.saveNewsToFav(news);
		return new ResponseEntity<News>(favNews,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<News>> getFavouriteNews(){	
			List<News> news = newsService.findAllNews();
			return new ResponseEntity<List<News>>(news,HttpStatus.ACCEPTED);
		}

}
