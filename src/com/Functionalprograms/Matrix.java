package com.Functionalprograms;

import java.util.Scanner;
import com.bridgelabz.functionalutil.FunctionalUtil;

//import com.bridgelabz.functionalutil.FunctionalUtil;
public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Matrix Rows");
		int r = FunctionalUtil.getInt();

		System.out.println("Enter The Number Of Matrix Columns");
		int c = FunctionalUtil.getInt();

		int[][] Matrix = new int[r][c];

		FunctionalUtil.enterMatrixData(FunctionalUtil.sc, Matrix, r, c);

		FunctionalUtil.printMatrix(Matrix, r, c);

	}
}
