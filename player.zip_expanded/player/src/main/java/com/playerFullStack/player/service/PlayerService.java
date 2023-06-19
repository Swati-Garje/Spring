package com.playerFullStack.player.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.playerFullStack.player.model.Player;

@Service
public interface PlayerService {
	public Player savePlayer(Player player);
	public List<Player> findAllPlayer();
	public List<Player> getPendingPlayer(String status);
	public String allotPlayer(String email,String team);
	public List<Player> playersByTeam(String team);

}
