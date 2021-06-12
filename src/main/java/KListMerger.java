import java.util.*;

public class KListMerger {
	static Node merge(Node[] lists) {
		Queue<Node> minHeap = new PriorityQueue<>(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.data - o2.data;
			}
		});
		for(Node list: lists) {
			while(list != null) {
				minHeap.add(list);
				list = list.next;
			}
		}
		Node newList = new Node(0, null);
		Node head = newList;
		while(!minHeap.isEmpty()) {
			newList.next = minHeap.remove();
			newList = newList.next;
		}
		return head.next;
	}
}