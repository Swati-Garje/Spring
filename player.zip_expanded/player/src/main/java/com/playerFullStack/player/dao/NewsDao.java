package com.playerFullStack.player.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playerFullStack.player.model.News;

@Repository
public interface NewsDao extends JpaRepository<News, String>{

}
