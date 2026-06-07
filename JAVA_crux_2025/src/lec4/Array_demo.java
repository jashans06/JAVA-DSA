package lec4;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		System.out.println(arr);
		// update
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 50;
		arr[3] = 40;
		arr[4] = 90;
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		int[] other = arr;
		
	}
}
