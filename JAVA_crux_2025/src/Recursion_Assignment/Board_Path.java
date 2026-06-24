package Recursion_Assignment;

import java.util.*;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boardPath(n, m, 0, "");
		System.out.println("\n" + countPath(n, m, 0));
	}

	public static void boardPath(int n, int m, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");
			return;
		}
		if (curr > n) {
			return;
		}
		for (int dice = 1; dice <= m; dice++) {
			boardPath(n, m, curr + dice, ans + dice);
		}
	}

	public static int countPath(int n, int m, int curr) {
		if (curr == n) {
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= m; dice++) {
			count = count + countPath(n, m, curr + dice);
		}
		return count;
	}
}
