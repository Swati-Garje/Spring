package com.lamda;

public class thread {
	static void myDisp() {
	try {
		for(int i=1;i<11;i++) {
			System.out.println(i);	
			Thread.sleep(2000);
		}
	}
	catch (Exception e) {
	}
	}

public static void main(String[] args) {	
	Runnable r = thread::myDisp;
	Thread t = new Thread(r);
	t.start();
	
}
}