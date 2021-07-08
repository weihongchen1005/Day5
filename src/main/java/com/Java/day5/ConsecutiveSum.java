package com.Java.day5;

import java.util.Scanner;

public class ConsecutiveSum {

	public static int consecutiveSum(int a) {
		return ((a * (a + 1)) / 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer to find consecutive sum:");
		int a = sc.nextInt();
		System.out.print("Answer: " + consecutiveSum(a));
		sc.close();

	}

}
