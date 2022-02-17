import org.junit.Assert;
import org.junit.Test;

public class LinkedListUtilTest {
    @Test
    public void reverseNode() {
        Node res = LinkedListUtil.reverse(null);
        Assert.assertNull(res);

        Node head = new Node(5, null);
        res = LinkedListUtil.reverse(head);
        Assert.assertEquals(5, res.data);

        head = new Node(5, new Node(6, null));
        res = LinkedListUtil.reverse(head);
        Assert.assertEquals(6, res.data);
        Assert.assertEquals(5, res.next.data);

        head = new Node(5, new Node(6, new Node(7, null)));
        res = LinkedListUtil.reverse(head);
        Assert.assertEquals(7, res.data);
        Assert.assertEquals(6, res.next.data);
        Assert.assertEquals(5, res.next.next.data);
    }

    @Test
    public void checkCycleInLinkedList() {
        Node head = null;
        boolean actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, null);
        actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, new Node(3, null));
        actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, new Node(3, new Node(4, null)));
        actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, new Node(3, new Node(4, new Node(5, null))));
        actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);

        Node three = new Node(3, null);
        head = new Node(2, three);
        three.next = head;
        actual = LinkedListUtil.containsCycle(head);
        Assert.assertTrue(actual);

        Node five = new Node(5, null);
        three = new Node(3, new Node(4, five));
        five.next = three;
        head = new Node(2, three);
        actual = LinkedListUtil.containsCycle(head);
        Assert.assertTrue(actual);
    }
}
