package textbook;

import java.util.Scanner;

public class TicTacToe {

	private char[][] board;
	private int[] playerXMove;
	private int[] playerOMove;
	private char winner;
	private Scanner scanner;

	public static final char PLAYERX_SYMBOL = 'X';
	public static final char PLAYERO_SYMBOL = 'O';

	public TicTacToe() {

		// initialize input scanner
		scanner = new Scanner(System.in);

		// initialize board
		board = new char[3][3];

		// initialize player moves
		playerXMove = new int[2];
		playerOMove = new int[2];

		// start game
		start();

	}

	/*
	 * starts and controls the game flow
	 */
	private void start() {

		// display board
		display();

		// main game loop
		while (true) {

			// get player X move
			playerXMove = getMove(PLAYERX_SYMBOL);

			// do move
			doMove(playerXMove, PLAYERX_SYMBOL);

			// display board
			display();

			// check board for win conditions
			if (win(PLAYERX_SYMBOL)) {
				winner = PLAYERX_SYMBOL;
				break;
			}

			// check board for draw
			if (draw()) {
				break;
			}

			// get player O move
			playerOMove = getMove(PLAYERO_SYMBOL);

			// do move
			doMove(playerOMove, PLAYERO_SYMBOL);

			// display board
			display();

			// check board for win conditions
			if (win(PLAYERO_SYMBOL)) {
				winner = PLAYERO_SYMBOL;
				break;
			}

			// check board for draw
			if (draw()) {
				break;
			}
		}
		
		if(winner == '\u0000')
		{
			System.out.println("Draw!");
		}
		else
		{
			System.out.printf("%s player won", winner);
		}
	}

	/*
	 * checks for a draw
	 */
	private boolean draw() {

		// get the 1D board for easy iteration
		char[] board1D = getBoard1D();
		
		for (int i = 0; i < board1D.length; i++) {
			if (board1D[i] == '\u0000') { // char default
				
				// there is a space available
				return false;
			}
		}
		return true;
	}

	/*
	 * checks for a win
	 */
	private boolean win(char player) {

		// win conditions
		int[][] wins = { { 1, 1, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 1, 0, 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0, 1, 0, 0, 1 },
				{ 0, 0, 1, 0, 1, 0, 1, 0, 0 } };

		// get board comparison array
		char[] board1D = getBoard1D();

		for (int i = 0; i < wins.length; i++) {
			for (int j = 0; j < wins[i].length; j++) {

				if (wins[i][j] == 1) {

					// this position needs to be occupied by the player to win
					if (board1D[j] != player) {
						// skip to the next condition
						break;
					}
				}

				// if we get to the end of this array, we have a winner
				if (j == board1D.length - 1) {
					return true;
				}
			}
		}

		return false;
	}

	/*
	 * gets a 1D version of the board 
	 */
	private char[] getBoard1D() {
		char[] board1D = new char[9];

		int counter = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board1D[counter] = board[i][j];
				counter++;
			}
		}
		return board1D;
	}

	/*
	 * makes the move
	 */
	private void doMove(int[] move, char player) {
		board[move[0]][move[1]] = player;
	}

	/*
	 * displays the board
	 */
	private void display() {

		System.out.println("-------------");

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.printf("| %s ", board[i][j]);
			}
			System.out.printf("|%n");
			System.out.println("-------------");
		}

	}

	/*
	 * gets the player's move from the user
	 * 
	 */
	private int[] getMove(char player) {
		int[] move = { -1, -1 };

		while (true) {

			System.out.printf("Enter a row (0, 1, 2) for player %s: ", player);

			if (scanner.hasNextInt()) {
				move[0] = scanner.nextInt();
			}

			System.out.printf("Enter a column (0, 1, 2) for player %s: ",
					player);

			if (scanner.hasNextInt()) {
				move[1] = scanner.nextInt();
			}

			if (verifyMove(move)) {
				// accept move
				break;
			} else {
				// refuse move
				System.out.println("Illegal Move");
			}
		}
		return move;
	}

	/*
	 * verify if the move is legal
	 */
	private boolean verifyMove(int[] move) {

		// move must be on the board
		for (int i = 0; i < move.length; i++) {
			if (move[i] < 0 || move[i] > 2) {
				return false;
			}
		}

		// space must be empty to move there
		if (board[move[0]][move[1]] != '\u0000') { // char default
			return false;
		}

		return true;
	}

}
