package lec21;

public class Coin_Combination {

	public static void main(String[] args) {
		int[] coin = { 2, 1, 3, 5 };
		int amount = 4;
		combination(coin, amount, "", 0);
	}

	public static void combination(int[] coin, int amount, String ans, int index) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = index; i < coin.length; i++) {
			if (amount >= coin[i]) {
				combination(coin, amount - coin[i], ans + coin[i], i);
			}
		}
	}

}
