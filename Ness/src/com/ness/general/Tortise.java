package com.ness.general;

public class Tortise implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				System.out.println("tortise is running");
				Thread.sleep(240);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("-----tortise completed race-----");

		
	}
	
}
