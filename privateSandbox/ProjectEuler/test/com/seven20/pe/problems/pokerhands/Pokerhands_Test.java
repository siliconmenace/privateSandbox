package com.seven20.pe.problems.pokerhands;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Pokerhands_Test
{

	@Test
	public void shouldCreateCardDeck()
	{
		CardDeck cd = new CardDeck();
		assertTrue( cd != null );
	}

	@Test
	public void shouldCreate52CardDeck()
	{
		CardDeck cd = new CardDeck();
		assertEquals( 52, cd.size() );
	}

	@Test
	public void shouldCreateUniqueDeck()
	{
		CardDeck cd = new CardDeck();
		List<Card> cards = new ArrayList<Card>();
		Card card = null;
		while ( cd.hasCards() )
		{
			card = cd.dealTopCard();
			assertFalse( cards.contains( card ) );
			cards.add( card );
		}
		// for(Card c: cards){
		// System.out.println(c);
		// }
	}

	@Test
	public void shouldDealFiveCards()
	{
		CardDeck cd = new CardDeck();
		List<Card> cards = cd.deal( 5 );
		assertEquals( 5, cards.size() );
		for ( Card c : cards )
		{
			System.out.println( c );
		}
	}

	@Test
	public void shouldDealAllCards()
	{
		CardDeck cd = new CardDeck();
		List<Card> cards = cd.deal( 52 );
		assertEquals( 52, cards.size() );
		for ( Card c : cards )
		{
			System.out.println( c );
		}
	}

	@Test
	public void shouldReturnAce()
	{
		assertEquals( PlayingCards.ACE, PlayingCards.get( 14 ) );
	}

	@Test
	public void shouldDealTwoHandsOf5Cards() throws Exception
	{
		CardDeck cd = new CardDeck();
		Hand[] hands = cd.dealHands( 2, 5 );
		int i = 1;
		for ( Hand h : hands )
		{
			System.out.println( "Hand: " + i++ );
			for ( Card c : h.getCards() )
			{
				System.out.println( c );
			}
		}
		
		assertTrue(hands.length == 2 && (hands[0].size() == 5 && hands[1].size() == 5) );
		assertEquals(42, cd.size());
	}
	
	
	@Test 
	public void shouldScoreHands() throws Exception{
		CardDeck cd = new CardDeck();
		Hand[] hands = cd.dealHands( 2, 5 );
		int i = 1;
		for ( Hand h : hands )
		{
			System.out.println( "Hand: " + i++ );
			for ( Card c : h.getCards() )
			{
				System.out.println(h.getScore().toString());
			}
		}
	}

}
