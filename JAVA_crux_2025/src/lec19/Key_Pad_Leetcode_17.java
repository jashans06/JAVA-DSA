package lec19;

import java.util.*;

public class Key_Pad_Leetcode_17 { // leetcode problem no 17
	static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "qxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		printAnswer(ques, "", ll);
		System.out.println(ll);
	}

	public static void printAnswer(String ques, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0); // here we get 2 but as a character and ascii value of charcter 2 is 50
		String press = code[ch - 48]; // now here we minus 50-48 = 2 so we get index 2 and corresponding string value
										// abc

		for (int i = 0; i < press.length(); i++) {
			printAnswer(ques.substring(1), ans + press.charAt(i), ll);
		}
	}

}
