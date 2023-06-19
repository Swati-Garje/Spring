package com.ness.general;

public class Race{
	
	public static void main(String[] args) {
		Hare hare = new Hare();
		Thread hareThread = new Thread(hare);
		Tortise tortise= new Tortise();
		Thread tortiseThread = new Thread(tortise);
		
		tortiseThread.start();
		hareThread.start();
		
		while(true) {
			
			if(hareThread.isAlive()==false || tortiseThread.isAlive()==false) {
			if(hareThread.isAlive()==false) {
				System.out.println("===========hare won race========== ");
				break;
				
			}else {
				System.out.println("=========tortise won race======= ");
				break;
			}
			}
		}
		
	}
}
