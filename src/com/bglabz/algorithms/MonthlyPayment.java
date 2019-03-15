package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the principal amount");
		double pr = FunctionalUtil.doublemodel();
		System.out.println("Enter the value of rate of interest ");
		double r = FunctionalUtil.doublemodel();
		System.out.println("Enter the no.of years ");
		double n = FunctionalUtil.doublemodel();

		System.out.println(FunctionalUtil.monthlyPayment(pr,r,n));

	}

}
