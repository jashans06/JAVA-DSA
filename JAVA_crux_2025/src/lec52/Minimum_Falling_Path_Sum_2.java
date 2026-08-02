package lec52;

import java.util.*;

public class Minimum_Falling_Path_Sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MIN_VALUE);
		}
		for (int i = 0; i < arr.length; i++) {
			ans = Math.min(ans, minpathsum(arr, 0, i, dp));
		}
		System.out.println(ans);
		System.out.println(minPathSumBU(arr));
	}

	private static int minpathsum(int[][] arr, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		if (dp[i][j] != Integer.MIN_VALUE) {
			return dp[i][j];
		}

		int ans = Integer.MAX_VALUE;
		for (int k = 0; k < arr[0].length; k++) {
			if (j != k) {
				ans = Math.min(ans, minpathsum(arr, i + 1, k, dp));

			}
		}

		return dp[i][j] = ans + arr[i][j];
	}

	public static int minPathSumBU(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;

		int[][] dp = new int[n][m];

		// Base case: last row = itself
		for (int j = 0; j < m; j++) {
			dp[n - 1][j] = arr[n - 1][j];
		}

		// Fill from bottom to top
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j < m; j++) {
				int ans = Integer.MAX_VALUE;
				for (int k = 0; k < m; k++) {
					if (k != j) {
						ans = Math.min(ans, dp[i + 1][k]);
					}
				}
				dp[i][j] = arr[i][j] + ans;
			}
		}

		// Answer = min of first row
		int res = Integer.MAX_VALUE;
		for (int j = 0; j < m; j++) {
			res = Math.min(res, dp[0][j]);
		}
		return res;
	}

}
