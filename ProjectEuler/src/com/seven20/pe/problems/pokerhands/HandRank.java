package com.seven20.pe.problems.pokerhands;

public enum HandRank {

	HIGHCARD(0),
	PAIR(1),
	TWOPAIR(2),
	THREEOFAKIND(3),
	STRAIGHT(4),
	FLUSH(5),
	FULLHOUSE(6),
	FOUROFAKIND(7),
	STRAIGHTFLUSH(8);
	
	public int value;
	
	private HandRank(int v){
		this.value = v;
	}
	
}
