package com.bglabz.algorithms;

import java.io.*;

import com.bridgelabz.functionalutil.FunctionalUtil;

class toBinary {

	static void decToBinary(int n) {

		int[] binaryNum = new int[1000];

		int i = 0;
		while (n > 0) {

			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	public static void main(String[] args) {
		System.out.println("Enter number");
		int n = FunctionalUtil.getInt();
		decToBinary(n);
	}
}
