import java.util.*;

public class DistinctSubsequenceFinder {
  public static int numDistinctPermutations(String s, String t) {
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
  public static int numDistinct(String s, String t) {
    int[][] mem = new int[s.length()][t.length()];
    for(int i = 0; i < mem.length; i++) {
      Arrays.fill(mem[i], -1);
    }
    int n = find(s, s.length() - 1, t, t.length() - 1, mem);
    return n;
  }
  static int find(String s, int si, String t, int ti, int[][] mem) {
    if(ti < 0) {
      return 1;
    }
    if(si < 0) return 0;
    if(mem[si][ti] != -1) return mem[si][ti];
    int count1 = 0;
    if(s.charAt(si) == t.charAt(ti)) {
      count1 =  find(s, si - 1, t, ti - 1, mem);
    }
    int count2 = find(s, si - 1, t, ti, mem);
    mem[si][ti] = count1 + count2;
    return mem[si][ti];
  }
}
