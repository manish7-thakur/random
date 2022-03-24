import java.util.*;

public class LinkedListUtil {
    public static Node reverse(Node head) {
      Node pre = null, mid = null, tra = head;
      while(tra != null) {
        pre = mid;
        mid = tra;
        tra = tra.next;
        mid.next = pre;
      }
      return mid;
    }

    public static boolean containsCycle(Node head) {
        if (head == null) return false;
        Node first = head, second = head.next;
        while (second != null && second.next != null) {
            if (first == second) return true;
            first = first.next;
            second = second.next.next;
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
      while(traverser != null && traverser.data == val) traverser = traverser.next;
      Node res = traverser, previous = traverser;
      while(traverser != null) {
        if(traverser.data == val) {
          previous.next = traverser.next;
        } else {
          previous = traverser;
        }
        traverser = traverser.next;
      }
      return res;
    }
    static public Node removeNthFromEnd(Node head, int n) {
      Node res = new Node(-1, head);
      Node first = res, second = res;
      while(n-- > 0) second = second.next;
      while(second.next != null) {
        second = second.next;
        first = first.next;
      }
      first.next = first.next.next;
      return res.next;
    }
    static public void reorderList(Node head) {
      Node traverser = head;
      Stack<Node> s = new Stack<>();
      while(traverser != null) {
        s.push(traverser);
        traverser = traverser.next;
      }
      traverser = head;
      Node last = s.pop();
      while(traverser != last && traverser.next != last)) {
        // if(traverser.next == last) break;
        Node next = traverser.next;
        traverser.next = last;
        last.next = next;
        traverser = next;
        last = s.pop();
      }
      last.next = null;
    }
}
