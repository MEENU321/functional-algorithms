package com.bglabz.algorithms;

import java.util.Arrays;

import com.bridgelabz.functionalutil.FunctionalUtil;
public class MyInsertionSort2 {


	public static void main(String[] args) {
		  int i,j;
		  String key;
		  	System.out.println("Enter the no.of strings to be passed:");
			    	int n=FunctionalUtil.getInt();
			    	String[] Array=new String[n];

			    	for(int i1=0;i1<n;i1++) {
			    		  Array[i1]=   FunctionalUtil.getstring();}
			    	
			           

		 
		  System.out.println(Arrays.toString(Array));
		  for (j = 1; j < Array.length; j++) { 
		    key = Array[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(Array[i]) > 0) {
		        break;
		      }
		      Array[i + 1] = Array[i];
		      i--;
		    }
		    Array[i + 1] = key;
		    System.out.println(Arrays.toString(Array));
		  }
		  System.out.println(Arrays.toString(Array));
		}}
				