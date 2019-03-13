package com.Functionalprograms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class TicTacToe3{
            static final int EMPTY = 0;
            static final int NONE = 0;
           static final int USER = 1;
           static final int COMPUTER = 2;
           public static void main(String[] args) {
               
           // 1 = user, 2 = computer
           int turn = USER;

                   int[][] board = new int[3][3];

           
           int move;

           
           int winner;

          
           System.out.println("welcome to tic-tac-toe game");
           System.out.println("You are playing against the computer!");
           System.out.println("Enter 0-8 to indicate your move");

           
           print_board(board);

           // While (game not over)
           while(true) {
               if(turn == USER) {
               System.out.println("Your move");
               move = -1;
               while (move<0 || move>9 || board[move/3][move%3] != EMPTY) {
                   
                  System.out.println("Please enter your move(0-8): ");
                  move=FunctionalUtil.getInt();
                   
               }
               } else {
               move = FunctionalUtil.computer_move(board);
               System.out.println("Computer move: " + move);
               }

               // Update the board
               board[(int)(move/3)][move%3] = turn;

               // Print the board
               print_board(board);

               // if game is over
               winner = FunctionalUtil.checkWinner(board);

               if(winner != NONE)
               break;

               // switch turn
               if(turn == USER) {
               turn = COMPUTER;
               } else {
               turn = USER;
               }

           }

           // Print out the outcome
           switch(winner) {
           case USER:
               System.out.println("You won!");
               break;
           case COMPUTER: 
               System.out.println("Computer won!");
               break;
           default:
               System.out.println("Tie!");
               break;
           }
           }

          
           // Print the board
           public static void print_board(int[][] board) {
           System.out.print(FunctionalUtil.printChar(board[0][0]));
           System.out.print("|");
           System.out.print(FunctionalUtil.printChar(board[0][1]));
           System.out.print("|");
           System.out.println(FunctionalUtil.printChar(board[0][2]));
           System.out.println("-----");
           System.out.print(FunctionalUtil.printChar(board[1][0]));
           System.out.print("|");
           System.out.print(FunctionalUtil.printChar(board[1][1]));
           System.out.print("|");
           System.out.println(FunctionalUtil.printChar(board[1][2]));
           System.out.println("-----");
           System.out.print(FunctionalUtil.printChar(board[2][0]));
           System.out.print("|");
           System.out.print(FunctionalUtil.printChar(board[2][1]));
           System.out.print("|");
           System.out.println(FunctionalUtil.printChar(board[2][2]));
           }

           // Return an X or O, depending upon whose move it was
           


       }

		// util
		