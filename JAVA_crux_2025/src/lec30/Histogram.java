package lec30;

import java.util.Stack;

public class Histogram { // leetocde problem 84 Largest rectangle in Histogram

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 5, 6, 2, 3 };
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i; // i matlab apa jithe hege aa te oh je pichle element da next smaller aa te i R
							// aa
				if (st.isEmpty()) {
					int area = h * r;
					ans = Math.max(ans, area);
				} else {
					int l = st.peek();
					int area = h * (r - l - 1);
					ans = Math.max(ans, area);
				}
			}
			st.push(i);

		}
		// aa code jine element stack ch bach ge ne ohde lyi aa eda ch ac r nu
		// array.lenght man lena joki 0 houga
		// arr.length ta kyuki array 0 index hunde ne so 0 to 6 j array da size aa matlab
		// length 7 hoegi so ac 7 index nu r man lena
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (st.isEmpty()) {
				int area = h * r;
				ans = Math.max(ans, area);
			} else {
				int l = st.peek();
				int area = h * (r - l - 1);
				ans = Math.max(ans, area);
			}
		}
		return ans;
	}

}
