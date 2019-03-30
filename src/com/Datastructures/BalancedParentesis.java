package com.Datastructures;

import com.bridgelabz.functionalutil.FunctionalUtil;
import com.bridgelabz.functionalutil4.Stack;

public class BalancedParentesis {
	
		public static void main(String[] args) throws Exception {
			System.out.println("Enter max size: ");
			int n = FunctionalUtil.getInt();

			
			Stack stack = new Stack(n);
			
			System.out.println("Enter expression: ");
			String exp = FunctionalUtil.getstring();
			System.out.println(ParenthesisChecking.paranthesisChecking(stack, exp));

	
			}

		}

	
