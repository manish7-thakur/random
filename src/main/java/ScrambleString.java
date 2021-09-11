public class ScrambleString {
  static public boolean isScramble(String s1, String s2) {
    if (s1.equals(s2))
      return true;
    int n = s1.length();
    for (int i = 1; i < n; i++) {
      boolean original = isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i));
      if(original) return true;
      boolean flipCase = isScramble(s1.substring(0, i), s2.substring( n - i)) && isScramble(s1.substring(i), s2.substring(0, n - i));
      if(flipCase) return true;
    }
    return false;
  }
}
