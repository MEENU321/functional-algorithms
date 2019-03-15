package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class DayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		System.out.println("day is" +dayofWeek(d,m,y));
	}
public static int dayofWeek(int d,int m,int y)
{
	int yO=y-(14-m)/12;
	int x=yO+yO/4-yO/100+yO/400;
	int mO=m+12*((14-m)/12)-2;
    int dO=(d+x+(31*mO)/12)%7;
    return dO;
}
}
