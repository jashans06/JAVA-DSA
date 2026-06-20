package lec19;

public class Path_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 5;
		printPath(0, 0, m - 1, n - 1, "");
	}

	public static void printPath(int current_column, int current_row, int end_row, int end_column, String ans) {
		// TODO Auto-generated method stub
		if (current_row == end_row && current_column == end_column) {
			System.out.println(ans);
			return;
		}
		if (current_row > end_row || current_column > end_column) {
			return;
		}
		printPath(current_column + 1, current_row, end_row, end_column, ans + "H");
		printPath(current_column, current_row + 1, end_row, end_column, ans + "V");
	}

}
