package lec6;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 13, -4, 5, 7 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;// index 0 (minimum value index)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}
}
