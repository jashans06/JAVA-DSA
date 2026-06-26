package lec21;

import java.util.*;

public class Combination_Sum_Leet { // Leetcode problem no 39 (Combination Sum)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 1, 3, 5 };
		int amount = 4;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		permutation(coin, amount, ll, 0, ans);
		System.out.println(ans);
	}

	public static void permutation(int[] coin, int amount, List<Integer> ll, int index, List<List<Integer>> ans) {
		if (amount == 0) {
//			System.out.println(ll);
			ans.add(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = index; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				permutation(coin, amount - coin[i], ll, i, ans);
				ll.remove(ll.size() - 1);
			}
		}
	}
}
