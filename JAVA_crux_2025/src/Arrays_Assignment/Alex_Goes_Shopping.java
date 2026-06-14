package Arrays_Assignment;

import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		int q = sc.nextInt(); // no of queries
		while (q-- > 0) {
			int A = sc.nextInt(); // alex has money
			int k = sc.nextInt(); // no of choices
			if (isPossible(price, A, k) == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

	public static boolean isPossible(int[] price, int A, int k) {
		int count = 0;
		for (int i = 0; i < price.length; i++) {
			if (A % price[i] == 0) {
				count++;
			}
		}
		if (count >= k) {
			return true;
		} else {
			return false;
		}
	}
}
