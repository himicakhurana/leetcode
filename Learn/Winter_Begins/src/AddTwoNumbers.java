public class AddTwoNumbers {
	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int n1 = 0, n2 = 0;
		n1 = getNumber(l1);
		n2 = getNumber(l2);
		System.out.println(n1);
		System.out.println(n2);
		ListNode l = new ListNode(0);
		ListNode p = l;
		n1 = n1 + n2;
		int reverse = 0;
		if (n1 == 0) {
			return l;
		}
System.out.println(n1);
		while (n1 != 0) {
			reverse = reverse * 10;
			reverse = reverse + n1 % 10;
			int x = n1 % 10;
			n1 = n1 / 10;
			l.next = new ListNode(x);
			l = l.next;
		}
		ListNode ll = p.next;
		while (ll != null) {
/*			System.out.println(l.val);
*/			ll = ll.next;
		}
		return p.next;
	}

	static int getNumber(ListNode l1) {
		int number = 0, x = 0;
		while (l1 != null) {
			x = (int) (x + (Math.pow(10, number)) * l1.val);
			l1 = l1.next;
			number++;
		}

		return x;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = { 9 };
		int[] q = { 1, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		ListNode l = new ListNode(2);
		ListNode pp = l;
		ListNode l2 = new ListNode(2);
		ListNode pp2 = l2;

		for (int i : p) {
			l.next = new ListNode(i);
			l = l.next;
		}
		for (int i : q) {
			l2.next = new ListNode(i);
			l2 = l2.next;
		}

		addTwoNumbers(pp.next, pp2.next);

	}
}