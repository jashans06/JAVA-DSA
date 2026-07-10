package lec35;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public Binary_Tree() {
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean(); // hlc = has left child
		if (hlc) { // j left child hai te kuch krna
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean(); // hrc= has right child
		if (hrc) { // j right child hai te kuch krna
			nn.right = CreateTree();
		}
		return nn;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = "";
		s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.left, item);
		return left || right;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(node.left);
		int right = max(node.right);
		return Math.max(node.val, Math.max(left, right));

	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int left = min(node.left);
		int right = min(node.right);
		return Math.min(node.val, Math.min(left, right));

	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1; // j ac base case ch -1 return kita te single node di height 0 mani jaegi te j 0
						// return kita te single node di height 1 mani jaegi
		}

		int left = height(node.left);
		int right = height(node.right);
		return Math.max(left, right) + 1;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();

	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();

	}

	private void PostOrder(Node node) {
		if (node == null) {
			return;
		}

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void InOrder() {
		InOrder(this.root);
		System.out.println();

	}

	private void InOrder(Node node) {
		if (node == null) {
			return;
		}

		InOrder(node.left);
		System.out.print(node.val + " ");
		InOrder(node.right);

	}

	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node remove = q.poll(); // poll v agge to ii remove krda node nu remove first
			System.out.print(remove.val + " ");
			if (remove.left != null) {
				q.add(remove.left);
			}
			if (remove.right != null) {
				q.add(remove.right);
			}
		}
		System.out.println();
	}

}
