package lec12;

public class CB_Number { // problem 165 coding blocks

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		System.out.println(printSubstring(s));
	}

	public static int printSubstring(String s) {
		int count = 0;
		boolean[] visited = new boolean[s.length()];
		for (int length = 1; length <= s.length(); length++) {
			for (int j = length; j <= s.length(); j++) {
				int i = j - length;
				String s1 = s.substring(i, j);
//				Integer.parseInt(s1);  // converts the numeric string into int 
				if (IsCBNumber(Long.parseLong(s1)) == true && isValid(visited, i, j - 1) == true) {
					count++;

					for (int k = i; k < j; k++) { // aa loop oh number vaste jehre pehla cb no bn chuke aa te ac ohna nu
													// mark krn de aa
						visited[k] = true;
					}
				}
			}
		}
		return count;
	}

	public static boolean isValid(boolean[] visited, int i, int j) {
		for (; i < j; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean IsCBNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
