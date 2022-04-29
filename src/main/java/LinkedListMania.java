import java.util.*;

public class LinkedListMania {
    public static ListNode reverse(ListNode head) {
      ListNode pre = null, mid = null, tra = head;
      while(tra != null) {
        pre = mid;
        mid = tra;
        tra = tra.next;
        mid.next = pre;
      }
      return mid;
    }

    public static boolean containsCycle(ListNode head) {
        if (head == null) return false;
        ListNode first = head, second = head.next;
        while (second != null && second.next != null) {
            if (first == second) return true;
            first = first.next;
            second = second.next.next;
        }
        return false;
    }
    static public ListNode deleteDuplicates(ListNode head) {
      ListNode curr = head, traverser;
      while(curr != null) {
        traverser = curr.next;
        while(traverser != null && traverser.val == curr.val) traverser = traverser.next;
        curr.next = traverser;
        curr = traverser;
      }
      return head;
    }
    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode traverser = new ListNode(0, null);
      ListNode head = traverser;
      while(list1 != null && list2 != null) {
        if(list1.val < list2.val) {
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
    static public ListNode removeElements(ListNode head, int val) {
      ListNode traverser = head;
      while(traverser != null && traverser.val == val) traverser = traverser.next;
      ListNode res = traverser, previous = traverser;
      while(traverser != null) {
        if(traverser.val == val) {
          previous.next = traverser.next;
        } else {
          previous = traverser;
        }
        traverser = traverser.next;
      }
      return res;
    }
    static public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode res = new ListNode(-1, head);
      ListNode first = res, second = res;
      while(n-- > 0) second = second.next;
      while(second.next != null) {
        second = second.next;
        first = first.next;
      }
      first.next = first.next.next;
      return res.next;
    }
    static public void reorderList(ListNode head) {
      ListNode traverser = head;
      Stack<ListNode> s = new Stack<>();
      while(traverser != null) {
        s.push(traverser);
        traverser = traverser.next;
      }
      traverser = head;
      ListNode last = s.pop();
      while(traverser != last && traverser.next != last) {
        ListNode next = traverser.next;
        traverser.next = last;
        last.next = next;
        traverser = next;
        last = s.pop();
      }
      last.next = null;
    }
    static ListNode mergeKLists(ListNode[] lists) {
      ListNode traverser = new ListNode(0);
      ListNode res = traverser;
      Queue<ListNode> q = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));
      for(ListNode n : lists) {
        if(n != null) {
          q.add(n);
          n = n.next;
        }
      }
      while(!q.isEmpty()) {
        ListNode curr = q.remove();
        traverser.next = curr;
        curr = curr.next;
        if(curr != null) q.add(curr);
        traverser = traverser.next;
      }
      return res.next;
    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode traverser = new ListNode(-1);
      ListNode res = traverser;
      int carry = 0;
      while(l1 != null && l2 != null) {
        int sum = l1.val + l2.val + carry;
        carry = sum / 10;
        sum = sum % 10;
        traverser.next = new ListNode(sum);
        l1 = l1.next;
        l2 = l2.next;
        traverser = traverser.next;
      }
      while(l1 != null) {
        int sum = l1.val + carry;
        carry = sum / 10;
        sum = sum % 10;
        traverser.next = new ListNode(sum);
        l1 = l1.next;
        traverser = traverser.next;
      }
      while(l2 != null) {
        int sum = l2.val + carry;
        carry = sum / 10;
        sum = sum % 10;
        traverser.next = new ListNode(sum);
        l2 = l2.next;
        traverser = traverser.next;
      }
      if(carry > 0) traverser.next = new ListNode(carry);
      return res.next;
    }
}
