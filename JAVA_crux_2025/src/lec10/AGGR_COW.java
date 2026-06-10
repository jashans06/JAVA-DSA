package lec10;

import java.util.Arrays;
import java.util.Scanner;

public class AGGR_COW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int nos = sc.nextInt(); // no of stalls
			int noc = sc.nextInt(); // no of cows
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(minDistance(stall, noc));
			t--;
		}
		sc.close();
	}

	public static int minDistance(int[] stall, int noc) {
		int low = stall[0];
		int high = stall[stall.length - 1];
//		 int low = 1;  // minimum possible distance
//		    int high = stall[stall.length - 1] - stall[0];  // maximum possible distance
		int ans = 0;
		while (low <= high) {
			int mid = (high + low) / 2;
			if (isItPossible(stall, noc, mid) == true) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] stall, int noc, int mid) {
		int pos = stall[0];
		int cowsCount = 1;
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cowsCount++;
				pos = stall[i];
			}
			if (cowsCount == noc) {
				return true;
			}
		}
		return false;
	}
}
