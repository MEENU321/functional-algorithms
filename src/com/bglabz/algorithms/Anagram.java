package com.bglabz.algorithms;
import java.io.*;
import java.util.Arrays;
import java.util.Collection;

import com.bridgelabz.functionalutil.FunctionalUtil;
public class Anagram {
static boolean areAnagram(char[] s1,char[] s2) {
	int n1=s1.length;
	int n2=s2.length;
	if(n1!=n2)
		return false;
	Arrays.sort(s1);
	Arrays.sort(s2);
	for(int i=0;i<n1;i++)
	if(s1[i]!=s2[i])
	return false;
	return true;
}

	public static void main(String[] args) {
		//char str1[]= {'m','e','e','n','u'};
		//char str2[]= {'m','e','e','O','u'};
		System.out.println("Enter str1");
		String str1  = FunctionalUtil.getstring();
		System.out.println("Enter str2");
		String str2  = FunctionalUtil.getstring();

		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		if(areAnagram(s1,s2))
		
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");

	}

	
	

}
