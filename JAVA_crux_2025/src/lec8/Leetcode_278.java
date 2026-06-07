package lec8;

public class Leetcode_278 {// First Bad version

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int FirstBadVersion(int n) {
		int low = 1;
		int high = n;
		int ans = 0;
		while (low <= high) {
//			int mid = (low + high) / 2;
			int mid = low + (high-low) / 2;
			if (isBadVersion(mid) == true) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	// this is just to remove the error of isBadVersion method used above. just copy
	// the above function for leetcode
	public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
