package com.Java.day5;

import java.util.*;
public class Cake {

	/*
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		int sum = 0;
		int max = 0;
		for (int a : candles) {
			if (a == max) {
				sum++;
			} else if (a > max) {
				max = a;
				sum = 1;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> candles = new ArrayList<Integer>();
		candles.add(3);
		candles.add(3);
		candles.add(1);
		candles.add(2);
		
		System.out.print(birthdayCakeCandles(candles));
	}

}


