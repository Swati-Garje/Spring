package com.ness.java;

import java.util.Comparator;

public class Sortbymatches implements Comparator<Match> {

	@Override
	public int compare(Match o1, Match o2) {
		return o2.getMatches() - o1.getMatches();
	}

}
