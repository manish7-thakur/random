public class ScrambleString {
  static public boolean isScramble(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    return isScramble(c1, 0, c1.length - 1, s2);
  }
  static boolean isScramble(char[] c1, int l, int h, String s2) {
    if(l == h) {
      return new String(c1).equals(s2);
    }
    for(int i = l; i < h; i++) {
      if(isScramble(c1, l, i, s2)) {
        return true;
      }
      if(isScramble(c1, i + 1, h, s2)) {
        return true;
      }
      swap(c1, l , i, h);
      if(isScramble(c1, l, i, s2)) {
        return true;
      }
      if(isScramble(c1, i + 1, h, s2)) {
        return true;
      }
      swap(c1, l , i, h);
    }
    return false;
  }
  static void swap(char[] c1, int l, int m, int h) {
    char[] temp = new char[h - l + 1];
    int j = 0;
    for(int i = m + 1; i <= h; i++) {
      temp[j++] = c1[i];
    }
    for(int i = l; i <= m; i++) {
      temp[j++] = c1[i];
    }
    j = 0;
    for(int i = l; i <= h; i++) {
      c1[i] = temp[j++];
    }
  }
}
