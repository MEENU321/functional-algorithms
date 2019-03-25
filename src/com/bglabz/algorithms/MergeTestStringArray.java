package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class MergeTestStringArray {
	public static void main(String[] args) {
		System.out.println("Enter the no.of strings to be passed:");
		int n = FunctionalUtil.getInt();
		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = FunctionalUtil.getstring();
		}

		String[] sortedArray = FunctionalUtil.mergeSort(array);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}

	}
}
