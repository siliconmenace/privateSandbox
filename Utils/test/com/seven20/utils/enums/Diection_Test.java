package com.seven20.utils.enums;

import static org.junit.Assert.*;
import static com.seven20.utils.enums.Direction.*;

import org.junit.Test;

public class Diection_Test
{

	@Test
	public void testVertAndDownTest()
	{
		assertEquals(128, VERTICAL_DOWN.vector);
	}
	
	@Test
	public void showDirectionVectors(){
		for(Direction d : Direction.values()){
			System.out.println(d + "->" + d.vector);
		}
				
	}
	
//	@Test
//	public void testVertAndUpTest()
//	{
//		assertEquals(64, Direction.getVector(VERTICAL, UP));
//	}
//	
//	@Test	public void testVertAndLeft()
//	{
//		assertEquals(0, Direction.getVector(VERTICAL, LEFT));
//	}
//	
//	@Test
//	public void testHorizAndLeft()
//	{
//		assertEquals(0, Direction.getVector(HORIZONTIAL, LEFT));
//	}
//	
//	@Test
//	public void testDiagLeftDown()
//	{
//		assertEquals(0, Direction.getVector(DIAGONAL, LEFT, DOWN));
//	}
//	
	

}
