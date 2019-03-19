package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class BubbleSortArray {

	
		 public static void main(String[] args) {
		   
		        String temp;

		        System.out.print("Enter number of  strings : ");
		        int n=FunctionalUtil.getInt();
		        String[] t1=new String[n];
		        System.out.println("Enter strings:");
		   for(int i=0;i<n;i++) {
			   t1[i]=FunctionalUtil.getstring();
		   }
                    for (int t = 0; t < t1.length - 1; t++) {
		            for (int i= 0; i < t1.length - t -1; i++) {
		                if(t1[i+1].compareTo(t1[i])<0) {
		                    temp = t1[i];
		                    t1[i] = t1[i + 1];
		                    t1[i + 1] = temp;
		                }
		            }
		        }
		        for (int i = 0; i < t1.length; i++) {
		            System.out.println(t1[i]);
		        }
		   }
		
		
	}