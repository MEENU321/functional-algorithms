package com.Functionalprograms;
import com.bridgelabz.functionalutil.FunctionalUtil;
public class StringRegexReplace {
static String s4;
	public static void main(String[] args) {
		String sentance="Hello <<userName>>,How are you? <<xxxxxxxxxx"
				+ ">>,Date is <<01/01/2016>>";
		// TODO Auto-generated method stub
		System.out.println("original string:"+sentance);
		System.out.println("Enter name to replace with username:");
		String userName=FunctionalUtil.getstring();
		System.out.println("Enter number to replace with number:");
		String mobilenum=FunctionalUtil.getstring();
		System.out.println("Enter Date to replace with date:");
		String date=FunctionalUtil.getstring();
		
		System.out.println(FunctionalUtil.replaceUserName(sentance, userName, mobilenum, date));
	}

}
