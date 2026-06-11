package Arrays_Assignment;

import java.util.*;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = majorityElement(arr);
		System.out.println(ans);
	}

//	public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];
//    }
	public static int majorityElement(int[] arr) {
		int count = 0;
		int candidate = 0;
		for (int element : arr) {
			if (count == 0) {
				candidate = element;
			}
			if (element == candidate) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}

}
