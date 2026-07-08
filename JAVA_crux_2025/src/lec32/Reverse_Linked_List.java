package lec32;

public class Reverse_Linked_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseList(ListNode head) {
			ListNode current = head;
			ListNode previous = null;
			while (current != null) {
				ListNode ahead = current.next;
				current.next = previous;
				previous = current;
				current = ahead;

			}
			return previous;
		}
	}

}
