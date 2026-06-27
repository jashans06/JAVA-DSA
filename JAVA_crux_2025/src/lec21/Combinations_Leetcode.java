package lec21;

import java.util.ArrayList;
import java.util.List;

public class Combinations_Leetcode { //leetcode problem combinations

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		combination(n, k, 0, 1, ll, result);
		System.out.println(result);
	}

	// qpsf-queen place so far
	public static void combination(int n, int k, int qpsf, int index, List<Integer> ll, List<List<Integer>> result) {
		if (qpsf == k) {
//			System.out.println(ans);
			result.add(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = index; i <= n; i++) {
			ll.add(i);
			combination(n, k, qpsf + 1, i + 1, ll, result);
			ll.remove(ll.size() - 1);
		}
	}
}