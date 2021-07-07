package com.Java.day5;

import java.util.Stack;

public class MatchingParenthesis {

	// two way of solving this problem
	// #1 use stacks, if all stacks are cleared, it is matching parenthesis
	// #2 count the number of open different types of open parenthesis {{(([<, that
	// means the number closing parenthesis should be the same as well

	// #1 use counts
	public static boolean matchParenthesis(String str) {
		int count1, count2, count3, count4; // count1 = '{' count2= '[' count3 == '(' count4 = '<'
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '{' || c == '[' || c == '(' || c == '<') {
				switch (c) {
				case '{':
					count1++;

				case '[':
					count2++;

				case '(':
					count3++;

				case '<':
					count4++;
				}
			}
			if (c == '}' || c == ']' || c == ')' || c == '>') {
				switch (c) {
				case '}':
					count1--;
				case ']':
					count2--;
				case ')':
					count3--;
				case '>':
					count4--;
				}
			}
		}

		if (count1 == 0 && count2 == 0 && count3 == 0 && count4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// #2 Stacks
	public static boolean matchParenthesis2(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '{' || c == '[' || c == '(' || c == '<') {
				stack.push(c);
			}
			if (c == '}' || c == ']' || c == ')' || c == '>') {
				char tmp;
				switch (c) {
				case '}':
					tmp = stack.pop();
					if (tmp != '{') {
						return false;
					}
					break;
				case ']':
					tmp = stack.pop();
					if (tmp != '[') {
						return false;
					}
					break;
				case ')':
					tmp = stack.pop();
					if (tmp != '(') {
						return false;
					}
					break;
				case '>':
					tmp = stack.pop();
					if (tmp != '<') {
						return false;
					}
					break;
				}
			}

			if (stack.isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "[2*(1+3)]";
		String b = "(((()))";
		System.out.println(matchParenthesis(s));
		System.out.println(matchParenthesis2(s));
		System.out.println(matchParenthesis(b));
		System.out.println(matchParenthesis2(b));

	}

}
