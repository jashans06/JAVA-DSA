package Recursion_Assignment;

import java.util.*;

public class Nth_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = printTriangle(n);
		System.out.println(ans);
	}

	public static int printTriangle(int n) {
		if (n == 1) {
			return 1;
		}
		return n * printTriangle(n - 1);
	}
}
