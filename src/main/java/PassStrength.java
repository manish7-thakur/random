import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PassStrength {
    public static int findsStrength(String s) {
      int res = 0;
      for(int j = 0; j < s.length(); j++) {
        int curr = 0;
        Set<Character> set = new HashSet<>();
        for(int i = j; i < s.length(); i++) {
          char c = s.charAt(i);
          if(!set.contains(c)) curr++;
          set.add(c);
          res += curr;
        }
      }
      return res;
    }
}
