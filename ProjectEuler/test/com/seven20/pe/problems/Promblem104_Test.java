package com.seven20.pe.problems;

import java.math.BigInteger;
import java.util.regex.Pattern;

import org.junit.Test;

import com.seven20.utils.math.Fibonacci;

public class Promblem104_Test {

	Pattern pattern = Pattern.compile("^(?!.*([1-9]).*\\1)[1-9]{9}$");
	static final BigInteger ONE = BigInteger.valueOf(1);

	@Test
	public void findFirstLastPandigital() {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger fib = null;
		String seq = null;
		String seqTail = null;
		int n = 1;
		String fibString = null;
		while (true) {
			fib = Fibonacci.nextFib(a, b);
			fibString = fib.toString();
//			System.out.println(fibString);
			if (fibString.length() >= 18) {
				seq = fibString.substring(0, 9);
				seqTail = fibString.substring((fibString.length() - 9),
						fibString.length());
				// System.out.println(seq + " " + seqTail);
				if (isPanDigit(seqTail, false)) {

					// && isPanDigit(seq, true)) {
					// System.out.println("Found only one:" + n + " -> " + seq);
					// seq = seq.substring((seq.length()-9),seq.length());
					System.out.println(n + ": checking head " + seq);
					System.out.println(fibString);
					if (isPanDigit(seq, true)) {
						System.out.println(fib);
						System.out.println(n);
						break;
					}
				}
			}
			a = b;
			b = fib;
			n++;
		}
	}

	private boolean isPanDigit(String seq, boolean pos) {
		if (Pattern.matches("^(?!.*([1-9]).*\\1)[1-9]{9}$", seq)) {
			System.out.println((pos ? "Head->" : "Tail->") + seq);
			return true;
		}
		return false;

	}
	
	
	@Test
	public void findFirstlastPanDigit2(){
		int n = 0;
		String seq = null;
		String seqTail = null;
		String fibString = null;
		BigInteger fib = null;
		while(true){
			fib = Fibonacci.bigIntAtPos(n++);
			fibString = fib.toString();
			System.out.println(fibString);
			if (fibString.length() >= 18) {
				seq = fibString.substring(0, 9);
				seqTail = fibString.substring((fibString.length() - 9),
						fibString.length());
				if (isPanDigit(seqTail, false)) {
					System.out.println(n + ": checking head " + seq);
					System.out.println(fibString);
					if (isPanDigit(seq, true)) {
						System.out.println(fib);
						System.out.println(n);
						break;
					}
				}
			}
			
		}
	}
}
