package com.ness.java;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Matchservice {
public static void main(String[] args) {
		
		Match match1=new Match(3,150,6);
		Match match2=new Match(1,130,7);
		Match match3=new Match(2,50,3);
		Scanner sc = new Scanner(System.in);
		System.out.println("how to sort:");
		int choice =sc.nextInt();
		switch(choice){
		case 1: PriorityQueue<Match> list= new PriorityQueue<Match>(new Sort());
		list.offer(match1);
		list.offer(match2);
		list.offer(match3);
		
		while(!list.isEmpty())
		 {
			System.out.println(list.poll());
		 }
		break;
		
		case 2: 
			PriorityQueue<Match> list1= new PriorityQueue<Match>(new Sortbymatches());
			list1.offer(match1);
			list1.offer(match2);
			list1.offer(match3);
			
			while(!list1.isEmpty())
			 {
				System.out.println(list1.poll());
			 }
			break;
			
		case 3:
			PriorityQueue<Match> list2= new PriorityQueue<Match>(new SortbyWickets());
			list2.offer(match1);
			list2.offer(match2);
			list2.offer(match3);
			
			while(!list2.isEmpty())
			 {
				System.out.println(list2.poll());
			 }
			break;
		}
		


	}
}
