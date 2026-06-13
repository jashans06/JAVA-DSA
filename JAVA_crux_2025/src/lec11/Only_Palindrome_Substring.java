package lec11;

import java.util.Scanner;

public class Only_Palindrome_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printPalindromeSubsrting(s);
	}

	public static void printPalindromeSubsrting(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (isPalindrome(str.substring(i, j)) == true) {
					System.out.println(str.substring(i, j));
				}
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
