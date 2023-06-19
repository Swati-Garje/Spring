package com.lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Country {
	
	public static boolean searchCountry(List<String> countries, String searchCountry) {
		if(countries.isEmpty() || countries==null || 
				searchCountry.isBlank() || searchCountry.isEmpty()) {
			return false;
		}
//		boolean check=countries.contains(searchCountry);
//		return check;
		String value=countries.stream().filter(country->country.equalsIgnoreCase(searchCountry))
				.findAny().orElse("false");
		if(value!="false") {
			return true;
		}else
			return false;
	}
	
	public static Optional<List<String>> sortCountries(List<String> countries) {
		if(countries.isEmpty() || countries==null) {
			return Optional.empty();
		}else {
		List<String> SortedCountries = countries.stream().sorted().collect(Collectors.toList());
		return Optional.of(SortedCountries);
		}
	}

	public static Set<String> getDistinctCountriesInUpperCaseSortedByLength(List<String> countries) {
//		Set<String> upperCaseList = new TreeSet<>();
		TreeSet<String> allCountry=countries.stream()
				.map(country->country.toUpperCase())
				.collect(Collectors.toCollection(()->new TreeSet<>(new CountrySort())));
		
//		Set<String> sortingCountry = new TreeSet<>((o1,o2)->{
//			if(o1.length()==o2.length()) {
//				return o1.compareTo(o2);
//			}else {
//				return o1.length()-o2.length();
//			}
//		});
//		for(String str: countries) {
//			sortingCountry.add(str.toUpperCase());
//		}
		return allCountry;		
	}
	
	public static String getCountryByCapital(Map<String, String> countries, String searchCapital) {
		if(countries.isEmpty() || countries==null || searchCapital=="" || searchCapital==" ") {
			return null;
		}
		 for (Map.Entry<String,String> entry : countries.entrySet()) 
		 {	
			if(entry.getValue().equalsIgnoreCase(searchCapital)) {
				return entry.getKey();
			}	
		 }
		 throw new CountryNotFoundException();
	}
	
	public static void main(String[] args) {
		List<String> countries= new ArrayList<String>();
		countries.add("India");
		countries.add("Japan");
		countries.add("China");
		countries.add("Indoneshia");
		countries.add("USA");
		String search="India";
		System.out.println(searchCountry(countries, search));
		System.out.println(sortCountries(countries));
		System.out.println(getDistinctCountriesInUpperCaseSortedByLength(countries));
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "New Delhi");
		countryMap.put("Japan", "Tokyo");
		countryMap.put("China", "Beijing");
		countryMap.put("Indoneshia", "Jakarta");
		countryMap.put("USA", "Washingtoni");
		System.out.println(getCountryByCapital(countryMap, "Tokyo"));
				
	}
	
}















