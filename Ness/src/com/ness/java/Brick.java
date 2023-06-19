package com.ness.java;


class Blackbrick implements Runnable{
	public void run(){
		 synchronized(this) {
			 for(int i=0; i<10; i++) {
				 System.out.println("Blackbrick");
				 this.notify();
			 }	 
		 }
	}
}

public class Brick {
	public static void main(String[] args) {
		Blackbrick blackbrick= new Blackbrick();
		Thread blackbrickThread =new Thread(blackbrick);
		blackbrickThread.start();
		
		
		 for(int i=0; i<10; i++) {
			 synchronized (blackbrickThread) {
				 System.out.println("Redbrick");
				 try {
					 blackbrickThread.wait();
				 } 	catch (InterruptedException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
				 }
			 }	
		 }
	}
}
