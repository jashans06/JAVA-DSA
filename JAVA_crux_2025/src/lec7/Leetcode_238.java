package lec7;
import java.util.Arrays;
public class Leetcode_238 { // product of array except the element itself
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] product = Product(arr);
//		System.out.println(Product(arr));
		System.out.println(Arrays.toString(product));

	}

	public static int[] Product(int[] arr) {
		int n = arr.length;
		int[] left_arr_product = new int[n];
		left_arr_product[0] = 1;
		for (int i = 1; i < n; i++) {
			left_arr_product[i] = left_arr_product[i - 1] * arr[i - 1];
		}
		int[] right_arr_product = new int[n];
		right_arr_product[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right_arr_product[i] = right_arr_product[i + 1] * arr[i + 1];
		}
		int[] product=new int[n];
		for (int i = 0; i < n; i++) {
			product[i]=left_arr_product[i]*right_arr_product[i];
		}
		return product;
	}

}
