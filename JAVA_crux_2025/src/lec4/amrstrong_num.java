package lec4;

import java.util.Scanner;

public class amrstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Isarmstrongnum(n));
		sc.close();

	}

	public static boolean Isarmstrongnum(int n) {
		int d = Countofdigit(n);
		int sum = 0;
		int p = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, d));
			n = n / 10;
		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}
	}

	public static int Countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
