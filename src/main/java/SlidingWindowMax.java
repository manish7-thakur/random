import java.util.*;

public class SlidingWindowMax {
  static public int[] maxSlidingWindow(int[] nums, int k) {
    int resultLen = nums.length - (k - 1);
    int[] result = new int[resultLen];
    int i, r = 0;
    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    Queue<Integer> rq = new PriorityQueue<>(Comparator.reverseOrder());
    for(i = 0; i < k; i++) pq.add(nums[i]);
    while(r < result.length) {
      int top = pq.peek();
      result[r] = top;
      rq.add(nums[i - k]);
      if(i < nums.length) pq.add(nums[i]);
      while(!rq.isEmpty() && pq.peek().intValue() == rq.peek().intValue()) {
        pq.remove();
        rq.remove();
      }
      i++;
      r++;
    }
    return result;
  }
}
