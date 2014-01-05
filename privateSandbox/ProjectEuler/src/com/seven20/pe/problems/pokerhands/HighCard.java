package com.seven20.pe.problems.pokerhands;

import static com.seven20.pe.problems.pokerhands.HandRank.*;

public class HighCard extends ScoreProcessor{

	@Override
	public HandValue handScore(Hand h) {
		int value = -1;
		for(Card c : h.getCards()){
			if(c.getValue() > value){
				value = c.getValue();
			}
		}
		return new HandValue(HIGHCARD, value);
	}
}
