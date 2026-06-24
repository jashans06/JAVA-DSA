package Recursion_Assignment;

import java.util.*;

public class Replace_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println("\n" + replacePI(str, 0));
		}

	}

	public static String replacePI(String str, int index) {
		if (index == str.length()) {
			return "";
		}
		// Edge case: lone character at last index, can't check index+1
		if (index == str.length() - 1) {
			return str.charAt(index) + "";
		}

		// Case 1: found "pi"
		if (str.charAt(index) == 'p' && str.charAt(index + 1) == 'i') {
			return "3.14" + replacePI(str, index + 2);
		}

		// Case 2: not "pi", move forward
		return str.charAt(index) + replacePI(str, index + 1);
	}
}
