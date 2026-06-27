package lec23;

public class Word_Search { // Leetcode problem

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (word.charAt(0) == maze[i][j]) {
					boolean ans = wordSearch(maze, i, j, word, 0);
					if (ans) {
						System.out.println(ans);
						return;
					}
				}
			}
		}
		System.out.println(false);
	}

	public static boolean wordSearch(char[][] maze, int cr, int cc, String word, int index) {
		if (index == word.length()) {
			return true;
		}

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || word.charAt(index) != maze[cr][cc]) {
			return false;
		}

		maze[cr][cc] = '@';
		int[] row = { 0, 0, -1, 1 };
		int[] col = { -1, +1, 0, 0 };
		for (int i = 0; i < col.length; i++) {
			boolean ans = wordSearch(maze, cr + row[i], cc + col[i], word, index + 1);
			if (ans) {
				return true;
			}
		}
		maze[cr][cc] = word.charAt(index);

		return false;
	}

}
