package com.playerFullStack.player.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.playerFullStack.player.model.News;

@Service
public interface NewsService {
	public News saveNewsToFav(News news);
	public List<News> findAllNews();
}
