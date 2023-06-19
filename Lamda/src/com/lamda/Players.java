package com.lamda;

public class Players {

	private String name;
	private int id;
	private String team;
	private String role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Players(String name, int id, String team, String role) {
		super();
		this.name = name;
		this.id = id;
		this.team = team;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Players [name=" + name + ", id=" + id + ", team=" + team + ", role=" + role + "]";
	}
	
	
}
