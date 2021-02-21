import java.util.Comparator;
import java.util.List;

/**
 * Sort names first alphabetically then by roman numeral suffix(separated by space), roman numerals range from 1 to 50 (I to L)
 */
public class RomanNumeralsSorter {
    public static List<String> sortRoman(List<String> names) {
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return compareStr(s1, s2);
            }
        });
        return names;
    }

    private static int compareStr(String s1, String s2) {
        String[] name1 = s1.split(" ");
        String[] name2 = s2.split(" ");
        int nameOrder = name1[0].compareTo(name2[0]);
        if (nameOrder == 0) {
            return getDecimalVal(name1[1]) - getDecimalVal(name2[1]);
        } else {
            return nameOrder;
        }
    }

    private static int getDecimalVal(String s1) {
        int val = 0;
        for (int i = 0; i < s1.length(); i++) {
            int value = getValue(s1.charAt(i));
            if (i > 0 && getValue(s1.charAt(i - 1)) < value) {
                val += value - 2 * getValue(s1.charAt(i - 1));
            } else {
                val += value;
            }
        }
        return val;
    }

    private static int getValue(char s) {
        if (s == 'L') {
            return 50;
        } else if (s == 'X') {
            return 10;
        } else if (s == 'I') {
            return 1;
        } else if (s == 'V') {
            return 5;
        }
        return 0;
    }
}