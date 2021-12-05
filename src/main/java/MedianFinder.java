import java.util.*;

public class MedianFinder {
  private double median;
  private List<Integer> list;
  private double sum;
  public MedianFinder() {
    list = new ArrayList();
  }
  public void addNum(int num) {
    list.add(num);
    sum += num;
    median = sum / list.size();
  }
  public double findMedian() {
    return median;
  }
}
