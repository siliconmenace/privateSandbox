package com.seven20.pe.problems.pokerhands;

public class HandValue {

	private HandRank rank;
	private int value;

	public HandValue(HandRank rank, int value) {
		this.rank = rank;
		this.value = value;
	}

	public HandRank getRank() {
		return rank;
	}

	public int getValue() {
		return value;
	}
	
	public String toString(){
		return rank + " : " + value; 
	}

}
