package Tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		List<Integer> lista = new ArrayList<Integer>();
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
					while (lista.contains(input_move)) {
						System.out.println("This place is already occupied Please re-enter between the number from 1 to 9");
						input_move = input_move = rv1.nextInt();
					}
				} else {
					player_two = 0;
					input_move = (int) Math.floor(Math.random() * (max - min + 1) + min);
					while (lista.contains(input_move)) {
						input_move = (int) Math.floor(Math.random() * (max - min + 1) + min);
					}
				} 
				    lista.add(input_move);
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
				String s = checkWinner();
				if (s == "X") {
					if (player_letter=='x')
						System.out.println("Userplayer is winner");
					else 
					System.out.println("Computer is winner");
					break;
				}
				else if (s == "O") {
					if (player_letter=='o')
						System.out.println("Userplayer is winner");
					else 
					System.out.println("Computer is winner");
					break;
				}
				
				else {}
				
				if (player_one == 1)
					player_one = 0;
				else
					player_one = 1;
				
				if (lista.size() == 9) {
					System.out.println("match is draw");
					
				}
				
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
		System.out.println("************");
	}
	 static String checkWinner()
	    {
	        for (int a = 1; a <=9; a++) {
	        	 String line = null;
	  
	            switch (a) {
	            case 1:
	            
	                line = (converts_toString(board[0][0]) + converts_toString(board[0][1]) + converts_toString(board[0][2]));
	                break;
	            case 2:
	            	line = (converts_toString(board[1][0]) + converts_toString(board[1][1]) +converts_toString(board[1][2]));
	            	break;
	            case 3:
	            	line = (converts_toString(board[2][0]) + converts_toString(board[2][1]) + converts_toString(board[2][2]));
	                break;
	            case 4:
	                line = (converts_toString(board[0][0]) + converts_toString(board[1][0]) + converts_toString(board[2][0]));
	                break;
	            case 5:
	            	line = (converts_toString(board[0][1]) + converts_toString(board[1][1]) + converts_toString(board[2][1]));
	                break;
	            case 6:
	            	line = (converts_toString(board[0][2]) + converts_toString(board[1][2]) + converts_toString(board[2][2]));
	                break;
	            case 7:
	            	line = (converts_toString(board[0][0]) + converts_toString(board[1][1]) + converts_toString(board[2][2]));
	                break;
	            case 8:
	            	line = (converts_toString(board[0][2]) + converts_toString(board[1][1]) + converts_toString(board[2][0]));
	                break;
	            }
	            if (line != null && line.equals("xxx")) {
	                return "X";
	            }
	            else if (line != null && line.equals("ooo")) {
	                return "O";
	            }
	        }
	         
			/*
			 * for (int a = 1; a<=9; a++) { if (Arrays.asList(board).contains(
			 * String.valueOf(a + 1))) { break; } else if (a == 9) { return "draw"; } }
			 */
	        return "";
   }
	 static String converts_toString (char val) {
		 return Character.toString(val);
	 }
}
