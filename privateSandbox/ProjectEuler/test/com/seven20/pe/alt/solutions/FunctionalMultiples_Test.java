package com.seven20.pe.alt.solutions;

import org.junit.Test;

public class FunctionalMultiples_Test
{

	final Conditional<Integer> modFive = new Conditional<Integer>(){
		public boolean validate(Integer arg){
			return arg % 5 == 0;
		}

		@Override
		public boolean f( int i, int j, int k )
		{
			// TODO Auto-generated method stub
			return false;
		}
	};
	
	final Conditional<Integer> modThree = new Conditional<Integer>(){
		public boolean validate(Integer arg){
			return arg % 3 == 0;
		}

		@Override
		public boolean f( int i, int j, int k )
		{
			// TODO Auto-generated method stub
			return false;
		}
	};
	
	final Conditional mod = new Conditional(){
		public boolean f(int arg, int mod, int result){
			return arg % mod == result;
		}

		@Override
		public boolean validate( Object arg )
		{
			// TODO Auto-generated method stub
			return false;
		}
	};

	
	@Test 
	public void testMod(){
		System.out.println(fizbuzz(mod.f(15, 3, 0),mod.f( 15, 5, 0)));
	}

	@Test
	public void testFizBuzz()
	{
		boolean a = modThree.validate( 15 );
		boolean b = modFive.validate( 15 );
		
		System.out.println(fizbuzz( a, b ));
	}

	private String fizbuzz( boolean a, boolean b )
	{
		return a && b ? "fizbuzz" : a ? "fiz" : b ? "buzz" : "nope";
	}
	
	
	@Test
	public void testFiz()
	{
		boolean a = modThree.validate( 9 );
		boolean b = modFive.validate( 9 );
		System.out.println(fizbuzz( a, b ));
	}
	
	@Test
	public void testBuzz()
	{
		boolean a = modThree.validate( 25 );
		boolean b = modFive.validate( 25 );
		System.out.println(fizbuzz( a, b ));
	}
	
	@Test
	public void testNope()
	{
		boolean a = modThree.validate( 7 );
		boolean b = modFive.validate ( 7 );
		System.out.println(fizbuzz( a, b ));
	}
	
}
