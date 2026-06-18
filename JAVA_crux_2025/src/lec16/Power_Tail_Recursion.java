package lec16;

public class Power_Tail_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4;
		int n = 5;
		System.out.println(Power(x, n, 1));
	}

	public static int Power(int x, int n, int ans) {
		if (n == 0) {
			return ans;
		}
		return Power(x, n - 1,ans * x);
	}

}
