package Tictactoe;

import java.util.Scanner;

public class Tictactoegame {
	char player_letter = ' ';
	char computer_letter = ' ';
public static void main(String[] args) {
	System.out.println("Welcome to Tic Tac Toe game");
	Tictactoegame rv1 = new Tictactoegame();
	rv1.user_choice();
	rv1.tictacboard();
	
}
void user_choice() {
	Scanner rv1 = new Scanner(System.in);
	System.out.println("choose a letter x or o");
	char user_input = rv1.next().charAt(0);
	if (user_input == 'x') {
		System.out.println("User player takes x and computer player takes o");
		 player_letter = 'x';
		 computer_letter = 'o';
	}
	else if (user_input == 'o') {
		System.out.println("User player takes o and computer player takes x");
		player_letter = 'o';
		 computer_letter = 'x';
	}
	else {
		System.out.println("Invalid character");
	}
}
void tictacboard()
{
	char[][] board = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};
			showBoard(board);
			    }
private static void showBoard(char[][] board) {
			System.out.print((board[0][0]));
			System.out.print("|");
			System.out.print((board[0][1]));
			System.out.print("|");
			System.out.println((board[0][2]));
			System.out.println("-----");
			System.out.print((board[1][0]));
			System.out.print("|");
			System.out.print((board[1][1]));
			System.out.print("|");
			System.out.println((board[1][2]));
			System.out.println("-----");
			System.out.print((board[2][0]));
			System.out.print("|");
			System.out.print((board[2][1]));
			System.out.print("|");
			System.out.println((board[2][2]));
			}

	}
