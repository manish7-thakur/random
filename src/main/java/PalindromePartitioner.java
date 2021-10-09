import java.util.Arrays;

public class PalindromePartitioner {
  static public int minCut(String s) {
    int[][] memCount = new int[s.length()][s.length()];
    int[][] memP = new int[s.length()][s.length()];
    for(int i = 0; i < memCount.length; i++) {
      Arrays.fill(memCount[i], -1);
      Arrays.fill(memP[i], -1);
    }
    return findMinCut(s, 0, s.length() - 1, memCount, memP);
  }
  static int findMinCut(String s, int start, int end, int[][] memCount, int[][] memP) {
    if(start >= end || isPalindrome(s, start, end, memP)) {
      return 0;
    }
    if(memCount[start][end] != -1) {
      return memCount[start][end];
    }
    int min = Integer.MAX_VALUE;
    for(int i = start; i < end; i++) {
      if(isPalindrome(s, i + 1, end, memP)) // can be switched with isPalindrome(s, start, i, memP), reduces calls
      min = Math.min(min, 1 + findMinCut(s, start, i, memCount, memP) + findMinCut(s, i + 1, end, memCount, memP) /*can be removed since we already check if it is palindrome*/);
    }
    memCount[start][end] = min;
    return min;
  }

  static boolean isPalindrome(String s, int start, int end, int[][] memP) {
    if(start >= end) return true;
    if(memP[start][end] == -1) {
      if(isPalindrome(s, start + 1, end - 1, memP) && s.charAt(start) == s.charAt(end)) {
        memP[start][end] = 1;
      } else {
        memP[start][end] = 2;
      }
    }
    return memP[start][end] == 1;
  }
}
