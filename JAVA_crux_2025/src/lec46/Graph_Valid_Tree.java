package lec46;

import java.util.*;

public class Graph_Valid_Tree { // leetcode 261

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			if (edges.length != n - 1)
				return false;
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			return BFT(map);

		}

		public boolean BFT(HashMap<Integer, List<Integer>> map) {

			HashSet<Integer> visited = new HashSet<>();
			Queue<Integer> q = new LinkedList<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				q.add(src);
				while (!q.isEmpty()) {
					int rv = q.poll();
					if (visited.contains(rv)) {
						return false;
					}
					visited.add(rv);
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {

							q.add(nbrs);
						}
					}

				}

			}
			return count == 1;
		}

	}

}