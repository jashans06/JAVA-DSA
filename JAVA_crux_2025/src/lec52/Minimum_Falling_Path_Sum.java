package lec52;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MIN_VALUE);
		}
		for (int i = 0; i < arr.length; i++) {
			ans = Math.min(ans, minpathsumTD(arr, 0, i, dp));
		}
		System.out.println(ans);
		int ans2 = Integer.MAX_VALUE;
		for (int j = 0; j < arr[0].length; j++) {
			ans2 = Math.min(ans2, minpathsum(arr, 0, j));
		}
		System.out.println(ans2);

		System.out.println(minFallingPathSumBU(arr));
	}

	private static int minpathsum(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (j >= arr[0].length || j < 0) {
			return Integer.MAX_VALUE;
		}
		if (i == arr.length - 1) {
			return arr[i][j];
		}

		int ld = minpathsum(arr, i + 1, j - 1);
		int rd = minpathsum(arr, i + 1, j + 1);
		int down = minpathsum(arr, i + 1, j);
		return Math.min(rd, Math.min(ld, down)) + arr[i][j];
	}

	private static int minpathsumTD(int[][] arr, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub
		if (j >= arr[0].length || j < 0) {
			return Integer.MAX_VALUE;
		}
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		if (dp[i][j] != Integer.MIN_VALUE) {
			return dp[i][j];
		}

		int ld = minpathsumTD(arr, i + 1, j - 1, dp);
		int rd = minpathsumTD(arr, i + 1, j + 1, dp);
		int down = minpathsumTD(arr, i + 1, j, dp);
		return dp[i][j] = Math.min(rd, Math.min(ld, down)) + arr[i][j];
	}

	public static int minFallingPathSumBU(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;

		// dp[i][j] = minimum path sum to reach cell (i, j)
		int[][] dp = new int[n][m];

		// Base case: first row is same as arr
		for (int j = 0; j < m; j++) {
			dp[0][j] = arr[0][j];
		}

		// Fill dp table row by row
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int down = dp[i - 1][j]; // from above
				int ld = (j > 0) ? dp[i - 1][j - 1] : Integer.MAX_VALUE; // from left diagonal
				int rd = (j < m - 1) ? dp[i - 1][j + 1] : Integer.MAX_VALUE; // from right diagonal

				dp[i][j] = arr[i][j] + Math.min(down, Math.min(ld, rd));
			}
		}

		// Answer is min of last row
		int ans = Integer.MAX_VALUE;
		for (int j = 0; j < m; j++) {
			ans = Math.min(ans, dp[n - 1][j]);
		}
		return ans;
	}

}