package linkedlist;

//LEETCODE PROBLEM 141

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycle141 {

	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;

		ListNode head = l1;
		System.out.println(hasCycle(head));
	}
}