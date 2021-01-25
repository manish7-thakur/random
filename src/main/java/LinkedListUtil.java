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
        if(head == null) {
            return false;
        }
        Node first = head;
        Node second = head.next;
        while(second != null) {
            // if(second == null) {
            //     return false;
            // }
            if(first == second) {
                return true;
            }
            first = first.next;
            if(second.next == null) {
                return false;
            } else {
            second = second.next.next;
            }
        }
        return false;
    }
}