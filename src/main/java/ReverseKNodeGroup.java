public class ReverseKNodeGroup {
    static class Pair {
        private Node head;
        private Node mid;
        private Node traverser;

        public Pair(Node head, Node mid, Node traverser) {
            this.head = head;
            this.mid = mid;
            this.traverser = traverser;
        }

        public Node getHead() {
            return head;
        }

        public Node getMid() {
            return mid;
        }

        public Node getTraverser() {
            return traverser;
        }
    }

    static Node reverse(Node head, int k) {
        Node start = head;
        int count = 0;
        while (start != null) {
            count++;
            start = start.next;
        }
        int groups = count / k;
        int startCount = groups;
        Node newHead = head;
        Node previousHead = head;
        Node traverser = head;

        if(groups > 0) {
            Pair p = reverseNodesBy(traverser, k);
            traverser = p.getTraverser();
            newHead = p.getMid();
            groups--;
            if(groups == 0) {
                previousHead.next = traverser;
            }
        }

        while (groups > 0) {
            Pair p = reverseNodesBy(traverser, k);
            previousHead.next = p.getMid();
            previousHead = p.getHead();
            traverser = p.getTraverser();
            groups--;
            if(groups == 0 && traverser != null) {
                previousHead.next = traverser;
            }
        }
        return newHead;
    }

    private static Pair reverseNodesBy(Node head, int count) {
        Node start = null;
        Node mid = null;
        Node traverser = head;

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