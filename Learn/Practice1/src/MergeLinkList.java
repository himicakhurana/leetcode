class LinkNode {
	int val;
	LinkNode next;

	LinkNode(int val) {
		this.val = val;
	}

	LinkNode(LinkNode val) {
		this(val.val);
	}
}

public class MergeLinkList {

	public static void main(String args[]) {
		LinkNode one = new LinkNode(1);

		LinkNode three = new LinkNode(3);
		one.next = three;
		LinkNode five = new LinkNode(5);
		three.next = five;

		LinkNode two = new LinkNode(2);

		LinkNode four = new LinkNode(4);
		two.next = four;
		LinkNode six = new LinkNode(6);
		four.next = six;
		merge(one, two);
	}

	private static void merge(LinkNode p1, LinkNode p2) {
		// TODO Auto-generated method stub
		if (p1 == null || p2 == null)
			return;

		LinkNode fakeHead = new LinkNode(0);
		LinkNode p = fakeHead;

		while (p1 != null && p2 != null) {
			if (p1.val <= p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}

			p = p.next;
		}

		if (p1 != null)
			p.next = p1;
		if (p2 != null)
			p.next = p2;

		fakeHead = fakeHead.next;
		while (fakeHead != null) {
			System.out.println(fakeHead.val);
			fakeHead = fakeHead.next;
		}
	}
}