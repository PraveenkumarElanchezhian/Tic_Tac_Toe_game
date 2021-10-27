package Tictactoe;

import java.util.Scanner;

public class Tictactoegame {
	public static int min = 1;
	public static int max = 9;
	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	char player_letter = ' ';
	char computer_letter = ' ';

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		Tictactoegame rv1 = new Tictactoegame();
		rv1.tictacboard();
		rv1.user_choice();
		rv1.flipcoin();

	}

	void flipcoin() {
		int player_one = 1;
		int player_two = 0;
		int input_move = 0;
		int flip = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println("Toss won :" + (flip == 1 ? "player_one" : player_two));
		player_one = flip;
			for (int i = 1; i <= 9; i++) 
			{
				if (player_one == 1) {
					Scanner rv1 = new Scanner(System.in);
					System.out.println("User_input - print between the number from 1 to 9");
					input_move = rv1.nextInt();
				} else {
					player_two = 0;
					input_move = (int) Math.floor(Math.random() * (max - min + 1) + min);
					System.out.println("random :" + input_move);
				}
					switch (input_move) {
					case 1:
						if (board[0][0] == ' ') {
							board[0][0] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 2:
						if (board[0][1] == ' ') {
							board[0][1] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 3:
						if (board[0][2] == ' ') {
							board[0][2] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 4:
						if (board[1][0] == ' ') {
							board[1][0] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 5:
						if (board[1][1] == ' ') {
							board[1][1] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 6:
						if (board[1][2] == ' ') {
							board[1][2] = GetLetter(player_one);
							;
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 7:
						if (board[2][0] == ' ') {
							board[2][0] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 8:
						if (board[2][1] == ' ') {
							board[2][1] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					case 9:
						if (board[2][2] == ' ') {
							board[2][2] = GetLetter(player_one);
						} else {
							System.out.println("This place is not free");
						}
						break;
					}
				
				
				showBoard(board);
				if (player_one == 1)
					player_one = 0;
				else
					player_one = 1;
			}
		
	}

	char GetLetter(int isPlayer_one) {
		/*
		 * if(isPlayer_one == 1) { return player_letter; }
		 */

		if (isPlayer_one == 1)
			return player_letter;
		else
			return computer_letter;

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
