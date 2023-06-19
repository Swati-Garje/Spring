package com.ness.java;


public class Match implements Comparable<Object>{
	private int matches;
	private int runs;
	private int wickets;
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public Match(int matches, int runs, int wickets) {
		super();
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}
	@Override
	public String toString() {
		return "Match [matches=" + matches + ", runs=" + runs + ", wickets=" + wickets + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	
}
