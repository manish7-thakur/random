public class DistinctSubsequenceFinder {
  public static int numDistinct(String s, String t) {
    char[] acc = new char[t.length()];
    int n = find(s, s.length() - 1, acc, acc.length - 1, t);
    return n;
  }
  static int find(String s, int slen, char[] acc, int aclen, String t) {
    if(aclen < 0) {
      if(new String(acc).equals(t)) return 1;
      return 0;
    }
    if(slen < 0) return 0;
    acc[aclen] = s.charAt(slen);
    int count1 = find(s, slen - 1, acc, aclen - 1, t);
    int count2 = find(s, slen - 1, acc, aclen, t);
    return count1 + count2;
  }
}
