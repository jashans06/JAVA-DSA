package lec20;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		towerOfHanoi(n, "A", "B", "C");
	}

	private static void towerOfHanoi(int n, String src, String helper, String destination) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, src, destination, helper);
		System.out.println("Move " + n + "th from " + src + " to " + destination);
		towerOfHanoi(n - 1, helper, src, destination);
	}

}
