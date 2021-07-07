package com.Java.day5;

import java.util.Scanner;

public class Palindrome {

	public static boolean palindrome(String str) {
		
		str.trim();
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(str.length() - 1 - i) != str.charAt(i)) {
				return false;
			}
		}
		
		return true;
		//O(n) Big O runtime	
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string to check for palindrome:");
		String str = sc.nextLine();
		System.out.print("Is this a palindrome: " + palindrome(str));
		sc.close();

	}

}
