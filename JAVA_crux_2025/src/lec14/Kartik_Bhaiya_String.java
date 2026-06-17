package lec14;

import java.util.Scanner;

public class Kartik_Bhaiya_String { // code gym problem 446

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		int flip_a = MaxLenOfString(s, 'a', k);
		int flip_b = MaxLenOfString(s, 'b', k);
		System.out.println(Math.max(flip_a, flip_b));
	}

	public static int MaxLenOfString(String str, char ch, int k) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
// window grow
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// window shrink
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
//			ans update
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}
}
