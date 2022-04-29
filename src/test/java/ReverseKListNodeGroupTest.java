import org.junit.*;

public class ReverseKListNodeGroupTest {
	@Test
	public void reverseKGroupLinkedList() {
		ListNode head = new ListNode(1, new ListNode(2, null));
		ListNode actual = ReverseKNodeGroup.reverse(head, 1);
		Assert.assertEquals(1, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertNull(actual.next.next);

		head = new ListNode(1, new ListNode(2, null));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertNull(actual.next.next);

		head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
		actual = ReverseKNodeGroup.reverse(head, 1);
		Assert.assertEquals(1, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(3, actual.next.next.val);
		Assert.assertNull(actual.next.next.next);

		head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertEquals(3, actual.next.next.val);
		Assert.assertNull(actual.next.next.next);

		head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
		actual = ReverseKNodeGroup.reverse(head, 3);
		Assert.assertEquals(3, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(1, actual.next.next.val);
		Assert.assertNull(actual.next.next.next);

		head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertEquals(4, actual.next.next.val);
		Assert.assertEquals(3, actual.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next);

		head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
		actual = ReverseKNodeGroup.reverse(head, 3);
		Assert.assertEquals(3, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(1, actual.next.next.val);
		Assert.assertEquals(4, actual.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next);

		head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertEquals(4, actual.next.next.val);
		Assert.assertEquals(3, actual.next.next.next.val);
		Assert.assertEquals(5, actual.next.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next.next);

		head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		actual = ReverseKNodeGroup.reverse(head, 3);
		Assert.assertEquals(3, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(1, actual.next.next.val);
		Assert.assertEquals(4, actual.next.next.next.val);
		Assert.assertEquals(5, actual.next.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next.next);

	}
}