package com.ness.general;

public class Hare implements Runnable{
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("hare is running");
			try {
				Thread.sleep(140);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(i==90) {
				try {
					Thread.sleep(10400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("-----hare completed race-----");
		
	}
	
	
}
