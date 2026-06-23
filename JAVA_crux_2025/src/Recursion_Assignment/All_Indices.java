package Recursion_Assignment;

import java.util.*;

public class All_Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		List<Integer> indices = allIndices(arr, 0, m);
		System.out.println(indices);

	}

	public static List<Integer> allIndices(int[] arr, int index, int m) {
		if (index == arr.length) {
			return new ArrayList<>();
		}
		List<Integer> result = allIndices(arr, index + 1, m);
		if (arr[index] == m) {
			result.add(0, index);
		}
		return result;
	}
}
