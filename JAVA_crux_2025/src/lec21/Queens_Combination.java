package lec21;

public class Queens_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int total_queens = 2;
		boolean[] board = new boolean[n];
		combination(board, total_queens, 0, "", 0);
	}
                                                                     //qpsf-queen place so far
	public static void combination(boolean[] board, int total_queens, int qpsf, String ans, int index) {
		if (total_queens == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = index; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				combination(board, total_queens, qpsf + 1, ans + 'b' + i + 'q' + qpsf, i + 1);
				board[i] = false;
			}
		}
	}
}
