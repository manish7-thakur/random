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
  return len [n]
*/
public class MonotonicSequence {

    public static int findRec(int[] seq) {
      int idx = seq.length - 1;
      Map<String, Integer> mem = new HashMap<>();
      return findRec(seq, idx - 1, seq[idx], mem); // can be findRec(seq, idx, seq[idx])
    }

    private static int findRec(int[] seq, int i, int num, Map<String, Integer> mem) {
      if(i < 0) return 1;
      String key = i + "," + num;
      if(mem.containsKey(key)) return mem.get(key);
      int count1 = 0;
      if(seq[i] < num) count1 = 1 + findRec(seq, i - 1, seq[i], mem);
      int count2 = findRec(seq, i - 1, num, mem);
      mem.put(key, Math.max(count1, count2));
      return mem.get(key);
    }

    static public int findLCount(int[] nums) {
      int[] count = new int[nums.length];
      Arrays.fill(count, 1);
      for(int i = 1; i < nums.length; i++) {
        for(int j = 0; j < i; j++) {
          if(nums[j] < nums[i]) count[i] = Math.max(count[i], count[j] + 1);
        }
      }
      return count[count.length - 1];
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
