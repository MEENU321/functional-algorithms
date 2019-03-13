package com.Functionalprograms;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
//swaping two characters
	private static void swap(char[]ch,int i,int j) {
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	}
	//Recursive function to generate all permutations of a string
	private static void permutations(char[] ch,int currentIndex) {
		int n=ch.length;//here it is 2
		if(currentIndex==n-1) {
			System.out.println(String.valueOf(ch));
		}
	
	for(int i=currentIndex;i<n;i++) {
		swap(ch,currentIndex,i);
		permutations(ch,currentIndex+1);
		swap(ch,currentIndex,i);}}//restoring
		public static void main(String[] args) {
			String S="ABC";
			permutations(S.toCharArray(),0);
			
	}
		//iteration
	public static void permutations(String s)	
	{
		List<String>partial=new ArrayList<>();
		partial.add(String.valueOf(s.charAt(0)));
		for(int i=1;i<s.length();i++)
		{
			for(int j=partialsize()-1;j>=0;j--)
			{
				String str=partial.remove(j);
			for(int k=0;k<=str.length();k++) {
				partial.add(str.substring(0,k)+s.charAt(i)+str.substring(k));
			}
			}
		}
	}
	private static int partialsize() {
		// TODO Auto-generated method stub
		return 0;
	}

	}


