package lec9;

public class twoD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		System.out.println(arr[1][2]);
		int[][] other = arr;
		Display(arr);
	}
public static void Display(int[][] array) {
//	int row=array.length;
//	int column=array[0].length;
	for (int i=0;i<array.length;i++) {
		for (int j=0;j<array[0].length;j++) {
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
