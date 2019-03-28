package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class DayofWeek {

	public static void main(String[] args) {

		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		System.out.println("day is" + FunctionalUtil.dayofWeek(d, m, y));
	}

}
