package lec37;

public class Diameter_of_Binary_Tree_Optimized {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dt;
		}

		public DiameterHeightPair diameter(TreeNode root) {
			if (root == null) {
				return new DiameterHeightPair();
			}

			DiameterHeightPair ldp = diameter(root.left);// (d,h) ldp=left diameter pair
			DiameterHeightPair rdp = diameter(root.right);// (d,h) rdp=right diameter pair
			DiameterHeightPair sdp = new DiameterHeightPair();
			int sd = ldp.ht + rdp.ht + 2;
			sdp.dt = Math.max(sd, Math.max(ldp.dt, rdp.dt));
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			return sdp;

		}

		class DiameterHeightPair {
			int dt = 0;
			int ht = -1;
		}
	}
}
