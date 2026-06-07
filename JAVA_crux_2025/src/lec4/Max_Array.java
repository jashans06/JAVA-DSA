package lec4;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 8, 99, 7 };
		System.out.println(max(arr));
		System.out.println(max2(arr));

	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int max2(int[] array) {
		int max = Integer.MIN_VALUE;// 2^31
		for (int i = 0; i < array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			}
			max = Math.max(array[i], max);
		}
		return max;
	}

}
