package lec6;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 13, -4, 5, 7 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - turn; i++) {// arr.length - turn ta kita kyuki 1 turn to baad sab to vadda
				// element last position te a chuka hunda te turn 2 vich 2
				// largest element 2nd last position ch aa chuka hunda
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
