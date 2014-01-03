package com.seven20.pe.problems;

import com.seven20.utils.enums.Direction;
import com.seven20.utils.math.GridMath;

public class Grid
{
	private int[] values;
	private int[] dim;
	
	
	
	public Grid(int[] values, int x, int y){
		this.values = values;
		dim = new int[]{x, y};
	}
	
	
	public int[] getDimensions()
	{
		return dim;
	}
	

	public int getGridPos( int i, int j )
	{
		return GridMath.getPos(i, j, dim);
	}


	public int getValueAtPos( int i, int j )
	{
		return values[getGridPos( i, j )];
	}


	public int[] getAdjacent( int i, int j, int length, Direction direction )
	{
		return GridMath.getVector( i, j, length, dim, direction );
	}
	
	
}
