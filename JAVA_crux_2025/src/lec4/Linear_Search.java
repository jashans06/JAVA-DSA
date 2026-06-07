package lec4;

import java.util.*;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int item = 4;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Linear_Srch(arr, item));

	}

	public static int Linear_Srch(int[] array, int item) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
