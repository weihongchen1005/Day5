package com.Java.day5;

import java.util.Scanner;

public class MaxCharacter {

	public static int maxCharacter(String str) {
		int index = 0;
		int count = 1;
		int max = 0;
		str.trim();

		char currentMax = str.charAt(0);

		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				} else {
					if (count > max) {
						max = count;
						currentMax = str.charAt(i);
					}
				}
			}
			// resets temporary count back to 1 for each different character
			count = 1;
		}
		
		index = str.indexOf(currentMax);
		return index;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string for max character:");
		String str = sc.nextLine();
		System.out.print("The index of max character is: " + maxCharacter(str));
		sc.close();
	}

}
