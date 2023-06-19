package com.lamda;

public class player {
	private String name;
	private int id;
	private String team;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public player(String name, int id, String team) {
		super();
		this.name = name;
		this.id = id;
		this.team = team;
	}
	@Override
	public String toString() {
		return "player [name=" + name + ", id=" + id + ", team=" + team + "]";
	}
	
	
}
