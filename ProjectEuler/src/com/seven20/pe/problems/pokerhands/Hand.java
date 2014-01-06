package com.seven20.pe.problems.pokerhands;

import java.util.ArrayList;
import java.util.List;

public class Hand
{
	private List<Card> cards = new ArrayList<Card>();

	public int size()
	{
		return cards.size();
	}

	public void addCard( Card card)
	{
		cards.add( card );
		
	}

	public List<Card> getCards()
	{
		//Needs to be unmodifiable
		return cards;
	}

	public List<HandValue> getScore()
	{
		return ScoreProcessor.scoreHand( this );
	}

}
