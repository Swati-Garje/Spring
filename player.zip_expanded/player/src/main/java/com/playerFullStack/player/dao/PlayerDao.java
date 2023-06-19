package com.playerFullStack.player.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.playerFullStack.player.model.Player;

@Repository
public interface PlayerDao extends JpaRepository<Player, String>{
	
	@Query("from Player p where p.status= :status")
	public List<Player> getPendingPlayer(String status);
	
	@Transactional
	@Modifying
	@Query("update Player p set p.status='alloted', p.team=:team  where p.email= :email")
	public void allotPlayer(String email,String team);
	
	@Query("from Player p where p.team= :team")
	public List<Player> playersByTeam(String team);

}























