package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class SqrtofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value of x ");
double c=FunctionalUtil.doublemodel();
double t=c;
double epsilon=(1e-15);

while (Math.abs(t - c/t) > epsilon*t) {
    t = (c/t + t) / 2.0;
}
System.out.println(t);
	}

}
