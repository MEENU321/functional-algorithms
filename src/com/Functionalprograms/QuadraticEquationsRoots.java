package com.Functionalprograms;
import java.util.Scanner;


import com.bridgelabz.functionalutil.FunctionalUtil;
public class QuadraticEquationsRoots {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a: "); 
		double a= FunctionalUtil.doublemodel();
		System.out.println("Enter b: "); 
		 
		
		 
		double b=FunctionalUtil.doublemodel();

		System.out.println("Enter c: "); 
		double c= FunctionalUtil.doublemodel();


		
		FunctionalUtil.findingRoots(a,b,c);
		 
	        	        }
	    }
	

	