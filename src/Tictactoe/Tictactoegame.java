package Tictactoe;

public class Tictactoegame {
public static void main(String[] args) {
	System.out.println("Welcome to Tic Tac Toe game");
	Tictactoegame rv1 = new Tictactoegame();
	rv1.tictacboard();
}
void tictacboard()
{
	char[][] board = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};
			printBoard(board);
			    }
private static void printBoard(char[][] board) {
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
