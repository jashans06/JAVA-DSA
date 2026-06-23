package Recursion_Assignment;

import java.util.*;

public class ASCII_Subsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		subsequence(str, "");
		int count = countSubsequence(str);
		System.out.println("\n" + count);
		sc.close();
	}

	public static void subsequence(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = str.charAt(0);
		subsequence(str.substring(1), ans);
		subsequence(str.substring(1), ans + ch);
		subsequence(str.substring(1), ans + (int) ch);
	}

	public static int countSubsequence(String str) {
		if (str.length() == 0) {
			return 1;
		}
		String ros = str.substring(1); // rest of stringS
		return 3 * countSubsequence(ros);
	}

}
