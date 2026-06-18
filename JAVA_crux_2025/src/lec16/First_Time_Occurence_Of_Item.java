package lec16;

public class First_Time_Occurence_Of_Item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3 };
		int item = 3;
		System.out.println(FirstIndex(arr, 0, item));
	}

	public static int FirstIndex(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}
		return FirstIndex(arr, i + 1, item);
	}
}
