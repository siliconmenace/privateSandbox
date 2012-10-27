package com.seven70.mct.enumerators;

import static org.junit.Assert.*;

import org.junit.Test;

public class MorseCodeTest {

	@Test
	public void shouldReturnSOS(){
		String message = "SOS";
		String expectedResult = "... --- ...";
		
		assertTrue(expectedResult.equals(decode(message)));
		System.out.println(decode(message));
		
	}
	
	@Test
	public void shouldReturnJerry(){
		String message = "Jerry";
		String expectedResult = ".--- . .-. .-. -.--";
		assertTrue(expectedResult.equals(decode(message)));
		System.out.println(decode(message));
	}
	
	@Test
	public void shouldReturnFoxMessage(){
		String message = "The quick brown fox jumps over the lazy dog";
		String expectedResult = "- .... .  --.- ..- .. -.-. -.-  -... .-. --- .-- -.  ..-. --- -..-  .--- ..- -- .--. ...  --- ...- . .-.  - .... .  .-.. .- --.. -.--  -.. --- --.";
		assertTrue(expectedResult.equals(decode(message)));
		System.out.println(decode(message));
	}
	
	private String decode(String message){
		return MorseCode.translate(message);
	}
}
