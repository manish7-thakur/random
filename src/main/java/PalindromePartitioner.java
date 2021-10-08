import java.util.Arrays;

public class PalindromePartitioner {
  static public int minCut(String s) {
    int[][] mem = new int[s.length()][s.length()];
    for(int[] arr : mem) {
      Arrays.fill(arr, -1);
    }
    return findMinCut(s, 0, s.length() - 1, mem);
  }
  static int findMinCut(String s, int start, int end, int[][] mem) {
    if(start >= end || isPalindrome(s, start, end)) {
      return 0;
    }
    if(mem[start][end] != -1) {
      return mem[start][end];
    }
    int min = Integer.MAX_VALUE;
    for(int i = start; i < end; i++) {
      min = Math.min(min, 1 + findMinCut(s, start, i, mem) + findMinCut(s, i + 1, end, mem));
    }
    mem[start][end] = min;
    return min;
  }

  static boolean isPalindrome(String s, int start, int end) {
    while(start < end) {
      if(s.charAt(start) != s.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
