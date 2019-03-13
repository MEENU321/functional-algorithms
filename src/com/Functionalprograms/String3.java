package com.Functionalprograms;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
String un=sc.next();
String msg="Hello,"+un+"how r u";
System.out.println(msg);
String pn=sc.next();
System.out.println(msg.replace(un,pn));


	}

}
