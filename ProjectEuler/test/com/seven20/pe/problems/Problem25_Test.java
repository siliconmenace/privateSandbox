package com.seven20.pe.problems;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import com.seven20.utils.math.Fibonacci;

public class Problem25_Test {

	@Test
	public void firstFibWith1000Digits() {
		BigInteger a = BigInteger.valueOf(5);
		BigInteger b = BigInteger.valueOf(8);
		BigInteger fib = null;
		while(String.valueOf(fib).length() <1000){
			fib = Fibonacci.nextFib(a, b);
			a = b;
			b= fib;
		}
		System.out.println(fib);
		assertEquals(1000, String.valueOf(fib).length());
		}
}
