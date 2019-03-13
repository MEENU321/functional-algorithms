package com.Functionalprograms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class Factors {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int n = FunctionalUtil.getInt();

		FunctionalUtil.primeFactors(n);
	}

	
}