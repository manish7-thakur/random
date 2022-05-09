import org.junit.Assert;
import org.junit.Test;

public class LinkedListManiaTest {
    @Test
    public void reverseNode() {
        ListNode res = LinkedListMania.reverse(null);
        Assert.assertNull(res);

        ListNode head = new ListNode(5, null);
        res = LinkedListMania.reverse(head);
        Assert.assertEquals(5, res.val);

        head = new ListNode(5, new ListNode(6, null));
        res = LinkedListMania.reverse(head);
        Assert.assertEquals(6, res.val);
        Assert.assertEquals(5, res.next.val);

        head = new ListNode(5, new ListNode(6, new ListNode(7, null)));
        res = LinkedListMania.reverse(head);
        Assert.assertEquals(7, res.val);
        Assert.assertEquals(6, res.next.val);
        Assert.assertEquals(5, res.next.next.val);
    }

    @Test
    public void checkCycleInLinkedList() {
        ListNode head = null;
        boolean actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new ListNode(2, null);
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new ListNode(2, new ListNode(3, null));
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new ListNode(2, new ListNode(3, new ListNode(4, null)));
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        head = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))));
        actual = LinkedListMania.containsCycle(head);
        Assert.assertFalse(actual);

        ListNode three = new ListNode(3, null);
        head = new ListNode(2, three);
        three.next = head;
        actual = LinkedListMania.containsCycle(head);
        Assert.assertTrue(actual);

        ListNode five = new ListNode(5, null);
        three = new ListNode(3, new ListNode(4, five));
        five.next = three;
        head = new ListNode(2, three);
        actual = LinkedListMania.containsCycle(head);
        Assert.assertTrue(actual);
    }
    @Test
    public void removeDuplicatesFromSortedLinkedList() {
      ListNode head = null;
      ListNode actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertNull(actual);

      head = new ListNode(1, null);
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertNull(actual.next);

      head = new ListNode(1, new ListNode(1, null));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertNull(actual.next);

      head = new ListNode(1, new ListNode(1, new ListNode(1, null)));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertNull(actual.next);

      head = new ListNode(1, new ListNode(1, new ListNode(2, null)));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);

      head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);
      Assert.assertEquals(3, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3, null)))))));
      actual = LinkedListMania.deleteDuplicates(head);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);
      Assert.assertEquals(3, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, null)))))));
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
      ListNode h1 = null;
      ListNode h2 = null;
      ListNode actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNull(actual);

      h1 = null;
      h2 = new ListNode(1, null);
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(1, actual.val);

      h1 = new ListNode(2, null);
      h2 = null;
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(2, actual.val);

      h1 = new ListNode(-2, null);
      h2 = new ListNode(1, null);
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(-2, actual.val);
      Assert.assertEquals(1, actual.next.val);

      h1 = new ListNode(-2, new ListNode(1, null));
      h2 = new ListNode(1, new ListNode(3, null));
      actual = LinkedListMania.mergeTwoLists(h1, h2);
      Assert.assertNotNull(actual);
      Assert.assertEquals(-2, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertEquals(1, actual.next.next.val);
      Assert.assertEquals(3, actual.next.next.next.val);
    }

    @Test
    public void removeElementsFromLinkedList() {
      ListNode head = null;
      ListNode actual = LinkedListMania.removeElements(head, 1);
      Assert.assertNull(head);

      head = new ListNode(1, null);
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertNull(actual);

      head = new ListNode(1, new ListNode(1, null));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertNull(actual);

      head = new ListNode(1, new ListNode(1, new ListNode(2, null)));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);

      head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, null))));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertNull(actual.next);

      head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(1, null)))));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertNull(actual.next);

      head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(1, new ListNode(4, null)))))));
      actual = LinkedListMania.removeElements(head, 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(4, actual.next.next.val);

      head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
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
      ListNode actual = LinkedListMania.removeNthFromEnd(new ListNode(2), 1);
      Assert.assertNull(actual);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3)), 2);
      Assert.assertEquals(3, actual.val);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3)), 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertNull(actual.next);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3, new ListNode(1))), 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertNull(actual.next.next);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3, new ListNode(1))), 2);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertNull(actual.next.next);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3, new ListNode(1))), 3);
      Assert.assertEquals(3, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertNull(actual.next.next);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3, new ListNode(1, new ListNode(7)))), 4);
      Assert.assertEquals(3, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertEquals(7, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3, new ListNode(1, new ListNode(7)))), 3);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(1, actual.next.val);
      Assert.assertEquals(7, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3, new ListNode(1, new ListNode(7)))), 1);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(1, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = LinkedListMania.removeNthFromEnd(new ListNode(2, new ListNode(3, new ListNode(1, new ListNode(7)))), 2);
      Assert.assertEquals(2, actual.val);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(7, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);
    }

    @Test
    public void reorderLinkedList() {
      //reorder in the form of l0 -> ln -> l1 -> ln-1 -> l2 -> ln-2
      ListNode actual = new ListNode(1);
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(1, actual.val);

      actual = new ListNode(1, new ListNode(2));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);

      actual = new ListNode(1, new ListNode(2, new ListNode(3)));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(3, actual.next.val);
      Assert.assertEquals(2, actual.next.next.val);
      Assert.assertNull(actual.next.next.next);

      actual = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(4, actual.next.val);
      Assert.assertEquals(2, actual.next.next.val);
      Assert.assertEquals(3, actual.next.next.next.val);
      Assert.assertNull(actual.next.next.next.next);

      actual = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
      LinkedListMania.reorderList(actual);
      Assert.assertEquals(5, actual.next.val);
      Assert.assertEquals(2, actual.next.next.val);
      Assert.assertEquals(4, actual.next.next.next.val);
      Assert.assertEquals(3, actual.next.next.next.next.val);
      Assert.assertNull(actual.next.next.next.next.next);

      actual = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
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
      ListNode actual = LinkedListMania.mergeKLists(new ListNode[]{});
      Assert.assertNull(actual);

      actual = LinkedListMania.mergeKLists(new ListNode[]{null});
      Assert.assertNull(actual);

      actual = LinkedListMania.mergeKLists(new ListNode[]{new ListNode(2), new ListNode(1)});
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);

      actual = LinkedListMania.mergeKLists(new ListNode[]{new ListNode(2), new ListNode(1, new ListNode(4))});
      Assert.assertEquals(1, actual.val);
      Assert.assertEquals(2, actual.next.val);
      Assert.assertEquals(4, actual.next.next.val);

      actual = LinkedListMania.mergeKLists(new ListNode[]{new ListNode(2, new ListNode(5)), new ListNode(-1, new ListNode(1, new ListNode(4))), new ListNode(0, new ListNode(2))});
      Assert.assertEquals(-1, actual.val);
      Assert.assertEquals(0, actual.next.val);
      Assert.assertEquals(1, actual.next.next.val);
      Assert.assertEquals(2, actual.next.next.next.val);
      Assert.assertEquals(2, actual.next.next.next.next.val);
      Assert.assertEquals(4, actual.next.next.next.next.next.val);
      Assert.assertEquals(5, actual.next.next.next.next.next.next.val);
    }
    @Test
    public void addTwoNumsStoredInReverse() {
      ListNode actual = LinkedListMania.addTwoNumbers(new ListNode(1), new ListNode(2));
      Assert.assertEquals(3, actual.val);

      actual = LinkedListMania.addTwoNumbers(new ListNode(5), new ListNode(5));
      Assert.assertEquals(0, actual.val);
      Assert.assertEquals(1, actual.next.val);

      actual = LinkedListMania.addTwoNumbers(new ListNode(2, new ListNode(5)), new ListNode(5));
      Assert.assertEquals(7, actual.val);
      Assert.assertEquals(5, actual.next.val);

      actual = LinkedListMania.addTwoNumbers(new ListNode(2), new ListNode(7, new ListNode(5)));
      Assert.assertEquals(9, actual.val);
      Assert.assertEquals(5, actual.next.val);

      actual = LinkedListMania.addTwoNumbers(new ListNode(9, new ListNode(9)), new ListNode(9, new ListNode(5)));
      Assert.assertEquals(8, actual.val);
      Assert.assertEquals(5, actual.next.val);
      Assert.assertEquals(1, actual.next.next.val);

      actual = LinkedListMania.addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))), new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
      Assert.assertEquals(8, actual.val);
      Assert.assertEquals(9, actual.next.val);
      Assert.assertEquals(9, actual.next.next.val);
      Assert.assertEquals(9, actual.next.next.next.val);
      Assert.assertEquals(0, actual.next.next.next.next.val);
      Assert.assertEquals(0, actual.next.next.next.next.next.val);
      Assert.assertEquals(0, actual.next.next.next.next.next.next.val);
      Assert.assertEquals(1, actual.next.next.next.next.next.next.next.val);
    }
    @Test
    public void rotateLinkedListToTheRight() {
      ListNode actual = LinkedListMania.rotate(null, 1);
      Assert.assertNull(actual);

      ListNode actual = LinkedListMania.rotate(new ListNode(2), 1);
      Assert.assertEquals(2, actual.val);
    }
}
