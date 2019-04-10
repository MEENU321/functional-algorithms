package com.Datastructures;

import com.bridgelabz.functionalutil4.Stack;

public class ParenthesisChecking {

	public static boolean paranthesisChecking(Stack stack, String exp) throws Exception {
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++) {
			char ch = exp.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(i);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				stack.pop();
			}
		}
		while (!stack.isStackEmpty()) {//if stack is not empty,unbalanced
			return false;
		}
		return true;//balanced
	}

}
