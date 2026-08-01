package lec51;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int cap = 4;
		int[][] dp = new int[wt.length][val.length];
		for (int[] row : dp) { // iterate over each row
			for (int colIndex = 0; colIndex < row.length; colIndex++) {
				row[colIndex] = -1; // fill values
			}
		}
		System.out.println(maximumvalue(wt, val, cap, 0));
		System.out.println(maximumvalueTD(wt, val, cap, 0, dp));

	}

	public static int maximumvalue(int[] wt, int[] val, int cap, int i) {
		if (i == wt.length || cap == 0) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + maximumvalue(wt, val, cap - wt[i], i + 1);
		}

		exc = maximumvalue(wt, val, cap, i + 1);
		return Math.max(inc, exc);

	}

	public static int maximumvalueTD(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if (i == wt.length || cap == 0) {
			return 0;
		}
		if (dp[i][cap] != -1) {
			return dp[i][cap];
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + maximumvalueTD(wt, val, cap - wt[i], i + 1, dp);
		}

		exc = maximumvalueTD(wt, val, cap, i + 1, dp);
		return dp[i][cap] = Math.max(inc, exc);

	}

	public static int maximumvalueBU(int[] wt, int[] val, int cap) {
		int n = wt.length;

		// dp[i][w] = max value using first i items with capacity w
		int[][] dp = new int[n + 1][cap + 1];

		// Base cases are already 0 by default in Java arrays
		// dp[0][w] = 0 (no items → no value)
		// dp[i][0] = 0 (capacity 0 → no value)

		for (int i = 1; i <= n; i++) {
			for (int w = 1; w <= cap; w++) {
				if (wt[i - 1] <= w) {
					// Choice: include or exclude item i-1
					dp[i][w] = Math.max(dp[i - 1][w], val[i - 1] + dp[i - 1][w - wt[i - 1]]);
				} else {
					// Item too heavy, skip it
					dp[i][w] = dp[i - 1][w];
				}
			}
		}

		return dp[n][cap];
	}
}
