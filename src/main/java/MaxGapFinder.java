import java.util.*;

public class MaxGapFinder {
  static public int maximumGap(int[] nums) {
    if(nums.length == 1) return 0;
    int maxGap = 0;
    int min = nums[0];
    int max = nums[0];
    for(int num : nums) {
      if(num < min) min = num;
      else if(num > max) max = num;
    }
    System.out.println("Mix " + min + " Max " + max);
    int bucketLen = nums.length - 1;
    int gap = (int)Math.ceil((max - min) / bucketLen);
    System.out.println("Gap " + gap);
    int[] minBucket = new int[bucketLen];
    int[] maxBucket = new int[bucketLen];
    Arrays.fill(minBucket, Integer.MAX_VALUE);
    Arrays.fill(maxBucket, Integer.MIN_VALUE);
    for(int num : nums) {
      if(num != min && num != max) {
        int idx = (num - min) / gap;
        minBucket[idx] = Math.min(num, minBucket[idx]);
        maxBucket[idx] = Math.max(num, maxBucket[idx]);
      }
    }
    int previous = min;
    for(int i = 0; i < minBucket.length; i++) {
      if(minBucket[i] != Integer.MAX_VALUE || maxBucket[i] != Integer.MIN_VALUE) {
        maxGap = Math.max(maxGap, minBucket[i] - previous);
        previous = maxBucket[i];
      }
    }
    maxGap = Math.max(maxGap, max - previous);
    return maxGap;
  }
}
