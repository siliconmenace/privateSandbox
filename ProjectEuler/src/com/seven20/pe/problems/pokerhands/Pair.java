package com.seven20.pe.problems.pokerhands;

import static com.seven20.pe.problems.pokerhands.HandRank.*;
import java.util.ArrayList;
import java.util.List;

public class Pair extends ScoreProcessor {

	@Override
	public HandValue handScore(Hand h) {
		List<Integer> values = new ArrayList<Integer>();
		HandValue hv = null;
		for(Card c : h.getCards()){
			if( values.contains(c.getValue())){
				hv = new HandValue(PAIR, c.getValue() * 2);
			}
		}
	 return hv;
	}
}
