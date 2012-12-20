package com.seven20.utils.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class Fibonacci_Test {

	@Test
	public void returnZeroPosition(){
		assertEquals(0.0, Fibonacci.numberAtPos(0), 0.5);
	}
	
	@Test
	public void returnSixthPosition(){
		assertEquals(8.0, Fibonacci.numberAtPos(6), 0.5);
	}
	
	@Test
	public void return21Position(){
		assertEquals(10946, Fibonacci.numberAtPos(21), 0.5);
	}

}
