package com.bglabz.algorithms;

import java.util.Arrays;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class Binarysearch {

	int binarySearch(int arr[], int x) {
		int l1 = 0, r1 = arr.length - 1;
		while (l1 <= r1) {
			int m = (l1 + (r1 - 1) / 2);
			if (arr[m] == x)
				return m;
			if (arr[m] < x) {
				l1 = m + 1;
			} else {
				r1 = m - 1;
			}

		}
		return -1;
	}

	public static void main(String args[]) {
		Binarysearch ob = new Binarysearch();
		System.out.println("Enter the no.of elements in array : ");
		int n = FunctionalUtil.getInt();

		int a[] = new int[n];
		System.out.println("Enter the elements in array : ");
		for (int i = 0; i < n; i++) {
			a[i] = FunctionalUtil.getInt();

		}
		Arrays.sort(a);
		System.out.println("Enter search element: ");
		int x = FunctionalUtil.getInt();
		int result = ob.binarySearch(a, x);
		if (result == -1)
			System.out.println("Element not present! ");
		else
			System.out.println("Element present" + "index" + result);
	}
}
