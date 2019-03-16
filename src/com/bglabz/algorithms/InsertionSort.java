package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Enter no of Strings  need to pass");
		int n=FunctionalUtil.getInt();
		String[] arr=new String[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the input at index" +i+":");
			arr[i]=FunctionalUtil.getstring();
		}}
	public static void insertionsort(int arr[]) {
		int n=arr.length;
		for(int j=1;j<n;j++) {
			int key=arr[j];
			int i=j-1;
			while((i>-1)&&(arr[i]>key))
			{
				arr[i+1]=arr[i];i--;
			}
	arr[i+1]=key;
	System.out.println(arr);
	}
		
	}
}


