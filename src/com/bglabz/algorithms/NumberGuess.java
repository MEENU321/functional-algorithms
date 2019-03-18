package com.bglabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class NumberGuess {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("guess a no between 0 to 63 ");
		S.next();
		try {
			System.out.println("guessed no is " + find());
			
		} catch (Exception e) {
			System.out.println("enter correct input");
		}


	}
	

	static int find() {

		int low = 0, high = 63, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			Scanner r = new Scanner(System.in);
			int c = r.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}
}

			   