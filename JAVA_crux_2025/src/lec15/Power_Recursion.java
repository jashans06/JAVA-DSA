package lec15;

public class Power_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int n = 5;
		System.out.println(Power(x, n));
	}

	public static int Power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = Power(x, n - 1);
		return ans * x;
	}
}
