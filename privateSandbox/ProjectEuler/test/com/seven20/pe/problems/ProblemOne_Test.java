package com.seven20.pe.problems;

/*
 * Add all the natural numbers below one thousand that are multiples of 3 or 5.
 * 
 *If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemOne_Test {

	@Test
	public void returnMultiplesOfThreeOrFiveBelow1K() {

		int result = 0;
		for(Integer y : Multiples.get(999, 3, 5)){
			result+= y;
		}
		assertEquals(233168, result);
	}

}
