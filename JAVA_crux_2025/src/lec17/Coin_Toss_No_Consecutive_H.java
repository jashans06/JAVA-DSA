package lec17;

public class Coin_Toss_No_Consecutive_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		coinToss(n, "");
	}

	public static void coinToss(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			coinToss(n - 1, ans + "H");
		}

		coinToss(n - 1, ans + "T");
	}
}
