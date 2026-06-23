package Recursion_Assignment;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printSubsequence(str, "");
		System.out.println("\n" + count);
	}

	static int count = 0;

	public static void printSubsequence(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = str.charAt(0);
		String s1 = str.substring(1);
		printSubsequence(s1, ans);
		printSubsequence(s1, ans + ch);
	}

}
