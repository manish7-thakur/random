/**
 * Find a string in a sorted array of strings where individual string could be separated by any number of empty("") strings.
 */
public class BinarySearch {
    static int binarySearch(String[] strs, String s, int i, int j) {
        if (strs.length == 0) {
            return -1;
        }
        while (i <= j) {
            int mid = (i + j) / 2;
            if (strs[mid].equals(s)) {
                return mid;
            } else if (strs[mid].equals("")) {
                int k = mid;
                for (; k < strs.length && strs[k].equals(""); k++) ;
                if (strs[k].equals(s)) {
                    return k;
                } else if (s.compareTo(strs[k]) < 0) {
                    j = mid - 1;
                } else {
                    i = k + 1;
                }
            } else if (s.compareTo(strs[mid]) < 0) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
