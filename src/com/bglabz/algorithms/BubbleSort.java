package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class BubbleSort {

	
	    
	   
	    public static void main(String args[])
	    {
	      //  BubbleSort ob = new BubbleSort();
	        System.out.println("Enter the no.of elements in array : ");
			int size = FunctionalUtil.getInt();

			int a[] = new int[size];
			System.out.println("Enter the elements in array : ");
			for (int i = 0; i < size; i++) {
				a[i] = FunctionalUtil.getInt();}
	       
	        FunctionalUtil.bubbleSort(a);
	        System.out.println(a);
	  //      FunctionalUtil.display(a);
	    }
	}
