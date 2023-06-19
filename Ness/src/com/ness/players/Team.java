package com.ness.players;

import java.util.Arrays;

public class Team{
	String teamName;
	Player[] player;
	
	public Team(String teamName, Player[] player) {
		super();
		this.teamName = teamName;
		this.player = player;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ",\n player=" + Arrays.toString(player) + "]";
	}
	
	
}
