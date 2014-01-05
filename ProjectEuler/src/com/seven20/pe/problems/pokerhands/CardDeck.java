package com.seven20.pe.problems.pokerhands;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CardDeck
{
	public static final Integer	DECK_SIZE	= 52;
	private LinkedList<Card>	deck		= new LinkedList<Card>();

	private Random				rand		= new Random( System.currentTimeMillis() );

	public CardDeck()
	{

		for ( int s = 1; s <= 4; s++ )
		{
			for ( int v = 2; v <= 14; v++ )
			{
				deck.add( new Card( v, s ) );
			}
		}
	}

	public List<Card> deal( int i )
	{
		List<Card> deal = new ArrayList<Card>();
		while ( deal.size() < i && i <= DECK_SIZE )
		{
			deal.add( deck.remove( rand.nextInt( deck.size() ) ) );
		}
		return deal;

	}

	public int size()
	{
		return deck.size();
	}

	public Card dealTopCard()
	{
		return deck.remove( rand.nextInt( deck.size() ) );
	}

	public boolean hasCards()
	{
		return !deck.isEmpty();
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for ( Card card : deck )
		{
			sb.append( card ).append( ", " );
		}
		return sb.toString();
	}

	public Hand[] dealHands( int i, int j ) throws Exception
	{
		Hand[] hands = null;
		if ( i * j > 52 )
		{
			throw new Exception( "Not enough cards. Need " + i * j );
		}
		
		hands = new Hand[i];

		for ( int h = 0; h < i; h++ )
		{
			hands[h] = new Hand();
			for ( int s = 0; s < j; s++ )
			{
				hands[h].addCard( dealTopCard() );
			}
		}

		return hands;
	}

}
