import org.junit.*;

public class ReverseKNodeGroupTest {
	@Test
	public void reverseKGroupLinkedList() {
		Node head = new Node(1, new Node(2, null));
		Node actual = ReverseKNodeGroup.reverse(head, 1);
		Assert.assertEquals(1, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertNull(actual.next.next);

		head = new Node(1, new Node(2, null));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertNull(actual.next.next);

		head = new Node(1, new Node(2, new Node(3, null)));
		actual = ReverseKNodeGroup.reverse(head, 1);
		Assert.assertEquals(1, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(3, actual.next.next.val);
		Assert.assertNull(actual.next.next.next);

		head = new Node(1, new Node(2, new Node(3, null)));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertEquals(3, actual.next.next.val);
		Assert.assertNull(actual.next.next.next);

		head = new Node(1, new Node(2, new Node(3, null)));
		actual = ReverseKNodeGroup.reverse(head, 3);
		Assert.assertEquals(3, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(1, actual.next.next.val);
		Assert.assertNull(actual.next.next.next);

		head = new Node(1, new Node(2, new Node(3, new Node(4, null))));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertEquals(4, actual.next.next.val);
		Assert.assertEquals(3, actual.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next);

		head = new Node(1, new Node(2, new Node(3, new Node(4, null))));
		actual = ReverseKNodeGroup.reverse(head, 3);
		Assert.assertEquals(3, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(1, actual.next.next.val);
		Assert.assertEquals(4, actual.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next);

		head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		actual = ReverseKNodeGroup.reverse(head, 2);
		Assert.assertEquals(2, actual.val);
		Assert.assertEquals(1, actual.next.val);
		Assert.assertEquals(4, actual.next.next.val);
		Assert.assertEquals(3, actual.next.next.next.val);
		Assert.assertEquals(5, actual.next.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next.next);

		head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		actual = ReverseKNodeGroup.reverse(head, 3);
		Assert.assertEquals(3, actual.val);
		Assert.assertEquals(2, actual.next.val);
		Assert.assertEquals(1, actual.next.next.val);
		Assert.assertEquals(4, actual.next.next.next.val);
		Assert.assertEquals(5, actual.next.next.next.next.val);
		Assert.assertNull(actual.next.next.next.next.next);

	}
}