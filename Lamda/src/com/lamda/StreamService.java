package com.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StreamService {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("aBc");
		list.add("moMa");
		list.add("dadd");
		list.add("abaa");
		
		System.out.println("contains cap : "+containsCap(list));
		System.out.println("all contains cap : "+allElementsContainsCaps(list));
		System.out.println("contains palindrome : "+containsPalindrome(list));
		System.out.println("first palindrome : "+getFirstPalindrome(list));
	
	//System.out.println("My Result  "+list.stream().anyMatch(element-> element.matches(".*[A-Z].*")));
	
	//	System.out.println("My Result all match "+list.stream().allMatch(element-> element.matches(".*[A-Z].*")));
		
	//	System.out.println("My Result  "+list.stream().anyMatch(element-> isSimplePalindrome(element) ));	
		
		Optional<String> optStr= list.stream().filter(element-> isSimplePalindrome(element)).findFirst();
		
		if(optStr.isPresent())
		System.out.println(optStr.get());
		else
			System.out.println("no palindrome found");
			
		
		
	}
	
	public static boolean containsCap(List<String> list) {
		String regex=".*[A-Z].*";

		List<String> newlist =list.stream().filter(element-> Pattern.compile(regex)
				.matcher(element).matches()).toList();

		if(newlist.size()==0) {
			return false;
		}else {
			return true;
		}
	
		
	
	}
	
	public static boolean allElementsContainsCaps(List<String> list) {
		String regex=".*[A-Z].*";
		List<String> newlist =list.stream().filter(element-> Pattern.compile(regex)
				.matcher(element).matches()).toList();
		if(newlist.size()==list.size()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean containsPalindrome(List<String>  list) {
		List<String> newlist =list.stream().filter(element-> isPalindrome(element)).toList();
//		System.out.println("palindrome "+newlist);
		if(newlist.size()==0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public static boolean isPalindrome(String str) {
		String rev="";
		String orgstr=str;
		 for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	     }
		 if(orgstr.equalsIgnoreCase(rev)) {
			 return true;
		 }else {
			 return false;
		 }
	}
	
	
	
	public static boolean isSimplePalindrome(String str) {
		
		StringBuilder sb=new StringBuilder(str);
		String rev=sb.reverse().toString();
		
		if(str.equalsIgnoreCase(rev))
			return true;
		else
			return false;
		
	}
	
	
	
	public static String getFirstPalindrome(List<String>list) {
		List<String> newlist =list.stream().filter(element-> isPalindrome(element)).toList();
		if(newlist.size()==0) {
			return "No palindrome found";
		}else
		return newlist.get(0);	
	}
	
	
	
	
	
	
}

















