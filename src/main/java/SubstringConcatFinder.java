import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubstringConcatFinder {
    static ArrayList<Integer> find(String s, String[] words) {
        int wordLength = words[0].length();
        int wordCount = words.length;
        ArrayList<Integer> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>(wordCount);
        Map<String, Integer> tempMap = new HashMap<>(wordCount);
        for (int i = 0; i < wordCount; i++) {
            int count = map.getOrDefault(words[i], 0);
            map.put(words[i], ++count);
        }
        int strLen = s.length();
        int endPoint = strLen - wordLength * wordCount;
        int i = 0;
        while (i <= endPoint) {
            int j = i;
            tempMap.clear();
            while (j + wordLength <= strLen && wordCount > 0) {
                String currWord = s.substring(j, j + wordLength);
                int count = tempMap.getOrDefault(currWord, 0);
                if (!(map.getOrDefault(currWord, 0) > count))
                    break;
                tempMap.put(currWord, ++count);
                j += wordLength;
                wordCount--;
            }
            if (wordCount == 0) {
                res.add(i);
            }
            wordCount = words.length;
            i++;
        }
        return res;
    }
}