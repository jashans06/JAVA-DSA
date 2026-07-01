package lec26;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 3, 4, 2 };
		arr = mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] mergeSort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] baseCaseArr = new int[1];
			baseCaseArr[0] = arr[si];
			return baseCaseArr;
		}
		int mid = (si + ei) / 2;
		int[] firstSortedArr = mergeSort(arr, si, mid); // start to leke mid tak sort krke liyade
		int[] secondSortedArr = mergeSort(arr, mid + 1, ei); // mid + 1 to end tak sort krke leyade
		return mergeArrays(firstSortedArr, secondSortedArr);
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0; // arr1 control
		int j = 0; // arr2 control
		int k = 0;// ans array control
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}
