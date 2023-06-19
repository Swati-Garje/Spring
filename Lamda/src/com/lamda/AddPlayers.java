package com.lamda;
import java.util.ArrayList;
import java.util.Optional;

public class AddPlayers {
	public static void main(String[] args) {
//		Players p1 = new Players("Rahul",1,"AMB","Bowler");
//		Players p3 = new Players("Sahil",3,"KAL","Bowler");
//		Players p5 = new Players("Chaitya",5,"BAD","Bowler");
		Players p2 = new Players("Hrutik",2,"KAL","Batsman");
		Players p4 = new Players("Kunal",4,"AMB","Batsman");
		ArrayList<Players> playerlist= new ArrayList<Players>();
//		playerlist.add(p1);
//		playerlist.add(p5);
//		playerlist.add(p3);
		playerlist.add(p4);
		playerlist.add(p2);
		
		PrintResult(playerlist);
		
	}
	
	
	private static void PrintResult(ArrayList<Players> playersList) {
		Optional<ArrayList<Players>> BowlersList = getBowlers(playersList);
		if(BowlersList.isPresent()) {
			System.out.println(BowlersList);
		}else {
			System.out.println("No bowlers in players");
		}
		
	}


	public static Optional<ArrayList<Players>> getBowlers(ArrayList<Players> playerlist) {
		ArrayList<Players> bowlersList= new ArrayList<Players>();
		
		if(playerlist!=null){
			for(Players i : playerlist) {
				if(i.getRole().equalsIgnoreCase("Bowler")) {
					bowlersList.add(i);
				}
			}
			if(bowlersList.size()==0) {
				return Optional.empty();
			}
			else {
				return Optional.of(bowlersList);
			}
		}
		else {
			return Optional.empty();
		}
		
	}
}
