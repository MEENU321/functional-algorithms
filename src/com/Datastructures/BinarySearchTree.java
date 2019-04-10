package com.Datastructures;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class BinarySearchTree {
		/*
		* The main function is written to take input from the user
		* and to find how many binary search trees can be formed
		* from the entered number of nodes
		*/
	//Total number of possible Binary Search Trees with n different keys
	//(countBST(n)) = Catalan number Cn = (2n)!/(n+1)!*n!
		  public static void main(String[] args) { 
		        System.out.println("Enter the number of nodes");
		        int nodes=FunctionalUtil.getInt();
		        int[] intArr=new int[nodes];
		        for(int i=0;i<intArr.length;i++)
		        {
		        	System.out.println("Enter the "+i+" th number:");
		        	intArr[i]=FunctionalUtil.getInt();
		        }
		        double [] numbertimes=new double[intArr.length];
		        for(int i=0;i<intArr.length;i++)
		        {
		        	//Method 1- using function of Utility class of com.bridgelabz.util package
		        	numbertimes[i] = binaryCount(intArr[i]);
		        }
		         for(int i=0;i<numbertimes.length;i++)
		         {
		        	 System.out.println("Count of BST possibilities for "+  intArr[i] +" nodes is "+numbertimes[i]);
		         }
		} 

	
		
public static double binomialCoeff(double n, double k) {
	int res = 1;
    if (k > n - k) 
        k = n - k;  
	for (int i = 0; i < k; ++i) {
		res *= (n - i);
		res /= (i + 1);
	}
	return res;
}

public static double binaryCount(double n) {
	double c = binomialCoeff(2 * n, n);
	double count = c / (n + 1);
	return count;
}
}	
		      
	
		