package lec32;

public class Middle_of_Linked_List { // Leetcode ques no 876

	public class ListNode { // This our node class but this is taken from leetcode
		int val;
		ListNode next;

//aa sab ac leetcode vala hi use kita aa

		ListNode() { // je user bina kise parametre de call kre te aa vala constructor chalega
		}

		ListNode(int val) { // j user iko parameter na call kre te aa vala constructor chalega
			this.val = val;
		}

		ListNode(int val, ListNode next) { // j user 2 parameter nal call kre te aa vala constructor chalega
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;

			}
			return slow;

		}

	}

}
