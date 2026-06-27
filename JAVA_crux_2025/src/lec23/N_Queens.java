package lec23;

public class N_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		nQueens(board, 0, n);
	}

	public static void nQueens(boolean[][] board, int row, int tq) {
		if (tq == 0) {
			display(board);
			return;
		}

		for (int col = 0; col < board.length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				nQueens(board, row + 1, tq - 1);
				board[row][col] = false;
			}
		}
	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		int r = row;
		while (r >= 0) { // upper direction check
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		// left diagonal check
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal check
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

	public static void display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
	}
}
