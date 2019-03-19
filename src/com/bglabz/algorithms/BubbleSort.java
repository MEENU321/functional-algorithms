package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class BubbleSort {

	
	    void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	 
	   
	    void display(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	   
	    public static void main(String args[])
	    {
	        BubbleSort ob = new BubbleSort();
	        System.out.println("Enter the no.of elements in array : ");
			int n = FunctionalUtil.getInt();

			int a[] = new int[n];
			System.out.println("Enter the elements in array : ");
			for (int i = 0; i < n; i++) {
				a[i] = FunctionalUtil.getInt();}
	       
	        ob.bubbleSort(a);
	        System.out.println("Sorted array");
	        ob.display(a);
	    }
	}
