package lec32;

public class Intersection_of_Two_Linked_List {

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

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode A = headA;
			ListNode B = headB;
			while (A != B) {
				if (A == null) {
					A = headB;
				} else {
					A = A.next;
				}
				if (B == null) {
					B = headA;
				} else {
					B = B.next;
				}
			}
			return A; // or return B because when they reach at intersection point it doesnt matter
						// whether we return A or return B
		}
	}
}