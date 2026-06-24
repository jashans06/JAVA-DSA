package Recursion_Assignment;

import java.util.*;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		printPath(0, 0, n - 1, m - 1, "");
		System.out.println("\n" + countPath(0, 0, n - 1, m - 1));

	}

	public static void printPath(int current_row, int current_col, int end_row, int end_col, String ans) {
		if (current_row == end_row && current_col == end_col) {
			System.out.print(ans + " ");
			return;
		}
		if (current_row > end_row || current_col > end_col) {
			return;
		}
		printPath(current_row + 1, current_col, end_col, end_row, ans + 'V');
		printPath(current_row, current_col + 1, end_col, end_row, ans + 'H');
		printPath(current_row + 1, current_col + 1, end_col, end_row, ans + 'D');
	}

	public static int countPath(int current_row, int current_col, int end_row, int end_col) {
		if (current_row == end_col && current_col == end_col) {
			return 1;
		}
		if (current_row > end_col || current_col > end_col) {
			return 0;
		}
		int count = 0;
		count += countPath(current_row + 1, current_col, end_row, end_col);
		count += countPath(current_row, current_col + 1, end_row, end_col);
		count += countPath(current_row + 1, current_col + 1, end_row, end_col);
		return count;
	}

}
