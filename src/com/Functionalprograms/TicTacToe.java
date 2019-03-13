package com.Functionalprograms;

import java.util.Scanner;

public class TicTacToe {
	static String board[][]=new String[3][3];
	static String cp="x";
	static int e=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]="-";
				
			}
		}
	do {
		System.out.println("player1:player2");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println(+i+":"+j);
		placeMark1(i,j);
		printBoard();
		if(checkForWin()) {
			System.out.println("YOU WIN! ");
			System.exit(0);
		
	}else if(isBoardFull()) {
		System.out.println("Appears we have a draw!");
		System.exit(0);
	}changeplayer();
	e++;}while(e<9);
	
	}public static void changeplayer() {
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
				if(board[i][j]==".") {
					isFull=false;
				}
			}
		}return isFull;}
	public static void printBoard()
	{
		System.out.println("------------------------------------");
		for(int i=0;i<3;i++) {
			System.out.println("|");
			for(int j=0;j<3;j++) {
				System.out.println(board[i][j]+"|");
			
				}
			System.out.println();
			System.out.println("--------------------------------");
		}
	}
	public static boolean checkForWin() {
		return (checkRowsForWin()||checkColumnsForWin()||checkDiagonalForWin());
	}
	public static boolean checkRowsForWin() {
		for(int i=0;i<3;i++) {
			if(checkRowCol(board[i][0],board[i][1],board[i][2])==true) {
return true;

			}
		}
	return false;}
	public static boolean checkColumnsForWin() {
		for(int i=0;i<3;i++) {
			if(checkRowCol(board[0][i],board[1][i],board[2][i])==true) {
				return true;
			
		}
		
		}return false;}
	public static boolean checkDiagonalForWin() {
		return ((checkRowCol(board[0][0],board[1][1],board[2][2])==true)||(checkRowCol(board[0][2],board[1][1],board[2][0])==true));
	}
	public static boolean checkRowCol(String board2,String board3,String board4) {
		return ((board2!="-"&&(board2==board3)&&(board3==board4)));
	}


	public static boolean placeMark1(int row,int col) {
		if((row>=0&&(row<3))){
			if((col>=0)&&(col<3)){
				if(board[row][col]=="-") {
					board[row][col]=cp;
					return true;
				}}}
		return false;
	}}
	