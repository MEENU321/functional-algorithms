package com.bglabz.algorithms;

public class PrimeNumberUpto1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int num=0;
String primenumbers=" ";
for( i=1;i<=1000;i++) {
	int counter=0;
	//for( i=2;i<num/2;i++) {
		//if(number%i==0) {
	for(num=i;num>=1;num--)
	{
		if(i%num==0) {
			counter=counter+1;
		
		}
	}
	
if(counter==2)
{
	primenumbers=primenumbers+i+"  ";
}
}
System.out.println("The prime numbers from 1 to 1000 are : "  );
System.out.println(primenumbers);

	}
	}



