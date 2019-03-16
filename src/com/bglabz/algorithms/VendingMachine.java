package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Enter the amount:");
		int amount=FunctionalUtil.getInt();
		countofNotes(amount);
	}
	static int i,total;
	static int[] notes= {1000,500,100,50,10,5,2,1};
	static void countofNotes(int amount)
	{
		if(amount/notes[i]!=0) {
			total+=(amount/notes[i]);
			System.out.println(notes[i]+"rs notes:"+amount/notes[i]);
			amount=amount%notes[i];
			
		}i++;
		if(amount==0) {
			System.out.println("Total notes:"+total);
			return;
		}
		countofNotes(amount);
}}
