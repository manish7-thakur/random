import java.util.ArrayList;

public class StringPermutator {
    static ArrayList<String> permutate(String s) {
        ArrayList<String> result = new ArrayList<String>();
        if (s.length() == 1) {
            result.add(s);
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            ArrayList<String> list = permutate(s.substring(0, i) + s.substring(i + 1));
            for (String p : list) {
                result.add(s.charAt(i) + p);
            }
        }
        return result;
    }
}