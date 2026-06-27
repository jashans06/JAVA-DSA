package lec22;

import java.util.Scanner;

public class Rat_Chases_its_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] maze = new char[m][n];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[m][n];
		ratPath(maze, 0, 0, ans);
		if (flag == false) {
			System.out.println("NO PATH  FOUND");
		}
	}

	static boolean flag = false;

	public static void ratPath(char[][] maze, int current_row, int current_column, int[][] ans) {

		if (current_row == maze.length - 1 && current_column == maze[0].length - 1
				&& maze[current_row][current_column] != 'X') {
			ans[current_row][current_column] = 1;
			display(ans);
			flag = true;
			return;
		}

		if (current_row < 0 || current_column < 0 || current_row >= maze.length || current_column >= maze[0].length
				|| maze[current_row][current_column] == 'X') {
			return;
		}

		maze[current_row][current_column] = 'X';
		ans[current_row][current_column] = 1;
		int[] row = { 0, 0, -1, 1 };
		int[] col = { -1, +1, 0, 0 };
//		ratPath(maze, current_row, current_column - 1, ans); // for left
//		ratPath(maze, current_row, current_column + 1, ans); // for right
//		ratPath(maze, current_row - 1, current_column, ans); // for up
//		ratPath(maze, current_row + 1, current_column, ans); // for down
		for (int i = 0; i < col.length; i++) {
			ratPath(maze, current_row + row[i], current_column + col[i], ans);
		}
		maze[current_row][current_column] = '0';
		ans[current_row][current_column] = 0;
	}

	public static void display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
