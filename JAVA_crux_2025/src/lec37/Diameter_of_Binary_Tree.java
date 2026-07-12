package lec37;

public class Diameter_of_Binary_Tree {

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
			if (root == null) {
				return 0;
			}
			int ld = diameterOfBinaryTree(root.left); // ld=leftdiamter
			int rd = diameterOfBinaryTree(root.right); // rd=rightdiamter
			int sd = height(root.left) + height(root.right) + 2;  //sd=self diameter mtlb mere to pass hon vala diamter
			return Math.max(rd, Math.max(ld, sd));

		}

		public int height(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int lh = height(root.left);
			int rh = height(root.right);
			return Math.max(lh, rh) + 1;

		}
	}
}
