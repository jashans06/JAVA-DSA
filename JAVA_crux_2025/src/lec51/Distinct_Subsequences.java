package lec51;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] row : dp) { // iterate over each row
			for (int colIndex = 0; colIndex < row.length; colIndex++) {
				row[colIndex] = -1; // fill values
			}
		}
		System.out.println(DistinctSubsequences(s, t, 0, 0));
		System.out.println(DistinctSubsequencesTD(s, t, 0, 0, dp));

	}

	public static int DistinctSubsequences(String s, String t, int i, int j) {
		if (t.length() == j) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = DistinctSubsequences(s, t, i + 1, j + 1);
		}
		exc = DistinctSubsequences(s, t, i + 1, j);
		return inc + exc;
	}

	public static int DistinctSubsequencesTD(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1; // matched all of t
		}
		if (i == s.length()) {
			return 0; // ran out of s
		}

		// check memo
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = DistinctSubsequencesTD(s, t, i + 1, j + 1, dp);
		}
		exc = DistinctSubsequencesTD(s, t, i + 1, j, dp);

		return dp[i][j] = inc + exc;
	}

	public static int DistinctSubsequencesBU(String s, String t) {
		int n = s.length();
		int m = t.length();

		int[][] dp = new int[n + 1][m + 1];

		// Base case: empty t can always be formed
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}
		

		// Fill table
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[n][m];

	}
}
