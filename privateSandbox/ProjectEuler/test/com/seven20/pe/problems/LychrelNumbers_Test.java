package com.seven20.pe.problems;

/**
 *
Problem 55
If we take 47, reverse and add, 47 + 74 = 121, which is palindromic.

Not all numbers produce palindromes so quickly. For example,

349 + 943 = 1292,
1292 + 2921 = 4213
4213 + 3124 = 7337

That is, 349 took three iterations to arrive at a palindrome.

Although no one has proved it yet, it is thought that some numbers, like 196, never produce a palindrome.
 A number that never forms a palindrome through the reverse and add process is called a Lychrel number.
 Due to the theoretical nature of these numbers, and for the purpose of this problem, we shall assume that a number is Lychrel until proven otherwise.
 In addition you are given that for every number below ten-thousand, it will either
  (i) become a palindrome in less than fifty iterations, or, 
  (ii) no one, with all the computing power that exists, has managed so far to map it to a palindrome. In fact, 10677 is the first number to be shown to require over fifty iterations before producing a palindrome: 4668731596684224866951378664 (53 iterations, 28-digits).

Surprisingly, there are palindromic numbers that are themselves Lychrel numbers; the first example is 4994.

How many Lychrel numbers are there below ten-thousand?

NOTE: Wording was modified slightly on 24 April 2007 to emphasise the theoretical nature of Lychrel numbers.

 */

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import com.seven20.utils.math.NumberUtil;

public class LychrelNumbers_Test
{

	@Test
	public void testNumberReverse(){
		assertEquals(BigInteger.valueOf( 4321 ),NumberUtil.reverse(BigInteger.valueOf( 1234 )) );
	}	
	
	@Test
	public void testNumberReverseMaxInteger(){
		
		assertEquals(BigInteger.valueOf(7463847412l ), NumberUtil.reverse(BigInteger.valueOf(Integer.MAX_VALUE)));
	}
	
	@Test
	public void testReverseAddMaxInt(){
		assertEquals(BigInteger.valueOf( 9611331059l ), NumberUtil.add(BigInteger.valueOf(Integer.MAX_VALUE)));
	}
	
	@Test 
	public void testPalinDrome(){
		assertEquals(true, NumberUtil.isPalinDrome( BigInteger.valueOf( 9611331169l ) ));
	}
	
	@Test
	public void findLychrelNumbers(){
		int count = 0;
		BigInteger num = null;
		int iteration = 0;
		for(long i = 9999; i> 1; i--){
			num = BigInteger.valueOf(i);
			iteration  = 1;
			while(iteration <50 && !NumberUtil.isPalinDrome( num ) || (NumberUtil.isPalinDrome( num ) && iteration == 1)){
				num = NumberUtil.add( num );
//				System.out.println(num.toString());
				iteration++;
			}
			if(iteration ==50){
				count++;
				System.out.println("Found Lychrel Number: " + i + " in " + iteration + " iterations. Final value " + num.toString() );
			}else{
				System.out.println("Palindrome from " + i + " to " + num + " in " + iteration + " interations");
			}
		}
		System.out.println("Found " + count + " Lychrel Numbers");
	}
}
 