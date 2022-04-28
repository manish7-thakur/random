import java.util.*;

public class MedianFinder {
  Queue<Integer> minQ;
  Queue<Integer> maxQ;

  public MedianFinder() {
    minQ = new PriorityQueue<>();
    maxQ = new PriorityQueue<>(Comparator.reverseOrder());
  }

  public void addNum(int num) {
    maxQ.add(num);
    if(maxQ.size() > minQ.size()) minQ.add(maxQ.remove());
  }

  public double findMedian() {
    if(minQ.size() > maxQ.size()) return minQ.peek();
    return (minQ.peek() + maxQ.peek()) / 2.0;
  }

}
