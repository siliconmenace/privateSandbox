package com.seven20.pe.problems.pokerhands;

import java.util.HashMap;
import java.util.Map;

public enum Suit
{
	HEARTS,
	DIAMONDS,
	SPADES,
	CLUBS;
	
	
	private static Map<Integer, Suit> suitMap = new HashMap<Integer, Suit>();
	
	static{
		int i = 1;
		for(Suit suit : Suit.values()){
			suitMap.put( i++, suit );
		}
	}
	
	public static Suit get(int i){
		return suitMap.get( i );
	}
}
