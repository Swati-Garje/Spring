package com.lamda;
import java.util.ArrayList;
import java.util.Optional;

public class Ass1 {
	
	public static Optional<ArrayList<Integer>> getEventList(ArrayList<Integer> numberList) {
		ArrayList<Integer> EvenNoList = new ArrayList();
		if(numberList!=null) {
			for (int i:numberList) {	            
	            if(i % 2==0) {
	            	EvenNoList.add(i);
	            }
	    	}
		if(EvenNoList.size()==0) {
			return Optional.empty();
		}else {	
		return Optional.of(EvenNoList);
		}
		}else {
			return Optional.empty();
		}
	}

	private static void Printresult(ArrayList<Integer> numberList) {
		Optional<ArrayList<Integer>> EvenNoList = getEventList(numberList);
		if(EvenNoList.isPresent()) {
			System.out.println(EvenNoList);
		}else {
			System.out.println("No even numbers");
		}
	}
		
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList();
		numberList.add(3);	
		Printresult(numberList);
	}	
}
