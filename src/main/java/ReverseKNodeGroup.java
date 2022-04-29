public class ReverseKNodeGroup {
    static class Pair {
        private ListNode head;
        private ListNode mid;
        private ListNode traverser;

        public Pair(ListNode head, ListNode mid, ListNode traverser) {
            this.head = head;
            this.mid = mid;
            this.traverser = traverser;
        }

        public ListNode getHead() {
            return head;
        }

        public ListNode getMid() {
            return mid;
        }

        public ListNode getTraverser() {
            return traverser;
        }
    }

    static ListNode reverse(ListNode head, int k) {
        ListNode start = head;
        int count = 0;
        while (start != null) {
            count++;
            start = start.next;
        }
        int groups = count / k;
        ListNode newHead = head;
        ListNode previousHead = head;
        ListNode traverser = head;

        if (groups > 0) {
            Pair p = reverseNodesBy(traverser, k);
            traverser = p.getTraverser();
            newHead = p.getMid();
            groups--;
        }

        while (groups > 0) {
            Pair p = reverseNodesBy(traverser, k);
            previousHead.next = p.getMid();
            traverser = p.getTraverser();
            previousHead = p.getHead();
            groups--;
        }
        previousHead.next = traverser;
        return newHead;
    }

    private static Pair reverseNodesBy(ListNode head, int count) {
        ListNode start = null;
        ListNode mid = null;
        ListNode traverser = head;

        while (count > 0) {
            start = mid;
            mid = traverser;
            traverser = traverser.next;
            mid.next = start;
            count--;
        }
        return new Pair(head, mid, traverser);
    }
}