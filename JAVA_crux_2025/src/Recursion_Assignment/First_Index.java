package Recursion_Assignment;

import java.util.Scanner;

public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int index = firstIndex(arr, 0, m);
		System.out.println(index);
	}

	public static int firstIndex(int[] arr, int index, int m) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == m) {
			return index;
		}
		return firstIndex(arr, index + 1, m);
	}
}
