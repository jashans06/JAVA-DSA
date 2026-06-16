package lec14;

public class SubArraySum_of_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 4, 5, 1, 3, 7, 8, 1 };
		int k = 3;
		System.out.println(maxSumSubArray(arr, k));
	}

	public static int maxSumSubArray(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i]; //window grow
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i]; //grow
			sum -= arr[i - k]; //shrink
			ans = Math.max(sum, ans);
		}
		return ans;
	}
}
