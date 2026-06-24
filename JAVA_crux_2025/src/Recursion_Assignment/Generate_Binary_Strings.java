package Recursion_Assignment;

import java.util.*;

public class Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			String str = sc.next();
			t++;
			printStrings(str, 0, "");
		}

	}

	public static void printStrings(String str, int index, String ans) {
		if (index == str.length()) {
			System.out.print(ans + " ");
			return;
		}
		char ch = str.charAt(index);
		if (ch == '0') {
			printStrings(str, index + 1, ans + '0'); // only one path

		} else if (ch == '1') {
			printStrings(str, index + 1, ans + '1'); // only one path

		} else { // if ch==?
			printStrings(str, index + 1, ans + '0'); // path 1
			printStrings(str, index + 1, ans + '1'); // path 2
		}
	}
}
