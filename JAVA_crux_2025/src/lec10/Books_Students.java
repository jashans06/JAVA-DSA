package lec10;

public class Books_Students { // books allocation to students Binary Search

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] page = { 10, 20, 30, 40 };
		int nos = 2; // no of students
		System.out.println(minPage(page, nos));
	}

	public static int minPage(int[] page, int nos) {
		int low = 0;
		int high = 0;
		for (int i = 0; i < page.length; i++) {
			high = high + page[i];
		}
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isItPossible(page, nos, mid) == true) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] page, int nos, int mid) {
		int readpage = 0;
		int student = 1;
		for (int i = 0; i < page.length; i++) {
			if (readpage + page[i] <= mid) {
				readpage += page[i];
			} else {
				student++;
				readpage = page[i];
			}
			if (student > nos) {
				return false;
			}
		}
		return true;
	}
}
