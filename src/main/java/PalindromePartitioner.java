public class PalindromePartitioner {
  static public int minCut(String s) {
    return findMinCut(s, 0, s.length() - 1);
  }
  static int findMinCut(String s, int start, int end) {
    if(start >= end) {
      return 0;
    }
    if(isPalindrome(s, start, end)) {
      return 0;
    }
    int min = Integer.MAX_VALUE;
    for(int i = start; i < end; i++) {
      min = Math.min(min, 1 + findMinCut(s, start, i) + findMinCut(s, i + 1, end));
    }
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
