package com.bglabz.algorithms;
import java.util.ArrayList;

import com.bridgelabz.functionalutil.FunctionalUtil;



public class PrimePalindromeAnagram {

	public static void main(String[] args) {
			    ArrayList<Integer> primenumbers = FunctionalUtil.primeNum();
		        FunctionalUtil.palindrome(primenumbers);
		        System.out.println();
		        System.out.println("numbers which are anagrams:");
		        ArrayList<Integer> primeAnagrams = FunctionalUtil.palindrome(primenumbers);
		        FunctionalUtil.primeAnagrams(primeAnagrams);
	}}

	
