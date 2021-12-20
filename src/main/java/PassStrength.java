import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PassStrength {
    public static int findPasswordStrength(String password) {
        HashMap<String, Integer> mem = new HashMap<>();
        int res = 0;
        int iter = 0;
        while(iter < password.length()) {
            for (int i = 0; i < password.length(); i++) {
                int count = mem.getOrDefault(password.substring(i, iter+1), 0);
                if(count== 0) {
                    Set<Character> set = new HashSet<>();
                    for (int j = i; j <= iter; j++) {
                        set.add(password.charAt(j));
                    }
                    res += set.size();
                } else res+=count;

            }
            iter++;
        }
        return res;
    }
}
