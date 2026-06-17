package lec15;

public class Print_Decreasing_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PrintDecreasing(n);
	}

	public static void PrintDecreasing(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PrintDecreasing(n - 1);
	}
}
