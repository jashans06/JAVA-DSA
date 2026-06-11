package Arrays_Assignment;

import java.util.*;

public class running_Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = sum(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] sum(int[] arr) {
		int n = arr.length;
		int[] sum = new int[n];
		sum[0] = arr[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = arr[i] + sum[i - 1];
		}
		return sum;
	}
}
