package lec17;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boardPath(n, 0, "");
	}

	public static void boardPath(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");
			return;
		}
		if (curr > n) {
			return;
		}

//		boardPath(n, curr + 1, ans + 1);
//		boardPath(n, curr + 2, ans + 2);
//		boardPath(n, curr + 3, ans + 3);

		for (int dice = 1; dice <= 3; dice++) {
			boardPath(n, curr + dice, ans + dice);
		}
	}
}
