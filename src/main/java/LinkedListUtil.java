public class LinkedListUtil {
    public static Node reverse(Node head) {
        Node a = null, b = null, c = head;
        while (c != null) {
            a = b;
            b = c;
            c = c.next;
            b.next = a;
        }
        return b;
    }

    public static boolean containsCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node first = head;
        Node second = head.next;
        while (second != null) {
            if (first == second) {
                return true;
            }
            first = first.next;
            if (second.next == null) {
                return false;
            } else {
                second = second.next.next;
            }
        }
        return false;
    }
    static public Node deleteDuplicates(Node head) {
      Node curr = head, traverser;
      while(curr != null) {
        traverser = curr.next;
        while(traverser != null && traverser.data == curr.data) traverser = traverser.next;
        curr.next = traverser;
        curr = traverser;
      }
      return head;
    }
    static public Node mergeTwoLists(Node list1, Node list2) {
      Node traverser = new Node(0, null);
      Node head = traverser;
      while(list1 != null && list2 != null) {
        if(list1.data < list2.data) {
          traverser.next = list1;
          list1 = list1.next;
        } else {
          traverser.next = list2;
          list2 = list2.next;
        }
        traverser = traverser.next;
      }
      if(list1 != null) traverser.next = list1;
      else traverser.next = list2;
      return head.next;
    }
    static public Node removeElements(Node head, int val) {
      Node traverser = head;
      Node previous = new Node(0, null);
      Node res = previous;
      while(traverser != null) {
        if(traverser.data == val) {
          previous.next = traverser.next;
        } else {
          previous = traverser;
        }
        traverser = traverser.next;
      }
      return res.next;
    }
}
