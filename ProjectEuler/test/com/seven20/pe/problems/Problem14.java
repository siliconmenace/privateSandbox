package com.seven20.pe.problems;

/*
 * 

 //The following iterative sequence is defined for the set of positive integers:
 //
 //n → n/2 (n is even)
 //n → 3n + 1 (n is odd)
 //
 //Using the rule above and starting with 13, we generate the following sequence:
 //13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 //
 //It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 //
 //Which starting number, under one million, produces the longest chain?
 //
 //NOTE: Once the chain starts the terms are allowed to go above one million.

 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Test;

import com.seven20.utils.math.Collatz;
import com.seven20.utils.math.Collatz.CollatzValue;

public class Problem14 {

	@Test
	public void findLongestSequence_Full() {
		int longest = 0;
		int seqNum = 0;
		CollatzValue seq;

		for (int n = 500001; n <= 1000000; n += 2) {
			seq = new CollatzValue(n);
			if (longest < seq.getLength()) {
				seqNum = n;
				longest = seq.getLength();
			}

		}
		System.out.println(new CollatzValue(seqNum).toString());

	}

	@Test
	public void calcSequence() {
		CollatzValue seq = new CollatzValue(13);
		System.out.println(seq.toString());
	}

	@Test
	public void findLongestSequence_Lookup() {
		Map<Long, Long> seqPos = new HashMap<Long, Long>();
		LinkedList<Long> seq = new LinkedList<Long>();
		long temp = 0;
		long longestSeq = 0;
		long highestPos = 0;
		long lowestPos = 0;
		long pos = 0;
		Long term = null;
		for (int n = 500001; n < 1000000; n += 2) {
			temp = n;
			seq.addFirst(temp);
			while ((temp = Collatz.iterate(temp))> 1) {
				
				if (seqPos.containsKey(temp)) {
					seq.addFirst(temp);
					break;
				} else {
					seq.addFirst(temp);
				}
			}
			lowestPos= seq.pollFirst();
			 pos = seqPos.containsKey(lowestPos) ? seqPos.get(lowestPos)
					: 0;
			
			while( (term = seq.poll()) != null) {
				seqPos.put(term, ++pos);
				if (highestPos < pos) {
					highestPos = pos;
					longestSeq = n;
				}
			}

//			seq.clear();
		}

		System.out.println(longestSeq);
	}

	@Test
	public void findNextIteratation() {
		System.out.println(Collatz.iterate(80));
	}

	@Test
	public void showSequence() {
		
		LinkedList<Long> seq = new LinkedList<Long>();
		long n = 837799;
		seq.addFirst(n);
		while (n > 1) {
			n = Collatz.iterate(n);
			seq.add(n);
		}
		for (Long l : seq) {
			System.out.print(l + ", ");
		}
	}

}
