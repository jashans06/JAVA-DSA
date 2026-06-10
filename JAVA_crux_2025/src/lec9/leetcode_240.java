package lec9;

import java.util.Scanner;

public class leetcode_240 { // Search in 2D matrix || (Staircase Search)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		Search(arr, target);
	}

	public static boolean Search(int[][] arr, int target) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

}
