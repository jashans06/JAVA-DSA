package lec21;

import java.util.*;

public class Combination_Sum_2 { // Leetcode problem no 39 (Combination Sum)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidate = { 2, 5, 2, 1, 2 };
		int amount = 5;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		 Arrays.sort(candidate);
		permutation(candidate, amount, ll, 0, ans);
		System.out.println(ans);
	}

	public static void permutation(int[] candidate, int amount, List<Integer> ll, int index, List<List<Integer>> ans) {
		if (amount == 0) {
//			System.out.println(ll);
			ans.add(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = index; i < candidate.length; i++) {
			if (i > index && candidate[i] == candidate[i - 1]) {
				continue;
			}
			if (amount >= candidate[i]) {
				ll.add(candidate[i]);
				permutation(candidate, amount - candidate[i], ll, i + 1, ans);
				ll.remove(ll.size() - 1);
			}
		}
	}
}
