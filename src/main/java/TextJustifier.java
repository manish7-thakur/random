import java.util.ArrayList;
import java.util.List;

public class TextJustifier {
    static public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>(words.length);
        int curr = 0;
        int i = 0, j;
        while (i < words.length) {
            for (j = i; j < words.length; j++) {
              int textLen = curr + words[j].length();
                if (textLen + j - i == maxWidth) {
                    String str = justify(i, j, maxWidth, textLen, words, false);
                    res.add(str);
                    i = j + 1;
                    break;
                } else if (textLen + j - i > maxWidth) {
                    String str = justify(i, j - 1, maxWidth, curr, words, false);
                    res.add(str);
                    i = j;
                    break;
                }
                curr += words[j].length();
                if (j + 1 == words.length) {
                    String str = justify(i, j, maxWidth, curr, words, true);
                    res.add(str);
                    i = j + 1;
                }
            }
            curr = 0;
        }
        return res;
    }

    static String justify(int i, int j, int maxWidth, int textLen, String[] words, boolean lastLine) {
      if(i == j) {
        return String.format("%-" + maxWidth + "s", words[i]);
      }
      StringBuilder sb = new StringBuilder(maxWidth);
      int exSpc;
      int cSpc;
      if(lastLine) {
        cSpc = 1;
        exSpc = maxWidth - (textLen + j - i);
      } else {
        int spaceCount = j - i;
        int spaces = maxWidth - textLen;
        exSpc = spaces % spaceCount;
        cSpc = spaces / spaceCount;
      }
      sb.append(String.format("%-" + (words[i].length() + cSpc) + "s", words[i]));
      String cSpcStr = String.format("%-" + cSpc + "s", "");
      for(int k = i + 1; k <= j; k++) {
        if(!lastLine && exSpc > 0) {
          sb.append(" ");
          exSpc--;
        }
        sb.append(words[k]);
        if(k != j) {
          sb.append(cSpcStr);
        }
      }
      if(lastLine && exSpc > 0) {
        sb.append(String.format("%-" + (maxWidth - sb.length()) + "s", ""));
      }
      return sb.toString();
    }
}
