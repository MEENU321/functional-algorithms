package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class InsertionSort3 {

	

		public static void main(String[] args){
		
			System.out.println("Enter the no.of strings to be passed:");
			int n=FunctionalUtil.getInt();
			String[] arr=new String[n];
			System.out.println("Enter the strings:");
			for(int i=0;i<n;i++) {
				  arr[i]=   FunctionalUtil.getstring();}

		
		String sortedArray[] = insertsort(arr, arr.length); 
		System.out.println("The sorted array:");
		for(int i=0;i<sortedArray.length;i++){
		System.out.println(sortedArray[i]);
		}
		}

		public static String[] insertsort(String array[], int f){
		String temp="";
		for(int i=0;i<f;i++){
		for(int j=i+1;j<f;j++){
		if(array[i].compareToIgnoreCase(array[j])>0){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
		}
		return array;
		}
		}

