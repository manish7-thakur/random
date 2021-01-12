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
}