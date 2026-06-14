package Arrays_Assignment;

import java.util.Iterator;
import java.util.Scanner;

public class Pair_Of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] price = new int[n];
			for (int i = 0; i < price.length; i++) {
				price[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			System.out.println();
			pairOfRoses(price, m);
		}

	}

	public static void pairOfRoses(int[] price, int m) {
		int p1 = 0;// 1st rose price
		int p2 = 0;// 2nd rose price
		int min_diff = Integer.MAX_VALUE;
		for (int i = 0; i < price.length - 1; i++) {
			
			for (int j = i + 1; j < price.length; j++) {
				int sum = price[i] + price[j];
				if (sum == m) {
					int current_diff = Math.abs(price[i] - price[j]);
					if (current_diff < min_diff) {
						min_diff = current_diff;
						p1 = price[i];
						p2 = price[j];
					}

				}
			}
		}
		int smaller = Math.min(p1, p2);
		int larger = Math.max(p1, p2);

		System.out.println("Deepak should buy roses whose prices are " + smaller + " and " + larger + ".");
	}

}
