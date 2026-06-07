package lec4;

public class array_swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };
		int[] other = { 100, 200, 300, 400, 500, 600 };
		System.out.println(arr[0] + " " + other[0]);// 10 100
		Swap(arr, other);
		System.out.println(arr[0] + " " + other[1]);
	}

	public static void Swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}

}
