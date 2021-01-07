import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        int sLen = s.length();
        int[][] mem = new int[sLen][sLen];
        Map<Character, ArrayList<Integer>> idxMap = new HashMap<>(sLen);
        String res = "" + s.charAt(0);
        int resLen = 1;
        for (int i = 0; i < sLen; i++) {
            char c = s.charAt(i);
            ArrayList<Integer> idxList = idxMap.getOrDefault(c, new ArrayList<>());
            int idxListSize = idxList.size();
            if (idxListSize > 0) {
                for (int j = 0; j < idxListSize; j++) {
                    int l = idxList.get(j);
                    int r = i;
                    int isPalin = mem[l+1][r-1];
                    if(isPalin == 0) {
                        if(isPalindrome(s, l+1, r-1)) {
                            mem[l+1][r-1] = 1;
                            mem[l][r] = 1;
                        } else {
                            mem[l+1][r-1] = 2;
                            mem[l][r] = 2;
                        }
                    } else if(isPalin == 1) {
                        mem[l][r] = 1;
                    } else {
                        mem[l][r] = 2;
                    }
                    if (mem[l][r] == 1 && r - l + 1 > resLen) {
                        res = s.substring(l, r + 1);
                        resLen = res.length();
                    }
                }
            }
            idxList.add(i);
            idxMap.put(c, idxList);
        }
        return res;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}