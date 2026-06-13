package lec12;

public class Substring_Acc_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		printSubstring(s);
	}

	public static void printSubstring(String s) {
		for (int length = 1; length <= s.length(); length++) {
			for (int j = length; j <= s.length(); j++) {
				int i = j - length;
				System.out.println(s.substring(i, j));
			}
		}
	}
}
