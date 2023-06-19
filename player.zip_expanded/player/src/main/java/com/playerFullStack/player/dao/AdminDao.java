package com.playerFullStack.player.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playerFullStack.player.model.Admin;
import com.playerFullStack.player.model.Player;

@Repository
public interface AdminDao extends JpaRepository<Admin, String>{
	public Admin findByUsernameAndPassword(String username, String password);
}
