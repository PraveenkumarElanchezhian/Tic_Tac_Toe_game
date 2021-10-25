package Tictactoe;

import java.util.Scanner;

public class Tictactoegame {
	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	char player_letter = ' ';
	char computer_letter = ' ';

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		Tictactoegame rv1 = new Tictactoegame();
		rv1.user_choice();
		rv1.tictacboard();
		rv1.usermove(board);

	}

	void user_choice() {
		Scanner rv1 = new Scanner(System.in);
		System.out.println("choose a letter x or o");
		char user_input = rv1.next().charAt(0);
		if (user_input == 'x') {
			System.out.println("User player takes x and computer player takes o");
			player_letter = 'x';
			computer_letter = 'o';
		} else if (user_input == 'o') {
			System.out.println("User player takes o and computer player takes x");
			player_letter = 'o';
			computer_letter = 'x';
		} else {
			System.out.println("Invalid character");
		}
	}

	void usermove(char[][] board) {
		int a;
		Scanner rv2 = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 9 to make the move: ");
		a = rv2.nextInt();
		switch (a) {
		case 1:
			if (board[0][0] == ' ') {
				board[0][0] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 2:
			if (board[0][1] == ' ') {
				board[0][1] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 3:
			if (board[0][2] == ' ') {
				board[0][2] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 4:
			if (board[1][0] == ' ') {
				board[1][0] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 5:
			if (board[1][1] == ' ') {
				board[1][1] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 6:
			if (board[1][2] == ' ') {
				board[1][2] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 7:
			if (board[2][0] == ' ') {
				board[2][0] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 8:
			if (board[2][1] == ' ') {
				board[2][1] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		case 9:
			if (board[2][2] == ' ') {
				board[2][2] = player_letter;
			} else {
				System.out.println("This place is not free");
			}
			break;
		}
		showBoard(board);
	}

	void tictacboard() {

		showBoard(board);
	}

	private void showBoard(char[][] board) {
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
