package com.ness.java;

import java.util.Comparator;

public class SortbyWickets implements Comparator<Match> {

	@Override
	public int compare(Match o1, Match o2) {
		return o2.getWickets() - o1.getWickets();
	}

}
