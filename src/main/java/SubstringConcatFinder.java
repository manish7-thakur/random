import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubstringConcatFinder {
    static ArrayList<Integer> find(String s, String[] words) {
        int wordlength = words[0].length();
        int wordCount = words.length;
        ArrayList<Integer> res = new ArrayList<>();
        Map<String, Boolean> map = new HashMap<>(wordCount);
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], true);
        }
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j + wordlength <= s.length() && map.get(s.substring(j, j + wordlength)) != null && map.get(s.substring(j, j + wordlength)) && wordCount > 0) {
                map.put(s.substring(j, j + wordlength), false);
                j += wordlength;
                wordCount--;
                if (wordCount == 0) {
                    res.add(i);
                }
            }
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                map.put(entry.getKey(), true);
            }
            wordCount = words.length;
            i++;
        }
        return res;
    }
}