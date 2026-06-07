package Lec1;

import java.util.*;

public class simple_interest {

	public static void main(String[] args) {

//		Scanner js = new Scanner(System.in);
//		int p = js.nextInt();
//		int r = js.nextInt();
//		int t = js.nextInt();
//		int si = (p * r * t) / 100;
//		System.out.println(si);

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a >= b && a >= c) {
			System.out.println(a);
		}
		else if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
