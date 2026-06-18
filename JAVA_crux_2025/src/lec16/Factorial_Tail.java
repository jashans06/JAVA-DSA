package lec16;

public class Factorial_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(Factorial(n, 1));
	}

	public static int Factorial(int n, int ans) {
		if (n == 0) {
			return ans;
		}

//		return n * Factorial(n - 1); // this is not a tail recursion

		return Factorial(n - 1, ans * n);

	}

}
