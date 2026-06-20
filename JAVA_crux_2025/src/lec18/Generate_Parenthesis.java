package lec18;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis { //leetcode problem no 22

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		parenthesis(n, 0, 0, "", ll);
		System.out.println(ll);
	}

	public static void parenthesis(int n, int open, int close, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		if (open == n && close == n) {
//			System.out.print(ans + " ");
			ll.add(ans);
			return;
		}

		if (open < n) {
			parenthesis(n, open + 1, close, ans + "(", ll);
		}
		if (close < open) {
			parenthesis(n, open, close + 1, ans + ")", ll);
		}

	}

}
