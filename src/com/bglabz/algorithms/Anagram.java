package com.bglabz.algorithms;
import java.io.*;
import java.util.Arrays;
import java.util.Collection;

import com.bridgelabz.functionalutil.FunctionalUtil;
public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter str1");
		String str1  = FunctionalUtil.getstring();
		System.out.println("Enter str2");
		String str2  = FunctionalUtil.getstring();

		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		if(FunctionalUtil.areAnagrams(s1,s2))
		
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");

	}

}
