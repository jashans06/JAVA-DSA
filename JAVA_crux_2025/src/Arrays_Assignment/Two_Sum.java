package Arrays_Assignment;

import java.util.*;

public class Two_Sum { // Brute force approach

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int target = sc.nextInt();
		int[] pairs = printTwoSum(arr, target);
		for (int i = 0; i < pairs.length; i++) {
			System.out.print(pairs[i]);
			if (i < pairs.length - 1) {
				System.out.print(" and ");
			}
		}

	}

//	public static int[] printTwoSum(int[] arr, int target) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] + arr[j] == target) {
//					return new int[] { i, j };
//
//				}
//			}
//		}
//		return new int[] { -1, -1 };

//	}

	public static int[] printTwoSum(int[] arr, int target) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			if (arr[left] + arr[right] == target) {
				return new int[] { left, right };
			} else if (arr[left] + arr[right] < target)
				left++;
			else
				right--;
		}
		return new int[] { -1, -1 };
	}

}
