package com.seven20.pe.problems;

import com.seven20.utils.math.Collatz.CollatzValue;
import com.stopwatch.StopWatch;

public class FindLongestCollatz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		
		int longest = 0;
		int seqNum = 0;
		CollatzValue seq;
		sw.start();
		for (int n = 500001; n <= 1000000; n += 2) {
			seq = new CollatzValue(n);
			if (longest < seq.getLength()) {
				seqNum = n;
				longest = seq.getLength();
			}

		}
		sw.stop();
		System.out.println(new CollatzValue(seqNum).toString());

		System.out.println(sw.getElapsedTime());
	}

}
