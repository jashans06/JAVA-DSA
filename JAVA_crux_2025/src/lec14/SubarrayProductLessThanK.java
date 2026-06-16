package lec14;

public class SubarrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(numSubarrayProductLessThanK(arr, k));
	}

	public static int numSubarrayProductLessThanK(int[] arr, int k) {
		int start_index = 0;
		int end_index = 0;
		int product = 1;
		int ans = 0;
		while (end_index < arr.length) {
			// growing code
			product *= arr[end_index];

			// shrinking
			while (product >= k && start_index <= end_index) {
				product /= arr[start_index];
				start_index++;
			}

			// ans update
			ans += (end_index - start_index + 1);
			end_index++;
		}
		return ans;
	}
}
