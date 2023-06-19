package com.lamda;

public class ConstructorRef {
	ConstructorRef() {
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
		NonstaticThread obj = new NonstaticThread();
		Runnable r = ConstructorRef::new;
		Thread t = new Thread(r);
		t.start();
		
	}
}
