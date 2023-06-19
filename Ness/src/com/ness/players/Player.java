package com.ness.players;

public class Player {
	String playerName;
	int playerId;
	String teamName;
	
	public Player(String playerName, int playerId, String teamName) {
		super();
		this.playerName = playerName;
		this.playerId = playerId;
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerId=" + playerId + ", teamName=" + teamName + "]\n";
	}
	
	
}
