package com.Functionalprograms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class TicTacToe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int e=0;
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		FunctionalUtil.board[i][j]=" ";
	}
}
FunctionalUtil.printBoard();
	do {
		System.out.println("player1:player2");
		System.out.println("Enter move");
		int i=FunctionalUtil.getInt();
		int j=FunctionalUtil.getInt();
		System.out.println(+i+ ":"+j);
		FunctionalUtil.placeMark(i,j);
		FunctionalUtil.printBoard();
		if(FunctionalUtil.CheckForWin()) {
			System.out.println("CONGRATS");
			System.exit(0);
		}
		else if(FunctionalUtil.isBoardFull()) {
			System.out.println("appears we have a draw!");
			System.exit(0);
		}
		FunctionalUtil.changeplayer();
		e++;
	}while(e<9);
	}}
