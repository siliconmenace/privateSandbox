package com.seven20.utils.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class Fibonacci {

	static final double phi = (1 + Math.sqrt(5)) / 2;
	static final double phidivisor = Math.pow(5, 0.5);
	static final BigInteger MINUS_ONE = BigInteger.valueOf(-1);
	static final BigInteger MINUS_TWO = BigInteger.valueOf(-2);
	static final BigDecimal phiBD = BigDecimal.valueOf(phi);
	static final BigDecimal phiDivBD = BigDecimal.valueOf(phidivisor);

	public static double numberAtPos(int pos) {
		return (Math.pow(phi, pos) / phidivisor);
	}

	public static double nextFib(double a, double b) {
		return a + b;

	}

	public static BigInteger nextFib(BigInteger a, BigInteger b) {
		return a.add(b);
	}

	public static BigInteger bigIntAtPos(BigInteger pos) {
		return pos.intValue() < 2 ? pos : bigIntAtPos(pos.subtract(MINUS_ONE))
				.add((bigIntAtPos(pos.subtract(MINUS_TWO))));
	}

	public static int intAtPos(int pos) {
		return pos < 2 ? pos : (intAtPos(pos - 1) + (intAtPos(pos - 2)));
		// return Double.valueOf(numberAtPos(pos)).intValue();
	}

	public static BigInteger bigIntAtPos(int pos) {
		BigDecimal a = phiBD.pow(pos).divide(phiDivBD, 4);
		String fib = a.toString();
		BigInteger result = null;
		if (a.scale() > 0) {
			BigDecimal tenth = BigDecimal.valueOf(Double.valueOf(fib.substring(
					(fib.indexOf(".")+1), (fib.indexOf(".") + 2))));
			if (tenth.intValue() >= 5) {
				a = a.add(BigDecimal.ONE);
			}
		}
		// BigDecimal b = a.divide(BigDecimal.valueOf(phidivisor),
		// BigDecimal.ROUND_HALF_UP);
		return a.toBigInteger();
	}

}
