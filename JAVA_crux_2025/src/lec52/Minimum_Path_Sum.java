package lec52;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[arr.length][arr[0].length]; // memo table
		// initialize with -1 (meaning not computed yet)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(PathSumTD(arr, 0, 0, dp));
		System.out.println(PathSum(arr, 0, 0));
		System.out.println(minPathSumBU(arr));
	}

	public static int PathSum(int[][] arr, int cr, int cc) {
		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			return arr[cr][cc];
		}
		if (cr >= arr.length || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		int down = PathSum(arr, cr + 1, cc);
		int right = PathSum(arr, cr, cc + 1);
		return Math.min(down, right) + arr[cr][cc];
	}

	public static int PathSumTD(int[][] arr, int cr, int cc, int[][] dp) {
		// base case: destination cell
		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			return arr[cr][cc];
		}

		// out of bounds
		if (cr >= arr.length || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}

		// if already computed, return memoized value
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}

		// recursive calls
		int down = PathSumTD(arr, cr + 1, cc, dp);
		int right = PathSumTD(arr, cr, cc + 1, dp);

		// store result in dp before returning
		dp[cr][cc] = Math.min(down, right) + arr[cr][cc];
		return dp[cr][cc];
	}

	public static int minPathSumBU(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;

		int[][] dp = new int[m][n];

		// base case: starting cell
		dp[0][0] = arr[0][0];

		// fill first row (can only come from left)
		for (int j = 1; j < n; j++) {
			dp[0][j] = dp[0][j - 1] + arr[0][j];
		}

		// fill first column (can only come from above)
		for (int i = 1; i < m; i++) {
			dp[i][0] = dp[i - 1][0] + arr[i][0];
		}

		// fill rest of the grid
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = arr[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}

		// answer is bottom-right cell
		return dp[m - 1][n - 1];
	}
}
