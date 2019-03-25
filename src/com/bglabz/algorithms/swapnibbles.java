package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;


class swapnibbles{  		    
    public static void main (String[] args)  
    { 
        System.out.println("Enter number");
        int n=FunctionalUtil.getInt();
     FunctionalUtil.toBinary(n); 
        System.out.println("");
FunctionalUtil.swapNibbles(n);
        System.out.println(FunctionalUtil.swapNibbles(n));
    } 
}


		  
		