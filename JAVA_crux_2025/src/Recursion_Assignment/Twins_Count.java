package Recursion_Assignment;

import java.util.Scanner;

public class Twins_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = countTwins(str, 0);
		System.out.println(count);
	}

	public static int countTwins(String str, int i) {
		if (i + 2 >= str.length()) {
			return 0;
		}
		int count = 0;
		if (str.charAt(i) == str.charAt(i + 2)) {
			count = 1;
		}
		return count + countTwins(str, i + 1);

	}

}
