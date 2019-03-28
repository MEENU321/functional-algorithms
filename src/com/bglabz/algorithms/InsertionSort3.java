package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class InsertionSort3 {

	public static void main(String[] args) {

		System.out.println("Enter the no.of strings to be passed:");
		int n = FunctionalUtil.getInt();
		String[] arr = new String[n];
		System.out.println("Enter the strings:");
		for (int i = 0; i < n; i++) {
			arr[i] = FunctionalUtil.getstring();
		}

		FunctionalUtil.insertSort(arr, arr.length);
		String sortedArray[] = FunctionalUtil.insertSort(arr, arr.length);
		System.out.println("The sorted array:");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

}
