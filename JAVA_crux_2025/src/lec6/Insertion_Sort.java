package lec6;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 3, -4, 5, 7 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int picked_element = arr[i]; // hand picked card
			int j = i - 1;
			while (j >= 0 && arr[j] > picked_element) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = picked_element;
		}
	}
}
