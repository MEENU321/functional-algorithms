package com.Functionalprograms;
import java.util.Scanner;

import com.bridgelabz.functionalutil.FunctionalUtil;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature less than 50 FH");
		double temperature=FunctionalUtil.doublemodel();
		System.out.println("Enter the wind speed greater than 3 m/s ");
		double speed=FunctionalUtil.doublemodel();

		System.out.println(FunctionalUtil.findingWindChill(temperature,speed));

		    }

		

	}


