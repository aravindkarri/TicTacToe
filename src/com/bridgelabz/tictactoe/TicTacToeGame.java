package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
		char[] board = createBoard();
		boolean userPlay = checkFirstPlayer();
		showBoard(board);
		userPosition(userLetter, board);
		checkFreeSpace(board);
	}
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int index=0;index<board.length;index++)
		{
			board[index] = ' ';
		}
		return board;
	}
	private static char chooseUserLetter(Scanner userInput) {
		System.out.println("Choose your letter: ");
		return userInput.next().toUpperCase().charAt(0);
	}
	private static void showBoard(char[] board) {
		System.out.println( board[0] + " | " + board[1] + " | " + board[2] );
		System.out.println("----------");
		System.out.println( board[3] + " | " + board[4] + " | " + board[5] );
		System.out.println("----------");
		System.out.println( board[6] + " | " + board[7] + " | " + board[8] );
	}
	private static void userPosition(char userLetter, char[] board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your placement (1-9)");
		int position = scanner.nextInt();
		for(int i=0;i<=8;i++)
		{
			if(board[i]==' ')
			{
				switch(position) {
				case 1:
					board[0] = userLetter;
					break;
				case 2:
					board[1] = userLetter;
					break;
				case 3:
					board[2] = userLetter;
					break;
				case 4:
					board[3] = userLetter;
					break;
				case 5:
					board[4] = userLetter;
					break;
				case 6:
					board[5] = userLetter;
					break;
				case 7:
					board[6] = userLetter;
					break;
				case 8:
					board[7] = userLetter;
					break;
				case 9:
					board[8] = userLetter;
					break;
				}
			}
		}
		showBoard(board);
	}
	private static void checkFreeSpace(char[] board) {
		boolean freeSpace=false;
		for(int index=0;index<board.length;index++)
		{
			if(board[index] == ' ')
			{
				freeSpace=true;
			}
		}
		if(freeSpace == true)
		{
			System.out.println("Free space is available for the next move");
		}
		else
		{
			System.out.println("Free space is not available, Board is full");
		}
	}
	private static boolean checkFirstPlayer() {
		int Head=0;
		boolean userPlay;
		Scanner scanner = new Scanner(System.in);
		double randomNum = Math.floor(Math.random()*10)%2;
		if ( randomNum == Head )
		{
			System.out.println("computer starts to play first");
			userPlay=false;
		}
		else
		{
			System.out.println("User starts to play first");
			userPlay=true;
		}
		return userPlay;
	}
}


