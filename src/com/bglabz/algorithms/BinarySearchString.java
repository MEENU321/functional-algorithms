package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class BinarySearchString { 
	static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
           
            if (res == 0) 
                return m; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        return -1; 
    } 
		  
		    
		  
		    public static void main(String []args) 
		    { System.out.println("Enter the no.of strings to be passed:");
	    	int n=FunctionalUtil.getInt();
	    	String[] arr=new String[n];
	    	System.out.println("Enter the strings :");

	    	for(int i=0;i<n;i++) {
	    		  arr[i]=   FunctionalUtil.getstring();}
	    	
	            
	    	System.out.println("Enter  strings to be searched :");
		        String x = FunctionalUtil.getstring();
		        int result = binarySearch(arr, x); 
		  
		        if (result == -1) 
		            System.out.println("Element not present"); 
		        else
		            System.out.println("Element found at "
		                              + "index " + result); 
		    } 
		 

	}


