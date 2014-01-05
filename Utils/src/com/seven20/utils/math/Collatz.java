package com.seven20.utils.math;

import java.util.LinkedList;

public class Collatz {

	public static int length(long n) {
		int length = 0;

		while (n > 1) {
			n = iterate(n);
			length++;
		}
		return length;
	}

	public static LinkedList<Long> sequence(long n) {
		LinkedList<Long> sequence = new LinkedList<Long>();
		sequence.add(n);
		while (n > 1) {
			n = iterate(n);
			sequence.add(n);
		}
		return sequence;
	}

	public static long iterate(long n) {
		return n % 2 == 0 ? n / 2 : (3 * n) + 1;
	}

	public static class CollatzValue {
		private long n;
		private LinkedList<Long> sequence;

		public CollatzValue(long n) {
			this.n = n;
			this.sequence = sequence(n);
		}

		public LinkedList<Long> getSequence() {
			return sequence;
		}

		public int getLength() {
			return sequence.size();
		}

		public Long getNumber(){
			return n;

		}
		
		public String toString(){
			return "Number: " + n + " Length: " + getLength() + "\n" + sequence;
		}
	}
	
	
}
