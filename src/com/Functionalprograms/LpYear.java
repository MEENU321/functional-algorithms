package com.Functionalprograms;
import java.util.Scanner;

import com.bridgelabz.functionalutil.FunctionalUtil;

//import com.bridgelabz.functionalutil.FunctionalUtil;

public class LpYear{
	public static void main(String[] args){
		System.out.println("Enter an Year :: ");
		int year=FunctionalUtil.getInt();
	     		if(FunctionalUtil.findingLeapYear(year))
	     			System.out.println("Specified year is a leap year");
	     		else
	     			System.out.println("Specified year is not a leap year");
	   }
}