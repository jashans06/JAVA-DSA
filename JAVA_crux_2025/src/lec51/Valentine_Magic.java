package lec51;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		int[][] dp = new int[boys.length + 1][girls.length + 1];
		for (int[] row : dp) { // iterate over each row
			for (int colIndex = 0; colIndex < row.length; colIndex++) {
				row[colIndex] = -1; // fill values
			}
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(MinDiff(boys, girls, 0, 0));
		System.out.println(MinDiffTD(boys, girls, 0, 0, dp));
		System.out.println(MinDiffBU(boys, girls));
	}

	public static int MinDiff(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 10000000;
		}

		int sel = Math.abs(boys[i] - girls[j]) + MinDiff(boys, girls, i + 1, j + 1);
		int rej = MinDiff(boys, girls, i, j + 1);
		return Math.min(sel, rej);
	}

	public static int MinDiffTD(int[] boys, int[] girls, int i, int j, int[][] dp) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 10000000;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int sel = Math.abs(boys[i] - girls[j]) + MinDiffTD(boys, girls, i + 1, j + 1, dp);
		int rej = MinDiffTD(boys, girls, i, j + 1, dp);
		return dp[i][j] = Math.min(sel, rej);
	}

	public static int MinDiffBU(int[] boys, int[] girls) {
		int n = boys.length;
		int m = girls.length;

		// dp[i][j] = minimum cost to pair first i boys with first j girls
		int[][] dp = new int[n + 1][m + 1];

		// Base cases
		for (int j = 0; j <= m; j++) {
			dp[0][j] = 0; // 0 boys → cost 0
		}
		for (int i = 1; i <= n; i++) {
			dp[i][0] = 10000000; // boys exist but no girls → impossible
		}

		// Fill table
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				// Option 1: pair boy i with girl j
				int sel = Math.abs(boys[i - 1] - girls[j - 1]) + dp[i - 1][j - 1];
				// Option 2: skip girl j
				int rej = dp[i][j - 1];
				dp[i][j] = Math.min(sel, rej);
			}
		}

		return dp[n][m];
	}

}