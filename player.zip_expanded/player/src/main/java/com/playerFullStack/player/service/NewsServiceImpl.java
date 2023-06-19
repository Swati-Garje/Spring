package com.playerFullStack.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playerFullStack.player.dao.NewsDao;
import com.playerFullStack.player.model.News;

@Service
public class NewsServiceImpl implements NewsService{
	@Autowired
	NewsDao newsDao;
	
	@Override
	public News saveNewsToFav(News news) {
		newsDao.save(news);
		return news;
	}

	@Override
	public List<News> findAllNews() {
		return newsDao.findAll();
	}
}
