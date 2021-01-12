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
}