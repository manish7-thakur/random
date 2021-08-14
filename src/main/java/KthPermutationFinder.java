import java.util.Arrays;
import java.util.*;

public class KthPermutationFinder {
  public static String getPermutation(int n, int k) {
    int curr = 0;
    StringBuilder sb = new StringBuilder(n);
    for(int i = 1; i <= n; i++) {
      sb.append(i);
    }
    List<String> list = permutate(sb.toString(), k);
    return list.get(k-1);
  }
  private static List<String> permutate(String s, int k) {
    List<String> list = new ArrayList<>();
    if(s.length() == 1) {
      list.add(s);
      return list;
    }
    for(int i = 0; i < s.length(); i++) {
      List<String> curr = permutate(s.substring(0, i) + s.substring(i+1), k);
      for(String str: curr) {
        list.add(s.charAt(i) + str);
      }
    }
    return list;
  }
}
