import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KListMerger {
    static Node merge(Node[] lists) {
        int capacity = lists.length > 0 ? lists.length : 1;
        Queue<Node> minHeap = new PriorityQueue<>(capacity, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.data - o2.data;
            }
        });
        for (Node curr : lists) {
            if (curr != null) {
                minHeap.add(curr);
            }
        }
        Node traverser = new Node(0, null);
        Node head = traverser;
        //We take out & insert only one item in the heap to keep its size
        //equal to number of list rather than total elements of all lists.
        while (!minHeap.isEmpty()) {
            Node curr = minHeap.remove();
            traverser.next = curr;
            traverser = traverser.next;
            curr = curr.next;
            if (curr != null) {
                minHeap.add(curr);
            }
        }
        traverser.next = null;
        return head.next;
    }
}