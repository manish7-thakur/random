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
    public static int find(int[] seq) {
      int[] res = new int[seq.length];
      Arrays.fill(res, 1);
      for(int i = 1; i < seq.length; i++) {
        for(int j = 0; j < i; j++) {
          if(seq[j] < seq[i]) res[i] = Math.max(res[i], res[j] + 1);
        }
      }
      return res[seq.length - 1];
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
