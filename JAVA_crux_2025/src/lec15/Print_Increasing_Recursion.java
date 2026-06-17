package lec15;

public class Print_Increasing_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Print_Increasing(n);

	}

	public static void Print_Increasing(int n) {
		if (n == 0) {
			return;
		}
		Print_Increasing(n - 1);
		System.out.println(n);
	}
}
