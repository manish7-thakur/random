import java.util.*;

public class TextJustifier {
    static public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int curr = 0;
        int i = 0, j;
        int spaceCount = 0;
        while (i < words.length) {
            for (j = i; j < words.length; j++) {
                if (curr + words[j].length() + spaceCount == maxWidth) {
                    String str = justify(i, j, maxWidth, 1, 0, words);
                    res.add(str);
                    i = j + 1;
                    break;
                } else if (curr + words[j].length() + spaceCount > maxWidth) {
                    int spaces = maxWidth - (curr);
                    int cSpc = spaceCount == 0 ? 0:  spaces / spaceCount;
                    int exSpc = spaceCount == 0 ? spaces: spaces % spaceCount;
                    String str = justify(i, j - 1, maxWidth, cSpc, exSpc, words);
                    res.add(str);
                    i = j;
                    break;
                }
                curr += words[j].length();
                if (j + 1 == words.length) {
                    int spaces = (maxWidth - (curr));
                    int cSpc = spaceCount == 0 ? 0:  spaces / spaceCount;
                    int exSpc = spaceCount == 0 ? spaces: spaces % spaceCount;
                    String str = justify(i, j, maxWidth, cSpc, exSpc, words);
                    res.add(str);
                    i = j + 1;
                }
                spaceCount++;
            }
            curr = 0;
            spaceCount = 0;
        }
        return res;
    }

    static String justify(int i, int j, int maxWidth, int cSpc, int exSpc, String[] words) {
      String str = "";
      for (int k = i; k <= j; k++) {
        if(k == i) str = String.format("%-"+(words[k].length() + exSpc) + "s", words[k]);
        else str = str + words[k];
          if(k != j) str = str + String.format("%"+ cSpc + "s", "");
      }
      return str;
    }
}
