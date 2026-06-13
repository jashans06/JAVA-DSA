package Arrays_Assignment;

import java.util.*;

public class Inverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] inv = Inverse(arr);
		for (int i = 0; i < inv.length; i++) {
			System.out.print(inv[i] + " ");
		}
	}

	public static int[] Inverse(int[] arr) { // 1 2 3 4 5
		int n = arr.length;
		int[] inv = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			inv[temp] = i;
		}
		return inv;
	}

}
