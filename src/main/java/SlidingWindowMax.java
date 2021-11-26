import java.util.*;

public class SlidingWindowMax {
  static public int[] maxSlidingWindow(int[] nums, int k) {
    int resultLen = nums.length - (k - 1);
    int[] result = new int[resultLen <= 0 ? 1 : resultLen];
    int r = 0, i = 0;
    int j;
    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    for(j = 0; j < k; j++) {
      queue.add(nums[j]);
    }
    result[r] = queue.peek();
    while(j < nums.length) {
      queue.remove(nums[i]);
      i++;
      queue.add(nums[j]);
      j++;
      r++;
      result[r] = queue.peek();
    }

    return result;
  }
}
