public class MinEditDistanceFinder {
  static public int minDistance(String word1, String word2) {
    int res = find(word1, word2, word1.length() - 1, word2.length() - 1);
    return res;
  }
  static int find(String word1, String word2, int l1, int l2) {
    if(l1 < 0 && l2 < 0) {
      return 0;
    }
    if(l1 < 0) {
      return l2 + 1;
    }
    if(l2 < 0) {
      return l1 + 1;
    }
    return 0;
  }
}
