package com.seven20.pe.problems.pokerhands;

import static com.seven20.pe.problems.pokerhands.HandRank.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreProcessor
{

	private static final HandScore	pair		= new HandScore()
												{
													public HandValue score( Hand h )
													{
														Map<Integer, Card> cardMap = new HashMap<Integer, Card>();
														for ( Card c : h.getCards() )
														{
															if ( cardMap.containsKey( c.getValue() ) )
															{
																return new HandValue( PAIR, c.getValue() );
															}else{
																cardMap.put( c.getValue(), c );
															}
														}
														return null;
													}
												};

	private static final HandScore	highCard	= new HandScore()
												{
													public HandValue score( Hand h )
													{
														int value = -1;
														for ( Card c : h.getCards() )
														{
															if ( c.getValue() > value )
															{
																value = c.getValue();
															}
														}
														return new HandValue( HIGHCARD, value );
													}
												};
	private static List<HandScore>	handScores	= new ArrayList<HandScore>();

	static
	{
		handScores.add( pair );
		handScores.add( highCard );

	}

	public static List<HandValue> scoreHand( Hand h )
	{
		List<HandValue> hv = new ArrayList<HandValue>();
		for ( HandScore hs : handScores )
		{
			hv.add( hs.score( h ) );
		}
		return hv;
	}

}
