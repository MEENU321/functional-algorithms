package com.Datastructures;
 
import com.bridgelabz.functionalutil4.StackLogic;
import com.bridgelabz.functionalutil4.Utility;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println("Enter max size: ");
		int n=u.inputInteger();
	

		
		/* Creating Stack */
		StackLogic stack = new StackLogic(n);
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		 

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = u.inputString();        
		int len = exp.length();
	//	System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if ((ch == '(')||(ch=='{')||(ch=='['))
			{
			stack.push(i);
			}
				else if( (ch == ')')||(ch=='}')||(ch==']'))
				{
					try
					{
					long p = (stack.pop() + 1);
					//System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
				//System.out.println("balanced");
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}System.out.println("balanced");;
		while (!stack.isEmpty() )
		{
	//	System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
			System.out.println("unbalanced");
			break;
		}   

	}

}
