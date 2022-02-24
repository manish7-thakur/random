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
    @Test
    public void removeDuplicatesFromSortedLinkedList() {
      Node head = null;
      Node actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertNull(actual);

      head = new Node(1, null);
      actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertEquals(1, actual.data);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, null));
      actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertEquals(1, actual.data);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, new Node(1, null)));
      actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertEquals(1, actual.data);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, new Node(2, null)));
      actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertEquals(1, actual.data);
      Assert.assertEquals(2, actual.next.data);

      head = new Node(1, new Node(1, new Node(2, new Node(3, new Node(3, null)))));
      actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertEquals(1, actual.data);
      Assert.assertEquals(2, actual.next.data);
      Assert.assertEquals(3, actual.next.next.data);
      Assert.assertNull(actual.next.next.next);

      head = new Node(1, new Node(1, new Node(2, new Node(2, new Node(3, new Node(3, new Node(3, null)))))));
      actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertEquals(1, actual.data);
      Assert.assertEquals(2, actual.next.data);
      Assert.assertEquals(3, actual.next.next.data);
      Assert.assertNull(actual.next.next.next);

      head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, new Node(7, null)))))));
      actual = LinkedListUtil.deleteDuplicates(head);
      Assert.assertEquals(1, actual.data);
      Assert.assertEquals(2, actual.next.data);
      Assert.assertEquals(3, actual.next.next.data);
      Assert.assertEquals(4, actual.next.next.next.data);
      Assert.assertEquals(5, actual.next.next.next.next.data);
      Assert.assertEquals(6, actual.next.next.next.next.next.data);
      Assert.assertEquals(7, actual.next.next.next.next.next.next.data);
      Assert.assertNull(actual.next.next.next.next.next.next.next);
    }

    @Test
    public void mergeTwoLinkedLists() {
      Node h1 = null;
      Node h2 = null;
      Node actual = LinkedListUtil.mergeTwoLists(h1, h2);
      Assert.assertNull(actual);

      h1 = null;
      h2 = new Node(1, null);
      actual = LinkedListUtil.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(1, actual.data);

      h1 = new Node(2, null);
      h2 = null;
      actual = LinkedListUtil.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(2, actual.data);

      h1 = new Node(-2, null);
      h2 = new Node(1, null);
      actual = LinkedListUtil.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(-2, actual.data);
      Assert.assertEquals(1, actual.next.data);

      h1 = new Node(-2, new Node(1, null));
      h2 = new Node(1, new Node(3, null));
      actual = LinkedListUtil.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(-2, actual.data);
      Assert.assertEquals(1, actual.next.data);
      Assert.assertEquals(1, actual.next.next.data);
      Assert.assertEquals(3, actual.next.next.next.data);
    }
}
