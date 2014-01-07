package com.seven20.pe.problems.pokerhands;

import static com.seven20.pe.problems.pokerhands.HandRank.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreProcessor
{

	private static final class HighCard  {
		public static HandValue score( List<Card> temp )
		{
			int value = -1;
			for ( Card c : temp)
			{
				if ( c.getValue() > value )
				{
					value = c.getValue();
				}
			}
			return new HandValue(HIGHCARD, value);
		}
	}

	private static final HandScore	pair		= new HandScore()
												{
													public HandValue score( Hand h )
													{
														Map<Integer, Card> cardMap = new HashMap<Integer, Card>();
														List<Card> temp = new ArrayList<Card>(h.getCards());
														HandValue hv = null;
														for ( Card c : h.getCards() )
														{
															if ( cardMap.containsKey( c.getValue() ) )
															{
																hv = new HandValue( PAIR, c.getValue() );
																temp.remove(c);
																temp.remove(cardMap.get(c.getValue()));
																hv.setHighCard(HighCard.score(temp));
																break;
															}else{
																cardMap.put( c.getValue(), c );
															}
														}
														
														return hv;
													}
												};


	private static List<HandScore>	handScores	= new ArrayList<HandScore>();

	static
	{
		handScores.add( pair );
	}

	public static List<HandValue> scoreHand( Hand h )
	{
		List<HandValue> hv = new ArrayList<HandValue>();
		HandValue temp = null;
		for ( HandScore hs : handScores )
		{
			temp = hs.score( h );
			hv.add( temp != null ? temp : HighCard.score(h.getCards()) );
		}
		return hv;
	}

}
