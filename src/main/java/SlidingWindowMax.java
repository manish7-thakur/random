import java.util.*;

public class SlidingWindowMax {
  static public int[] maxSlidingWindow(int[] nums, int k) {
    int resultLen = nums.length - (k - 1);
    int[] result = new int[resultLen];
    int r = 0, l = 0;
    int h;
    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> removalQueue = new PriorityQueue<>(Collections.reverseOrder());
    for(h = 0; h < k; h++) {
      queue.add(nums[h]);
    }
    result[r] = queue.peek();
    while(h < nums.length) {
      if(nums[l] == queue.peek()) queue.remove();
      else removalQueue.add(nums[l]);
      while(!removalQueue.isEmpty() && queue.peek() == removalQueue.peek()) {
        queue.remove();
        removalQueue.remove();
      }
      l++;
      queue.add(nums[h]);
      h++;
      r++;
      result[r] = queue.peek();
    }
    return result;
  }
}
