package com.seven70.mct.enumerators;

public enum Signals {
	DOT('.'), DASH('-');
		
	private char symbol;
	
	private Signals(char symbol){
		this.symbol = symbol;
	}
	
	public char getSymbol(){
		return symbol;
	}

}
