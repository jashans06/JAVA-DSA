package Recursion_Assignment;

import java.util.Scanner;

public class Keypad_Codes {

	static String[] code = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		printCodes(ques, "");
		int count = countCodes(ques);
		System.out.println("\n" + count);
	}

//	public static int printCodes(String str, String ans) {
//		if (str.length() == 0) {
//			System.out.print(ans + " ");
//			return 1;
//		}
//		char ch = str.charAt(0);
//		String press = code[ch - 48];
//		int a1 = 0;
//		for (int i = 0; i < press.length(); i++) {
//			a1 += printCodes(str.substring(1), ans + press.charAt(i));
//		}
//		return a1;
//	}

	public static void printCodes(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = str.charAt(0);
		String press = code[ch - 48];

		for (int i = 0; i < press.length(); i++) {
			printCodes(str.substring(1), ans + press.charAt(i));
		}

	}

	public static int countCodes(String str) {
		if (str.length() == 0) {
			return 1;
		}

		char ch = str.charAt(0);
		int choices = code[ch - 48].length(); // ✅ correct index calculation

		return choices * countCodes(str.substring(1));
	}
}
