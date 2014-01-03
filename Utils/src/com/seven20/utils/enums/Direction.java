package com.seven20.utils.enums;

public enum Direction
{
	VERTICAL(1), HORIZONTAL(2), DIAGONAL(4), LEFT(8), RIGHT(16), UP(32), DOWN(64),
	VERTICAL_UP(getVector(VERTICAL,UP)),
	VERTICAL_DOWN(getVector(VERTICAL,DOWN)),
	HORIZONTAL_LEFT(getVector( HORIZONTAL, LEFT)),
	HORIZONTAL_RIGHT(getVector(HORIZONTAL, RIGHT)),
	DIAG_UP_LEFT(getVector(DIAGONAL, UP, LEFT)),
	DIAG_DOWN_LEFT(getVector(DIAGONAL, DOWN, LEFT)),
	DIAG_UP_RIGHT(getVector(DIAGONAL, UP, RIGHT)),
	DIAG_DOWN_RIGHT(getVector(DIAGONAL, DOWN, RIGHT));
	
	public int vector;
	
	private Direction(int i){
		vector = ( byte ) i;
	}
	

	public static int  getVector(Direction direction){
		return  direction.vector ;
	}
	
	
	private static int  getVector(Direction d1, Direction d2){
		return  d1.vector + d2.vector ;
	}
	
	private static int  getVector(Direction d1, Direction d2, Direction d3){
		return d1.vector + d2.vector + d3.vector;
	}
	
}
