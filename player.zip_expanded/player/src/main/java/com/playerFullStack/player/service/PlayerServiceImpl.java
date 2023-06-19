package com.playerFullStack.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playerFullStack.player.dao.PlayerDao;
import com.playerFullStack.player.model.Player;

@Service
public class PlayerServiceImpl implements PlayerService{
	@Autowired
	PlayerDao playerDao;

	@Override
	public Player savePlayer(Player player) {
		player.setStatus("pending");
		player.setTeam("");
		playerDao.save(player);
		return player;
	}
	
	@Override
	public List<Player> findAllPlayer(){
		return playerDao.findAll();
	}

	@Override
	public List<Player> getPendingPlayer(String status){
		return playerDao.getPendingPlayer(status);
	}
	
	@Override
	public String allotPlayer(String email,String team) {
		playerDao.allotPlayer(email, team);
		return "Player alloted to team";
	}
	
	@Override
	public List<Player> playersByTeam(String team){
		return playerDao.playersByTeam(team);
	}

}
