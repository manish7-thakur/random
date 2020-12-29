import java.util.HashSet;
import java.util.Set;

public class DigitSplitter {
    public static int[] split(int i) {
        int[] arr = new int[String.valueOf(i).length()];
        int pos = arr.length - 1;
        while (i > 0) {
            arr[pos] = i % 10;
            i = i / 10;
            pos--;
        }
        return arr;
    }

    public static boolean isColorful(int n) {
        int[] digits = split(n);
        int p = 1;
        int len = 0;
        Set<Integer> pSet = new HashSet<Integer>();
        while (len < digits.length - 1) {
            int i = 0;
            for (; i <= len; i++) {
                p *= digits[i];
            }
            if (pSet.contains(p)) {
                return false;
            } else {
                pSet.add(p);
            }
            for (; i < digits.length; i++) {
                p /= digits[i - (len + 1)];
                p *= digits[i];
                if (pSet.contains(p)) {
                    return false;
                } else {
                    pSet.add(p);
                }
            }
            p = 1;
            len++;
        }
        return true;
    }
}
