import java.util.*;

public class MedianFinder {
  private Queue<Integer> minHeap;
  private Queue<Integer> maxHeap;
  public MedianFinder() {
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
}
