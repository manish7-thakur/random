import java.util.*;

public class SlidingWindowMax {
  static public int[] maxSlidingWindow(int[] nums, int k) {
    int[] result = new int[nums.length - k + 1];
    int i, r = 0;
    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    Queue<Integer> rq = new PriorityQueue<>(Comparator.reverseOrder());
    for(i = 0; i < k; i++) pq.add(nums[i]);
    while(r < result.length) {
      result[r] = pq.peek();
      rq.add(nums[i - k]);
      while(!rq.isEmpty() && pq.peek().intValue() == rq.peek().intValue()) {
        pq.remove();
        rq.remove();
      }
      if(i < nums.length) pq.add(nums[i]);
      i++;
      r++;
    }
    return result;
  }
}
