package com.bglabz.algorithms;

import java.util.Scanner;
import com.bridgelabz.functionalutil.FunctionalUtil;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class NumberGuess {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("guess a no between 0 to 63 ");
		int n = FunctionalUtil.getInt();

		try {
			System.out.println("guessed no is " + FunctionalUtil.find(n));

		} catch (Exception e) {
			System.out.println("enter correct input");
		}

	}
}
