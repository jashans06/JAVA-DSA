package lec9;

import java.util.Scanner;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		int arr[][] = new int[row][col];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}

// Hardcode Array

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };

		Wave_print(array);
	}

	public static void Wave_print(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
//				System.out.println();
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
//					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
		}
	}
}
