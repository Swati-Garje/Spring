package com.ness.general;
public class Fibonacci {
	int a=0;
	int b=1;
	public static void main(String[] args) {
		
//		System.out.println(a);
//		System.out.println(b);
//		
//		NextDigit(a,b);

	}
	
	private static void NextDigit(int a, int b) {
		int count=0;
		if(count<8) {
			int c=a+b;
			a=b;
			b=c;
			//NextDigit();
		}
		
		
		
	}

}
