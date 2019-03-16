package com.bglabz.algorithms;

		

import com.bridgelabz.functionalutil.FunctionalUtil;
		public class MyInsertionSort2 

		{
		    public static void main(String[] args) 
		    { 
		    	System.out.println("Enter no of Strings  need to pass");
				int n=FunctionalUtil.getInt();
				String[] arr=new String[n];
				for(int i=0;i<arr.length;i++) {
					System.out.println("Enter the input at index" +i+":");
					arr[i]=FunctionalUtil.getstring();
				}insertionSort(arr); System.out.println(arr);
				}
		  public static String[] insertionSort(String[] arr) {
			 int  i,j;
			 String  key,temp;
			  for(i=1;i<arr.length;i++) {
				  key=arr[i];
				  j=i-1;
				  while((j>=0)&&arr[i].compareToIgnoreCase(arr[j])>0) {
					  temp=arr[j];
					  arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 j--;
				  }
			  }
			  
			return arr;
		//  }
		 // System.out.println(arr);
}
		  }