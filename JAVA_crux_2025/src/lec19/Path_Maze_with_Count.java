package lec19;

public class Path_Maze_with_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 5;
		System.out.println("\n" + printPath(0, 0, m - 1, n - 1, ""));
	}

	public static int printPath(int current_column, int current_row, int end_row, int end_column, String ans) {
		
		if (current_row == end_row && current_column == end_column) {
			System.out.println(ans);
			return 1;
		}
		if (current_row > end_row || current_column > end_column) {
			return 0;
		}
		int a1 = printPath(current_column + 1, current_row, end_row, end_column, ans + "H");
		int b1 = printPath(current_column, current_row + 1, end_row, end_column, ans + "V");
		return a1 + b1;
	}
}
