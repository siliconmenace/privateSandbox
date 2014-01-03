package com.seven20.utils.math;

import com.seven20.utils.enums.Direction;

public class GridMath
{

	public static int getPos( int i, int j, int[] dim )
	{
		int x = ( i * ( dim[0] ) );
		int y = j;
		return x + y;

	}

	public static int[] getConstrainedVector( int i, int j, int length, int[] dim, Direction direction )
	{
		int[] vector = getVector( i, j, length, dim, direction );
		if ( isWithinBoundaries( vector, dim ) )
		{
			return vector;
		}

		return null; // throw exception here.
	}
	

	public static boolean isWithinBoundaries( int[] vector, int[] dim )
	{
		int ya = vector[0] % dim[0];
		int yz = vector[vector.length-1] % dim[0];
		
		int xa = vector[1] / dim[1];
		int xz = vector[vector.length-1] / dim[1];
		
		
		int rangeY =ya - yz;
		int rangeX = xa - xz;
		
		int maxValue = (dim[0] * dim[1]) -1;
		
		if(rangeY > vector.length || rangeX > vector.length) {
			return Boolean.FALSE;
			//NOPE This needs check values:
		}else if((ya < 0 || ya > maxValue) || (xa < 0 || xa > maxValue) || (yz < 0 || yz > maxValue) || (xz < 0 || xz > maxValue)){
			return Boolean.FALSE;
		}
	
		return Boolean.TRUE;
	}

	public static int[] getVector( int i, int j, int length, int[] dim, Direction direction )
	{
		int[] vec = new int[length];
		int factor = 0;
		switch (direction)
		{
		case VERTICAL_UP:
			factor = -dim[1];
			break;
		case VERTICAL_DOWN:
			factor = dim[1];
			break;
		case HORIZONTAL_LEFT:
			factor = -1;
			break;
		case HORIZONTAL_RIGHT:
			factor = +1;
			break;
		case DIAG_UP_LEFT:
			factor = - ( dim[1] + 1 );
			break;
		case DIAG_UP_RIGHT:
			factor = -dim[1] + 1;
			break;
		case DIAG_DOWN_LEFT:
			factor = dim[1] - 1;
			break;
		case DIAG_DOWN_RIGHT:
			factor = dim[1] + 1;
			break;
		default:
			throw new IllegalArgumentException( "The direction is not a legal vector" );

		}

		vec[0] = getPos( i, j, dim );

		for ( int x = 1; x < length; x++ )
		{
			vec[x] = vec[x - 1] + factor;
		}
		return vec;
	}

}