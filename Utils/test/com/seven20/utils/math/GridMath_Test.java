package com.seven20.utils.math;

import static org.junit.Assert.*;

import org.junit.Test;

import com.seven20.utils.enums.Direction;

public class GridMath_Test
{

	@Test
	public void returnPosZero()
	{
		int[] dim = new int[] { 4, 4 };
		assertEquals( 0, GridMath.getPos( 0, 0, dim ) );
	}

	@Test
	public void returnLastPos()
	{
		int[] dim = new int[] { 4, 4 };
		assertEquals( 15, GridMath.getPos( 3, 3, dim ) );
	}

	@Test
	public void return1x1Pos()
	{
		int[] dim = new int[] { 4, 4 };
		assertEquals( 5, GridMath.getPos( 1, 1, dim ) );
	}

	@Test
	public void return2x1Pos()
	{
		int[] dim = new int[] { 4, 4 };
		assertEquals( 9, GridMath.getPos( 2, 1, dim ) );
	}

	@Test
	public void return1x2Pos()
	{
		int[] dim = new int[] { 4, 4 };
		assertEquals( 6, GridMath.getPos( 1, 2, dim ) );
	}

	@Test
	public void return2x0Pos()
	{
		int[] dim = new int[] { 4, 4 };
		assertEquals( 8, GridMath.getPos( 2, 0, dim ) );
	}

	@Test
	public void return3x3Pos()
	{
		int[] dim = new int[] { 10, 5 };
		assertEquals( 33, GridMath.getPos( 3, 3, dim ) );
	}

	@Test
	public void return4x7Pos()
	{
		int[] dim = new int[] { 10, 5 };
		assertEquals( 47, GridMath.getPos( 4, 7, dim ) );
	}

	@Test
	public void returnVectorVertDown()
	{
		int[] expected = new int[] { 87, 107, 127, 147 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 7, 4, dim, Direction.VERTICAL_DOWN ) );
	}

	@Test
	public void returnVectorVertUp()
	{
		int[] expected = new int[] { 87, 67, 47, 27 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 7, 4, dim, Direction.VERTICAL_UP ) );
	}

	@Test
	public void returnVectorDiagDownRight()
	{
		int[] expected = new int[] { 87, 108, 129, 150 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 7, 4, dim, Direction.DIAG_DOWN_RIGHT ) );
	}

	@Test
	public void returnVectorDiagDownLeft()
	{
		int[] expected = new int[] { 87, 106, 125, 144 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 7, 4, dim, Direction.DIAG_DOWN_LEFT ) );
	}

	@Test
	public void returnVectorDiagUpRight()
	{
		int[] expected = new int[] { 87, 68, 49, 30 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 7, 4, dim, Direction.DIAG_UP_RIGHT ) );
	}

	@Test
	public void returnVectorDiagUpLeft()
	{
		int[] expected = new int[] { 87, 66, 45, 24 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 7, 4, dim, Direction.DIAG_UP_LEFT ) );
	}

	@Test
	public void returnVectorHorRight()
	{
		int[] expected = new int[] { 87, 88, 89, 90 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 7, 4, dim, Direction.HORIZONTAL_RIGHT ) );
	}

	@Test
	public void returnVectorHorLeft()
	{
		int[] expected = new int[] { 87, 86, 85, 84 };
		int[] dim = new int[] { 20, 20 };
		assertArrayEquals( expected, GridMath.getVector( 4, 1, 4, dim, Direction.HORIZONTAL_LEFT ) );
	}

	@Test
	public void returnIllegalArgumentException()
	{
		int[] dim = new int[] { 20, 20 };
		try
		{
			GridMath.getVector( 4, 7, 4, dim, Direction.HORIZONTAL );
			fail( "Expected IllegalArgumentException" );
		} catch( IllegalArgumentException e )
		{
			assertEquals( IllegalArgumentException.class, e.getClass() );

		}
	}

	@Test
	public void validateConstraintedVectorVertUp()
	{
		int[] dim = new int[] { 20, 20 };
		int[] vector = GridMath.getVector( 2, 7, 4, dim, Direction.VERTICAL_UP );
		assertEquals( false, GridMath.isWithinBoundaries( vector, dim ) );
	}
	
	@Test
	public void validateConstraintedVectorVertDown()
	{
		int[] dim = new int[] { 20, 20 };
		int[] vector = GridMath.getVector( 18, 12, 4, dim, Direction.VERTICAL_DOWN );
		assertEquals( false, GridMath.isWithinBoundaries( vector, dim ) );
	}


}
