import java.util.*;

public class TextJustifier {
    static public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int curr = 0;
        int i = 0, j = 0;
        int space = 0;
        while (i < words.length) {
            for (j = i; j < words.length; j++) {
                if (curr + words[j].length() + space == maxWidth) {
                    String str = "";
                    for (int k = i; k <= j; k++) {
                        if (k == j) str = str + words[k];
                        else str = str + words[k] + " ";
                    }
                    res.add(str);
                    i = j + 1;
                    break;
                } else if (curr + words[j].length() + space > maxWidth) {
                    String str = "";
                    for (int k = i; k <= j; k++) {
                        if (k == j) str = str + words[k];
                        else str = str + words[k] + " ";
                    }
                    res.add(str);
                    i = j;
                    break;
                }
                curr += words[j].length();
                if (j + 1 == words.length) {
                    String str = "";
                    int exSpc = maxWidth - (curr + space);
                    for (int k = i; k <= j; k++) {
                      if(k == i) str = String.format("%-"+(words[k].length() + exSpc) + "s", words[k]);
                      else  if (k == j) str = str + words[k];
                        if(k != j) str = str + " ";
                    }
                    res.add(str);
                    i = j + 1;
                }
                space++;
            }
            curr = 0;
            space = 0;
        }
        return res;
    }
}
