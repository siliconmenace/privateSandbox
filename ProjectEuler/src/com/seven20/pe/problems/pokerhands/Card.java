package com.seven20.pe.problems.pokerhands;

public class Card implements Comparable<Card>
{

	private PlayingCards	card;
	private Suit			suit;

	public Card( int i, int j )
	{
		this.card = PlayingCards.get(i);
		this.suit = Suit.get(j);
	}

	@Override
	public int compareTo( Card c )
	{
		
		if ( card.value == c.getValue() && suit.equals( c.getSuit() ) )
		{
			return 0;
		} else if ( card.value > c.getValue() )
		{
			return 1;
		} else
		{
			return -1;
		}
	}

	public Suit getSuit()
	{
		return suit;
	}

	public int getValue()
	{
		return card.value;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append( card.name() ).append( " of " ).append( suit.name() );
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object _card){
		Card c = (Card) _card;
		return suit.equals( c.getSuit()) && card.value == c.getValue();
	}

}
