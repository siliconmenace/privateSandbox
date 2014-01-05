package com.seven20.pe.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Multiples {

	/**
	 * 
	 * @param int i natural number
	 * @param int j multiplier
	 * @return List<Integer> 
	 */

	public static List<Integer> get(int i, int j) {
		List<Integer> multiples = new ArrayList<Integer>();
		for(int x =1; x<=i; x++){
			if(x%j==0){
				multiples.add(x);
			}
		}
		return multiples;
	}
	
	/**
	 * 
	 * @param int i natural number
	 * @param int[] j  An array of multipliers
	 * @return Set<Integer> 
	 */
	public static Set<Integer> get(int i, int ... j){
		Set<Integer> multiples = new TreeSet<Integer>();
		for(int x : j){
			multiples.addAll(get(i, x));
		}
		return multiples;
	}
	
}
