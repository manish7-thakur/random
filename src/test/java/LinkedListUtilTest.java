import org.junit.Assert;
import org.junit.Test;

public class LinkedListUtilTest {
    @Test
    public void NullNode() {
        Node res = LinkedListUtil.reverse(null);
        Assert.assertNull(res);
    }

    @Test
    public void singleNode() {
        Node head = new Node(5, null);
        Node res = LinkedListUtil.reverse(head);
        Assert.assertEquals(5, res.data);
    }

    @Test
    public void doubleNode() {
        Node head = new Node(5, new Node(6, null));
        Node res = LinkedListUtil.reverse(head);
        Assert.assertEquals(6, res.data);
        Assert.assertEquals(5, res.next.data);
    }

    @Test
    public void tripleNode() {
        Node head = new Node(5, new Node(6, new Node(7, null)));
        Node res = LinkedListUtil.reverse(head);
        Assert.assertEquals(7, res.data);
        Assert.assertEquals(6, res.next.data);
        Assert.assertEquals(5, res.next.next.data);
    }

    @Test
    public void checkCycleEmptyList() {
        Node head = null;
        boolean actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);
    }

    @Test
    public void checkCycleSingleNodeList() {
        Node head = new Node(2, null);
        boolean actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);
    }

    @Test
    public void checkCycleDoubleNodeList() {
        Node head = new Node(2, new Node(3, null));
        boolean actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);
    }

    @Test
    public void checkCycleTripleNodeList() {
        Node head = new Node(2, new Node(3, new Node(4, null)));
        boolean actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);
    }

    @Test
    public void checkCycleFourNodeList() {
        Node head = new Node(2, new Node(3, new Node(4, new Node(5, null))));
        boolean actual = LinkedListUtil.containsCycle(head);
        Assert.assertFalse(actual);
    }

    @Test
    public void checkCycleFourNodeListWithCycle() {
        Node five = new Node(5, null);
        Node three = new Node(3, new Node(4, five));
        five.next = three;
        Node head = new Node(2, five);
        boolean actual = LinkedListUtil.containsCycle(head);
        Assert.assertTrue(actual);
    }
}