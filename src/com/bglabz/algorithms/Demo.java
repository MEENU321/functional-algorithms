package com.bglabz.algorithms;
import java.util.*;
import java.util.Map.Entry;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  Hashtable< String,Integer> ht = new Hashtable< String,Integer>();
		  ht.put("a",new Integer(100));
		  ht.put("b",new Integer(200));
		  ht.put("c",new Integer(300));
		  ht.put("d",new Integer(400));

		  Set st = ht.entrySet();
		  Iterator itr=st.iterator();
		  while(itr.hasNext())
		  {
		   Map.Entry m=(Map.Entry)itr.next();
		   System.out.println(((Entry) itr).getKey()+" "+((Entry) itr).getValue());
		  }
		 }
		}
	
