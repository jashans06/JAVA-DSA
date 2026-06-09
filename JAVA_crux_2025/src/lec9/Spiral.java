package lec9;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		Diaplay_Spiral(array);
	}

	public static void Diaplay_Spiral(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;

		int total_elements = arr.length * arr[0].length;
		int count = 0;
		while (count < total_elements) {
			for (int i = minc; i <= maxc && count < total_elements; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;
			for (int i = minr; i <= maxr && count < total_elements; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < total_elements; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < total_elements; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
		}
	}
}
