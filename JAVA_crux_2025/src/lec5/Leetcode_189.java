package lec5;

public class Leetcode_189 {
//Rotate array ques 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
// 1st method (not optimized) 
//	public static void Rotate(int[] arr, int k) {
//		int n = arr.length;
//		k = k % n;
//		for (int j = 1; j <= k; j++) {
//			int last_element = arr[n - 1];
//
//			for (int i = n - 2; i >= 0; i--) {
//				arr[i + 1] = arr[i];
//			}
//			arr[0] = last_element;
//		}
//	}

//	2nd method (Reversal Algorithm)
	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n - k - 1);// first 0 to n-k elements
		reverse(arr, n - k, n - 1);//last vale k  elements
		reverse(arr, 0, n - 1);// whole array
	}

	public static void reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
