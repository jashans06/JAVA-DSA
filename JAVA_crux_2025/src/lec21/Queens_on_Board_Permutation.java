package lec21;

public class Queens_on_Board_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int total_queens = 2;
		boolean[] board = new boolean[n];
		permutation(board, total_queens, 0, "");
	}

	public static void permutation(boolean[] board, int total_queens, int qpsf, String ans) {
		if (total_queens == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				permutation(board, total_queens, qpsf + 1, ans + 'b' + i + 'q' + qpsf);
				board[i] = false;
			}
		}
	}
}
