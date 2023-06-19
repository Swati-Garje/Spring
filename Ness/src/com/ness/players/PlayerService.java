package com.ness.players;

public class PlayerService {

	public static void main(String[] args) {
		
		Player player1=new Player("rahul",1,"ambernath");
		Player player2=new Player("hrutik",2,"kalyan");
		Player player3=new Player("sahil",3,"kalyan");
		Player[] arr= {player1, player2, player3};
		Team team = new Team("teamA", arr);
		System.out.println(team);

	}

}
