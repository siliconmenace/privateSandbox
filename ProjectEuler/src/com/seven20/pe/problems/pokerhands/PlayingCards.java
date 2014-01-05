package com.seven20.pe.problems.pokerhands;

import java.util.HashMap;
import java.util.Map;

public enum PlayingCards
{
	ACE(14),
	KING(13),
	QUEEN(12),
	JACK(11),
	TEN(10),
	Nine(9),
	Eight(8),
	Seven(7),
	Six(6),
	Five(5),
	Four(4),
	Three(3),
	Two(2);
	
	public int value;
	
	private static Map<Integer, PlayingCards> cardMap = new HashMap<Integer, PlayingCards>();
	
	static{
		for(PlayingCards card : PlayingCards.values()){
			cardMap.put( card.value, card );
		}
	}
	
	private PlayingCards(int val){
		this.value = val;
	}

	public static PlayingCards get( int i )
	{
		return cardMap.get( i );
	}
}
