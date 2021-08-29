import java.util.ArrayList;
import java.util.List;

public class TextJustifier {
    static public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int curr = 0;
        int i = 0, j;
            for (j = 0; j < words.length; j++) {
               if (curr + words[j].length() + j - i > maxWidth) {
                    String str = justify(i, j - 1, maxWidth, curr, words, false);
                    res.add(str);
                    i = j;
                    curr = 0;
                }
                curr += words[j].length();
            }
            String str = leftJustify(i, j - 1, maxWidth, curr, words, true);
            res.add(str);
        return res;
    }
    static String leftJustify(int i, int j, int maxWidth, int textLen, String[] words, boolean lastLine) {
      StringBuilder sb = new StringBuilder(maxWidth);
      if(i == j) {
        sb.append(words[i]);
        for(int k = 0; k < maxWidth - textLen; k++) {
          sb.append(' ');
        }
        return sb.toString();
      }
      for(int k = i; k <= j; k++) {
        sb.append(words[k]);
        if(k != j) {
          sb.append(' ');
        }
      }
      int sp = maxWidth - sb.length();
      for(int k = 0; k < sp; k++) {
        sb.append(' ');
      }
      return sb.toString();
    }
    static String justify(int i, int j, int maxWidth, int textLen, String[] words, boolean lastLine) {
      StringBuilder sb = new StringBuilder(maxWidth);
      if(i == j) {
        sb.append(words[i]);
        for(int k = 0; k < maxWidth - textLen; k++) {
          sb.append(' ');
        }
        return sb.toString();
      }
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
      StringBuilder spcB = new StringBuilder(cSpc);
      for(int k = 0; k < cSpc; k++) {
        spcB.append(' ');
      }
      //String cSpcStr = String.format("%-" + cSpc + "s", ""); Using lib method slowed the algo to 13 ms
      String cSpcStr = spcB.toString();
      sb.append(words[i]);
      sb.append(cSpcStr);
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
        int sp = maxWidth - sb.length();
        for(int k = 0; k < sp; k++) {
          sb.append(' ');
        }
      }
      return sb.toString();
    }
}
