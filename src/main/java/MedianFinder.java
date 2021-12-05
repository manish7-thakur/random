import java.util.*;

public class MedianFinder {
  private Queue<Integer> minHeap;
  private Queue<Integer> maxHeap;
  public MedianFinder() {
    list = new ArrayList<>();
    minHeap = new PriorityQueue();
    maxHeap = new PriorityQueue(Collections.reverseOrder());
  }
  public void addNum(int num) {
    maxHeap.add(num);
    minHeap.add(maxHeap.poll());
    if(minHeap.size() > maxHeap.size()) maxHeap.add(minHeap.poll());
  }
  public double findMedian() {
    return minHeap.size() == maxHeap.size() ? (minHeap.peek() + maxHeap.peek()) / 2d : maxHeap.peek();
  }

  private List<Integer> list;
  public void addNumS(int num) {
    int idx = Collections.binarySearch(list, num);
    int insPoint = idx < 0 ? -idx -1 : idx + 1;
    list.add(insPoint, num);
  }
  public double findMedianS() {
    int mid = list.size() / 2;
    if(list.size() % 2 != 0) return list.get(mid);
    else return (list.get(mid) + list.get(mid - 1)) / 2d;
  }
}
