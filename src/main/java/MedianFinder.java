import java.util.*;

public class MedianFinder {
  private Queue<Integer> minHeap;
  private Queue<Integer> maxHeap;
  /**
  Intuition: Keep the left part & right part of the list sorted.
  <------>|<------->
  [0, 1, 2, 4, 5, 8] Even no. of elements. left & right part will have equal elements and top elements of both will attribute to the answer. Right part is minHeap
  which keeps 4 at the top which is part of answer. Left part is maxHeap which keeps 2 at top which is the also part of answer. answer -> (2 + 4) / 2
  <--->|<------->
  [0, 1, 2, 4, 5] For odd number of elements we keep one extra elements in minHeap(right part) which is the answer.
  we always add the element to minHeap first to find the current min after addition. if elements in minHeap(right part) becomes more than maxHeap(left part) we transfer the
  top element from minHeap to maxHeap.
  We never let maxHeap have more elements than minHeap, which arises when list is initially empty, we transfer back from maxHeap(left part) to minHeap(right part)
  */
  public MedianFinder() {
    list = new ArrayList<>();
    minHeap = new PriorityQueue<>();
    maxHeap = new PriorityQueue<>(Collections.reverseOrder());
  }
  public void addNum(int num) {
    minHeap.add(num);
    if(minHeap.size() > maxHeap.size()) maxHeap.add(minHeap.remove());
    if(maxHeap.size() > minHeap.size()) minHeap.add(maxHeap.remove());
  }

  public double findMedian() {
    return minHeap.size() == maxHeap.size() ? (minHeap.peek() + maxHeap.peek()) / 2d : minHeap.peek();
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
