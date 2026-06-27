package lec21;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		combination(k, n, 0, 1, 0, ll, ans);
		System.out.println(ans);
	}
//dpsf= digits chosen so far
	public static void combination(int k, int n, int dpsf, int index, int sum, List<Integer> ll,
			List<List<Integer>> ans) {
		if (dpsf == k) {
			if (sum == n) {
				ans.add(new ArrayList<Integer>(ll));
				return;
			}
		}
		for (int i = index; i <= 9; i++) {
			if (sum + i > n) {
				break;
			}
			ll.add(i);
			combination(k, n, dpsf + 1, i + 1, sum + i, ll, ans);
			ll.remove(ll.size() - 1);
		}
	}
}
