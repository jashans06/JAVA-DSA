package lec9;

public class Square_Matrix_Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		Transpose(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void Transpose(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr.length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
	}
}
