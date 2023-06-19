package com.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PlayerCompare{
	static int myCompare(player o1,player o2){
		return o2.getName().compareTo(o1.getName()) ;
		
	}
}

public class lamda{
	
	public static void main(String[] args) {
		List<player> players=new ArrayList<>();
		
		player p1=new player("rohit", 45, "MI");
		player p2=new player("virat", 18, "RCB");
		player p3=new player("pandya", 17, "GT");
		player p4=new player("arjun", 50, "MI");

		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);

		
		Collections.sort(players, PlayerCompare::myCompare);

		players.forEach( (player)-> {
			System.out.println(player);
			}
		);

		
	}
}
