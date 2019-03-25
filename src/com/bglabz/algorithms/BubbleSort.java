package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class BubbleSort {

	
	    
	   
	    public static void main(String args[])
	    {
	        BubbleSort ob = new BubbleSort();
	        System.out.println("Enter the no.of elements in array : ");
			int n = FunctionalUtil.getInt();

			int a[] = new int[n];
			System.out.println("Enter the elements in array : ");
			for (int i = 0; i < n; i++) {
				a[i] = FunctionalUtil.getInt();}
	       
	        FunctionalUtil.bubbleSort(a);
	        System.out.println("Sorted array");
	        FunctionalUtil.display(a);
	    }
	}
