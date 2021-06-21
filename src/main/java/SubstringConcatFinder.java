import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubstringConcatFinder {
    static ArrayList<Integer> find(String s, String[] words) {
        int wordlength = words[0].length();
        int wordCount = words.length;
        ArrayList<Integer> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>(wordCount);
        createMap(map, words);
        int endPoint = s.length() - wordlength * wordCount;
        int i = 0;
        while (i <= endPoint) {
            int j = i;
            while (j + wordlength <= s.length() && map.getOrDefault(s.substring(j, j + wordlength), 0) > 0 && wordCount > 0) {
                String currWord = s.substring(j, j + wordlength);
                int count = map.get(currWord);
                map.put(word, --count);
                j += wordlength;
                wordCount--;
                if (wordCount == 0) {
                    res.add(i);
                }
            }
            createMap(map, words);
            wordCount = words.length;
            i++;
        }
        return res;
    }

    static void createMap(Map<String, Integer> map, String[] words) {
        map.clear();
        for (int i = 0; i < words.length; i++) {
            int count = map.getOrDefault(words[i], 0);
            map.put(words[i], ++count);
        }
    }
}