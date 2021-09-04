public class MinEditDistanceFinder {
  static public int minDistance(String word1, String word2) {
    int[][] mem = new int[word1.length()][word2.length()];
    int res = find(word1, word2, word1.length() - 1, word2.length() - 1, mem);
    return res;
  }
  static int find(String word1, String word2, int l1, int l2, int[][] mem) {
    if(l1 < 0 && l2 < 0) {
      return 0;
    }
    if(l1 < 0) {
      return l2 + 1;
    }
    if(l2 < 0) {
      return l1 + 1;
    }
    if(mem[l1][l2] != 0) {
      return mem[l1][l2];
    }
    if(word1.charAt(l1) == word2.charAt(l2)) {
      int min = find(word1, word2, l1 - 1, l2 - 1, mem);
      mem[l1][l2] = min;
      return min;
    }
    int min = Math.min(1 + find(word1, word2, l1 - 1, l2, mem)/*delete*/, 1 + find(word1, word2, l1, l2 - 1, mem)/*insert*/);
    min = Math.min(1 + find(word1, word2, l1 - 1, l2 - 1, mem)/*replace*/, min);
    mem[l1][l2] = min;
    return min;
  }
}
