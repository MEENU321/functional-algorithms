package com.oopscommercial;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class RegexProgram {

	public static void main(String[] args) throws IOException {

		String sentance = " Hello <<name>>, We have your full name as <<name>> in our system."
				+ " your contact number is 91-<<xxxxxxxxxx>>" + " Please,let us know in case of any clarification "
				+ "Thank you BridgeLabz <<01/01/2016>>";

		System.out.println("original string:" + sentance);
		System.out.println("Enter name to replace with username:");
		String userName = FunctionalUtil.getstring();
		System.out.println("Enter mobilenum to replace with :");
		String mobilenum = FunctionalUtil.getstring();
		System.out.println("Enter date to be replace with :");
		String date = FunctionalUtil.getstring();
		System.out.println(replaceUserName(sentance, userName, mobilenum, date));
	}

	public static boolean replaceUserName(String sentance, String userName, String mobilenum, String date) {
		final String REGEX_USERNAME = "<<name>>";
		Pattern p = Pattern.compile(REGEX_USERNAME);
		Matcher m = p.matcher(sentance);
		String message = m.replaceFirst(userName);

		final String REGEX_NO = "<<xxxxxxxxxx>>";
		Pattern k = Pattern.compile(REGEX_NO);
		Matcher m1 = k.matcher(sentance);
		String message1 = m1.replaceFirst(mobilenum);

		final String REGEX_DATE = "<<01/05/2019>>";
		Pattern h = Pattern.compile(REGEX_DATE);
		Matcher m2 = p.matcher(sentance);
		String message11 = m2.replaceFirst(date);
		boolean y = replaceAll(sentance, m, m1, m2);

		return true;
	}

	private static boolean replaceAll(String rEGEX_NO, Matcher m1, Matcher m2, Matcher y) {
		// TODO Auto-generated method stub
		return true;
	}

}