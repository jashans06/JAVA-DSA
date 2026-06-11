package Arrays_Assignment;

import java.util.Scanner;

public class sort_0_and_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int picked_element = arr[i]; // hand picked card
			int j = i - 1;
			while (j >= 0 && arr[j] > picked_element) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = picked_element;
		}
		return arr;
	}

}
