package com.bridgelabz.functionalutil;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.Functionalprograms.Factors;

public class FunctionalUtil2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int integermodel()
	{
		return sc.nextInt();
	}
	public static String getstring()
	{
		return sc.next();
	}
	

//prime factors 
	 
	 public static void primeFactors(int n) {
				for (int i = 2; i <=n; i++) {
			while (n % i == 0) {
				System.out.println(i + "");
				n = n / i;
			}
		}
		//sc.close();
	}
	
	public static double doublemodel()
	{
		return sc.nextDouble();
	}
	//Gambler
	public static void gamblerGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stake or cash " );
		double c = sc.nextDouble();
		System.out.println("Enter goal " );
		double g = sc.nextDouble();
		System.out.println("Enter trial " );
		double tr = sc.nextDouble();
		int bets=0;//no.of bets made
		int wins=0;
		int loss=0;//no.of games won
		//repeat trials times
		for(int t=0;t<tr;t++) {
			while(c>0&&c<g)
			{
				bets++;
				if(Math.random()<0.5) {
					c++;wins++;}
				else 
					c--;loss++;
			}if(c==g)
				wins++;
		}
        System.out.println(wins + " wins of " + tr);
        System.out.println("Percent of games won = " + 100.0 * wins / tr);
        System.out.println("Avg # bets           = " + 1.0 * bets / tr);

		
	
//finding leap year
	}
public static void findingLeapYear(int year) {

  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
     System.out.println("Specified year is a leap year");
 else
     System.out.println("Specified year is not a leap year");

}
//quadratic equation
public static void findingRoots(double a,double b,double c) {
double root1, root2;
Scanner sc=new Scanner(System.in);


    //  double a = 2, b = 4, c = 5;


double delta = b * b - 4 * a * c;
//  for real and different roots
if(delta > 0) {
    root1 = (-b + Math.sqrt(delta)) / (2 * a);
    root2 = (-b - Math.sqrt(delta)) / (2 * a);

    System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
}
// for real and equal roots
else if(delta == 0) {
    root1 = root2 = -b / (2 * a);

    System.out.format("root1 = root2 = %.2f;", root1);
}
// If roots are not real
else {
    double v = -b / (2 *a);
    double u = Math.sqrt(-delta) / (2 * a);

    System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", v, u, v, u);
}}




//finding eucleadian distance

public static double findDis(int x,int y)
{
//Scanner sc = new Scanner(System.in);
double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
return d;
}
//windchill
public static double findingWindChill(double temperature, double speed) {
double windchill=32.74+0.6215*temperature-32.75*Math.pow(speed,0.16)+0.4275*temperature*Math.pow(speed,0.16);
return windchill;
}
//findpower
public static void findPower(int n) {
	int i=0;
	int power=1;

if(n<=31) {
System.out.println("powers of 2 that are less than or equal to 2^n,n=" +n);


while(i<=n)
 
{
   System.out.println("2^" +i+"="+power);
    power=power*2;
    i++;
}
	}
	else
System.out.println("overflow of int range");
}

//printmatrix	

public static void printMatrix() {
Scanner sc = new Scanner(System.in);

}
//Array 2D

public static void enterMatrixData(Scanner sc, int[][] Matrix, int r, int c){
 System.out.println("Enter Matrix Elements");
      
      for (int i = 0; i < r; i++)
      {
          for (int j = 0; j < c; j++)
          {
             Matrix[i][j] = sc.nextInt();
          }
      }
}
public static void printMatrix(int[][] Matrix, int r, int c){
System.out.println(" Matrix is : ");
    
    for (int i = 0; i < r; i++) {
    
        for (int j = 0; j < c; j++) {
        
            System.out.print(Matrix[i][j]+"\t");}
        
         
        System.out.println();
    }
}
//string replace
public static void stringReplace() {
String str1=new String("username");
System.out.println("Original String: ");
String str3=new String("hello<<username>>,how are you");
System.out.println(str3);
 Scanner sc = new Scanner(System.in);
System.out.println("Enter name: ");
String str2= sc.next();
sc.close();

if(str2.length()>3)
{
String	str4=str3.replaceAll(str1, str2);
	System.out.println("Replaced string is : ");
	System.out.println(str4 );
}
else
{
	System.out.println("Name must have atleast 3 characters!try again...");	
}}
//harmonic
public static void harmonicNumber(int n) {
	

float harmonic = 1;
for (int i = 2; i <= n; i++) {
	harmonic = harmonic + (float) 1 / i;
}

System.out.println(harmonic);

}
//Headtail
public static void toss(int flips) {
	double heads=0;
	double tails=0;
	double count=1;
	double result=0;
	
	while(count<=flips) {
		result=Math.random();
		if(result<=0.5) {
	
			heads++;}
	
		else {
			tails++;}count++;}
	
	System.out.println(+heads+"is the number of heads");
	System.out.println(+tails+"is the number of tails");
	double hp=(heads/flips)*100;
	double tp=(tails/flips)*100;
	System.out.println("Head percentage : "+hp);
	System.out.println("Tail percentage : "+tp);
	
		}
//finding sum of 3 integers
public static void findingThreeIntegers() {
 int count=0;
//public static void main(String[] args) {
    int givenArray[] = {1, 2, 4, -3, -1, 5, 6};
    for (int i = 0; i < givenArray.length; i++) {
        for (int j = i + 1; j < givenArray.length; j++) {
            for (int k = j + 1; k < givenArray.length; k++) {
                if (givenArray[i] + givenArray[j] + givenArray[k] == 0) {{
                	
                	
                
                    System.out.println("Numbers found : " + givenArray[i] + "," + givenArray[j] + " and " + givenArray[k]);
                    count++;
                    int d=count;
                    System.out.println("Total number of pairs found : " +d);
                }
            
                }}}
    }
}//stopwatch
public static double stopWatch(long now,long start) {
	double time=(now-start)/1000;
	return time;
	
}
//Replace username using regex function
public static String replaceUserName(String sentance,String userName) {
	final String REGEX_USERNAME="<<userName>>";
	Pattern p=Pattern.compile(REGEX_USERNAME);
	Matcher m=p.matcher(sentance);
	String message=m.replaceFirst(userName);
	
return message;
}
//coupon onlynumbers
public static int number(int n) {
	boolean[] collectedValue=new boolean[n];
	int count=0;
	int distinctNum=0;
	while(distinctNum<n) {
		int num=(int)(Math.random()*2);
		count++;
		if(!collectedValue[num]) {
			distinctNum++;
			System.out.println(distinctNum);
			collectedValue[num]=true;
		}
	}
	return count;}
public static int getInt() {
	// TODO Auto-generated method stub
	return sc.nextInt();
//gambler2
}
public static void gambling(int cash,int bet,int goal) {
int trial=0;
int w=0;
int l=0;
while(cash!=0||cash==goal)
	{
	double rs=Math.random();
	System.out.println(rs);
	if(rs<=0.5) {
		cash=cash+bet;
		w++;
	}
	else {
		cash=cash-bet;
		l++;
	}trial++;
	}
System.out.println("no.of wins"+w);
System.out.println("no.of loss"+l);
int wp=(w*100)/trial;
int lp=(l*100)/trial;
System.out.println("wins percentage"+wp);
System.out.println("loss percentage"+lp);
}
//coupon numbers3
public static void isCoupon(int n)
{
	int count=0,i=0,j=0;
	int a[]=new int[n];
	Random t=new Random();
	for(i=0;i<n;i++)
	{
		a[i]=t.nextInt(n);
		System.out.println(a[i]+"");
	}
	System.out.println("Distinct coupon:");

		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++) 
			{
			    if (a[i]==a[j]);
			      break;
			}
		    if(i==j) 
	          count++;
		}
	System.out.println(count);
		
}
//TIC TAC TOE-user and user

public static String board[][]= new String[3][3];
static String cp="x";
public static  void changeplayer() {
	if(cp=="x") {
		cp="o";
	}
	else {
		cp="x";
	}}
public static boolean isBoardFull() {
	boolean isFull=true;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(board[i][j]==" "){
				isFull=false;
			}
		}
	}return isFull;
}
public static void printBoard()
{
	System.out.println("--------------------------");
	for(int i=0;i<3;i++) {
		System.out.print(" |");
		for(int j=0;j<3;j++) {
			System.out.print(board[i][j]+" |");
		}
		System.out.println();
		System.out.println("------------");}}


public static boolean CheckForWin() {
	return(checkRowsForWin()||checkColumns()||checkDiagonal());}
			public static boolean checkRowsForWin() {

		  for (int i = 0; i < 3; i++) {

		      if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {

		          return true;

		      }

		  }

		  return false;
		}

			public static boolean checkColumns() {
				for(int i=0;i<3;i++) {
				if(checkRowCol(board[0][i],board[1][i],board[2][i])==true) {
					return true;}}return false;}
			public static boolean checkDiagonal() {

		        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

		    }
	public static boolean checkRowCol(String board2, String board3, String board4) {

		        return ((board2 != "-" && (board2 == board3) && (board3 == board4)));

		    }
	public static boolean placeMark(int i,int j) {
		if((i>=0)&&(i<3)) {
			if((j>=0)&&(j<3)){
				if(board[i][j]==" ") {
					board [i][j]=cp;
					return true;
					
					
				}
			}
		}
	return false;}
//Tic Tac Toe -user and computer
	static final int USER = 1;
    static final int EMPTY = 0;
     static final int NONE = 0;
 
   static final int COMPUTER = 2;
static final int STALEMATE = 3;

public static char printChar(int b) {
    switch(b) {
    case EMPTY:
        return ' ';
    case USER:
        return 'X';
    case COMPUTER:
        return 'O';
    }
    return ' ';
 }




    public static int checkWinner(int[][] board) {
            // Check if someone won
            // Check horizontals

            // top row
            if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
                return board[0][0];

            // middle row
            if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
                return board[1][0];

            // bottom row
           if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
              //  return board[2][0];

            // Check verticals

            // left column
            if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
                return board[0][0];

            // middle column
            if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
                return board[0][1];

            // right column
            if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
               return board[0][2];

            // Check diagonals
            // one diagonal
            if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
                return board[0][0];

            // the other diagonal
            if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
                return board[0][2];

            // Check if the board is full
            if(board[0][0] == EMPTY || 
                   board[0][1] == EMPTY || 
                   board[0][2] == EMPTY || 
               board[1][0] == EMPTY ||
               board[1][1] == EMPTY ||
               board[1][2] == EMPTY ||
               board[2][0] == EMPTY ||
               board[2][1] == EMPTY ||
               board[2][2] == EMPTY)
                return NONE;

            return STALEMATE;
            }

             public static int computer_move(int[][] board) {
            int move = (int)(Math.random()*9);

            while(board[move/3][move%3] != EMPTY) 
                move = (int)(Math.random()*9);

            return move;
            }
			



}
			


