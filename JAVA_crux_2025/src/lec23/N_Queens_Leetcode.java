package lec23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_Queens_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] board = new char[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] = '.');
			}
			System.out.println();
		}

		List<List<String>> ans = new ArrayList<>();

		nQueens(board, 0, n, ans);
		System.out.println(ans);
	}

	public static void nQueens(char[][] board, int row, int tq, List<List<String>> list) {
		if (tq == 0) {
			list.add(display(board));
			return;
		}

		for (int col = 0; col < board.length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = 'Q';
				nQueens(board, row + 1, tq - 1, list);
				board[row][col] = '.';
			}
		}
	}

	public static boolean isItSafe(char[][] board, int row, int col) {
		// TODO Auto-generated method stub
		int r = row;
		while (r >= 0) { // upper direction check
			if (board[r][col] == 'Q') {
				return false;
			}
			r--;
		}
		// left diagonal check
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == 'Q') {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal check
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == 'Q') {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

	public static List<String> display(char[][] board) {
		// TODO Auto-generated method stub
		List<String> internal = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			String row = new String(board[i]);
			internal.add(row);
		}
		return internal;
	}
}
