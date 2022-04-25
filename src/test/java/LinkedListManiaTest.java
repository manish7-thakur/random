import org.junit.Assert;
import org.junit.Test;

public class LinkedListManiaTest {
    @Test
    public void reverseNode() {
        Node res = LinkedListMania.reverse(null);
        Assert.assertNull(res);

        Node head = new Node(5, null);
        res = LinkedListMania.reverse(head);
        Assert.assertEquals(5, res.val);

        head = new Node(5, new Node(6, null));
        res = LinkedListMania.reverse(head);
        Assert.assertEquals(6, res.val);
        Assert.assertEquals(5, res.next.val);

        head = new Node(5, new Node(6, new Node(7, null)));
        res = LinkedListMania.reverse(head);
        Assert.assertEquals(7, res.val);
        Assert.assertEquals(6, res.next.val);
        Assert.assertEquals(5, res.next.next.val);
    }

    @Test
    public void checkCycleInLinkedList() {
        Node head = null;
        boolean actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, null);
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, new Node(3, null));
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, new Node(3, new Node(4, null)));
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new Node(2, new Node(3, new Node(4, new Node(5, null))));
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        Node three = new Node(3, null);
        head = new Node(2, three);
        three.next = head;
        actual = LinkedListMania.containsCycle(head);
        Assert.assertTrue(actual);

        Node five = new Node(5, null);
        three = new Node(3, new Node(4, five));
        five.next = three;
        head = new Node(2, three);
        actual = LinkedListMania.containsCycle(head);
        Assert.assertTrue(actual);
    }
    @Test
    public void removeDuplicatesFromSortedLinkedList() {
      Node head = null;
      Node actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertNull(actual);

      head = new Node(1, null);
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, null));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, new Node(1, null)));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, new Node(2, null)));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);

      head = new Node(1, new Node(1, new Node(2, new Node(3, new Node(3, null)))));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);
      Assert.assertEquals(3, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      head = new Node(1, new Node(1, new Node(2, new Node(2, new Node(3, new Node(3, new Node(3, null)))))));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);
      Assert.assertEquals(3, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, new Node(7, null)))))));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);
      Assert.assertEquals(3, actual.next.next.val);
      Assert.assertEquals(4, actual.next.next.next.val);
      Assert.assertEquals(5, actual.next.next.next.next.val);
      Assert.assertEquals(6, actual.next.next.next.next.next.val);
      Assert.assertEquals(7, actual.next.next.next.next.next.next.val);
      Assert.assertNull(actual.next.next.next.next.next.next.next);
    }

    @Test
    public void mergeTwoLinkedLists() {
      Node h1 = null;
      Node h2 = null;
      Node actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNull(actual);

      h1 = null;
      h2 = new Node(1, null);
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(1, actual.val);

      h1 = new Node(2, null);
      h2 = null;
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(2, actual.val);

      h1 = new Node(-2, null);
      h2 = new Node(1, null);
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(-2, actual.val);
      Assert.assertEquals(1, actual.next.val);

      h1 = new Node(-2, new Node(1, null));
      h2 = new Node(1, new Node(3, null));
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(-2, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertEquals(1, actual.next.next.val);
      Assert.assertEquals(3, actual.next.next.next.val);
    }

    @Test
    public void removeElementsFromLinkedList() {
      Node head = null;
      Node actual = LinkedListMania.removeElements(head, 1);
      Assert.assertNull(head);

      head = new Node(1, null);
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertNull(actual);

      head = new Node(1, new Node(1, null));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertNull(actual);

      head = new Node(1, new Node(1, new Node(2, null)));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);

      head = new Node(1, new Node(1, new Node(2, new Node(1, null))));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, new Node(2, new Node(1, new Node(1, null)))));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertNull(actual.next);

      head = new Node(1, new Node(1, new Node(2, new Node(1, new Node(3, new Node(1, new Node(4, null)))))));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(4, actual.next.next.val);

      head = new Node(1, new Node(2, new Node(6, new Node(3, new Node(4, new Node(5, new Node(6, null)))))));
      actual = LinkedListMania.removeElements(head, 6);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);
      Assert.assertEquals(3, actual.next.next.val);
      Assert.assertEquals(4, actual.next.next.next.val);
      Assert.assertEquals(5, actual.next.next.next.next.val);
      Assert.assertNull(actual.next.next.next.next.next);
    }

    @Test
    public void removeNthFromLast() {
      Node actual = LinkedListMania.removeNthFromEnd(new Node(2), 1);
      Assert.assertNull(actual);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3)), 2);
      Assert.assertEquals(3, actual.val);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3)), 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertNull(actual.next);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3, new Node(1))), 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertNull(actual.next.next);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3, new Node(1))), 2);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertNull(actual.next.next);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3, new Node(1))), 3);
      Assert.assertEquals(3, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertNull(actual.next.next);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3, new Node(1, new Node(7)))), 4);
      Assert.assertEquals(3, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertEquals(7, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3, new Node(1, new Node(7)))), 3);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertEquals(7, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3, new Node(1, new Node(7)))), 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(1, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = LinkedListMania.removeNthFromEnd(new Node(2, new Node(3, new Node(1, new Node(7)))), 2);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(7, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);
    }

    @Test
    public void reorderLinkedList() {
      //reorder in the form of l0 -> ln -> l1 -> ln-1 -> l2 -> ln-2
      Node actual = new Node(1);
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(1, actual.val);

      actual = new Node(1, new Node(2));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);

      actual = new Node(1, new Node(2, new Node(3)));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(2, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = new Node(1, new Node(2, new Node(3, new Node(4))));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(4, actual.next.val);
      Assert.assertEquals(2, actual.next.next.val);
      Assert.assertEquals(3, actual.next.next.next.val);
      Assert.assertNull(actual.next.next.next.next);

      actual = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(5, actual.next.val);
      Assert.assertEquals(2, actual.next.next.val);
      Assert.assertEquals(4, actual.next.next.next.val);
      Assert.assertEquals(3, actual.next.next.next.next.val);
      Assert.assertNull(actual.next.next.next.next.next);

      actual = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6))))));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(6, actual.next.val);
      Assert.assertEquals(2, actual.next.next.val);
      Assert.assertEquals(5, actual.next.next.next.val);
      Assert.assertEquals(3, actual.next.next.next.next.val);
      Assert.assertEquals(4, actual.next.next.next.next.next.val);
      Assert.assertNull(actual.next.next.next.next.next.next);
    }
    @Test
    public void mergeKSortedLinkedList() {
      Node actual = LinkedListMania.mergeKLists(new Node[]{});
      Assert.assertNull(actual);

      actual = LinkedListMania.mergeKLists(new Node[]{new Node(2)});
      Assert.assertEquals(2, actual.val);
    }
}
