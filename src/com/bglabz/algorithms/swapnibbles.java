package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;


class swapnibbles{  		    
    public static void main (String[] args)  
    { 
        System.out.println("Enter number");
        int n=FunctionalUtil.getInt();
        toBinary(n); 
        System.out.println("");

        System.out.println(swapNibbles(n));
    } 



		  
		public  static void toBinary(int n) 
		    { 
		    	     int[] binaryNum = new int[1000]; 
		   
		        
		        int i = 0; 
		        while (n > 0)  
		        { 
		            
		            binaryNum[i] = n % 2; 
		            n = n / 2; 
		            i++; 
		        } 
		   
		        
		        for (int j = i - 1; j >= 0; j--) 
		            System.out.print(binaryNum[j]); 
		    } 
		  public  static int swapNibbles(int x) 
		    { 
		        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
		    } 
		      
		    
		  }


	
