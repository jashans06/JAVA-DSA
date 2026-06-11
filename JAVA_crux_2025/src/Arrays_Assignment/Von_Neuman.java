package Arrays_Assignment;

import java.util.Scanner;

public class Von_Neuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int decimal = binToDec(arr);
		System.out.println(decimal);
	}

	public static int binToDec(int[] arr) {
		int n = arr.length - 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] * (int) (Math.pow(2, n));
			n--;
		}
		return sum;
	}

}
