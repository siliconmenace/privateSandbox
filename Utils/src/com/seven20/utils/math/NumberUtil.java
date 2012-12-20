package com.seven20.utils.math;

import java.math.BigInteger;

public class NumberUtil
{

	public static boolean isPalinDrome( double num )
	{
		return num == reverse( num );
	}
	
	public static boolean isPalinDrome(BigInteger num){
		return num.compareTo(  reverse(num) )==0 ? Boolean.TRUE : Boolean.FALSE;
	}
	
	public static BigInteger add(BigInteger num){
		return num.add(reverse( num ));
	}

	

	public static double reverse( double num )
	{
		double rev =0;
		double digits = Math.log10( num ); //Tells us how many digits are in the number
		for(int i= 0; i < digits ; i++){
			rev *=10; //Make room for the next digit...
			rev+=(num %10);//add in the next digit.  
			num /= 10;//Shift the digits to the right... 123/10 = 12
		}
		
		return rev;
		
	}
	
	public static BigInteger reverse(BigInteger num){
		return new BigInteger(new StringBuilder(num.toString()).reverse().toString());
		
	}

}
