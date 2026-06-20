package lec18;

public class Duplicate_Permutation {

	public static void main(String[] args) {
		String ques = "abca";// for duplicate when a character is repeated
		printPermutation(ques, "");
	}

	public static void printPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean flag = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					flag = true;
					break;
				}
			}
			if (flag == false
					) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				printPermutation(s1 + s2, ans + ch);
			}

		}
	}
}