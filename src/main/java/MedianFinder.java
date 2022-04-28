import java.util.*;

public class MedianFinder {
  private Queue<Integer> minQ, maxQ;

  public MedianFinder() {
    minQ = new PriorityQueue<>();
    maxQ = new PriorityQueue<>(Comparator.reverseOrder());
  }

  public void addNum(int num) {
    minQ.add(num);
    maxQ.add(minQ.remove());
    if(maxQ.size() > minQ.size()) minQ.add(maxQ.remove());
  }

  public double findMedian() {
    return minQ.size() > maxQ.size() ? minQ.peek() : (minQ.peek() + maxQ.peek()) / 2.0;
  }

}
