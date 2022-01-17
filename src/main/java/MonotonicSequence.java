import java.util.ArrayList;
import java.util.*;
/**
Longest monotonic increasing subsequence
 LONGEST-INC-SEQUENCE(Arr, n)
 len [1...n] be a new array for i←1 to n len[i] ← 1 // length of longest increasing sequence ending at i.
  for i←2 to n do
    for j←1 to i-1 do
      if Arr[j] < Arr[i] len [i] ← max(len[i], len[j] +1)
      end if
    end for
  end for
  return Max(len [1...n])
*/
public class MonotonicSequence {

    public static int findRec(int[] seq) {
      int idx = seq.length - 1;
      int rec = findRec(seq, idx);
      return rec; // can be findRec(seq, idx, seq[idx])
    }

    private static int findRec(int[] seq, int i) {
      if(i <= 0) return 1;
      int count = 1;
      for(int j = 0; j < i; j++) {
        int resj = findRec(seq, j);
        if(seq[i] > seq[j]) count = 1 + resj;
      }
      return count;
    }

    static public int findLCount(int[] nums) {
      int[] count = new int[nums.length];
      int res = 1;
      Arrays.fill(count, 1);
      for(int i = 1; i < nums.length; i++) {
        for(int j = 0; j < i; j++) {
          if(nums[j] < nums[i]) count[i] = Math.max(count[i], count[j] + 1);
        }
        res = Math.max(res, count[i]);
      }
      return res;
    }

    static public int minFlipsMonoIncr(String s) {
      int oneCount = 0;
      int flips = 0;
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '1') oneCount++;
        else flips = Math.min(flips + 1, oneCount);
      }
      return flips;
    }
}
