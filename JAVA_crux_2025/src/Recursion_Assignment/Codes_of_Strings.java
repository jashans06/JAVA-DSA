package Recursion_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codes_of_Strings {

	// Mapping: index = number, value = letter
	static String[] alphabet = { "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();

		ArrayList<String> ll = new ArrayList<>();
		printStrings(ques, "", ll);

		System.out.print(ll + " ");

	}

	public static void printStrings(String ques, String ans, ArrayList<String> ll) {
		// Base case
		if (ques.length() == 0) {
			ll.add(ans);
			return;
		}

		// 1. Take one digit
		char ch = ques.charAt(0);
		int digit = ch - '0'; // convert char to int
		if (digit >= 1 && digit <= 9) {
			String press = alphabet[ch - 48];
			printStrings(ques.substring(1), ans + press, ll);
		}

		// 2. Take two digits (if possible)
		if (ques.length() >= 2) {
			int twoDigit = Integer.parseInt(ques.substring(0, 2));
			if (twoDigit >= 10 && twoDigit <= 26) {
				String press = alphabet[twoDigit];
				printStrings(ques.substring(2), ans + press, ll);
			}
		}
	}
}