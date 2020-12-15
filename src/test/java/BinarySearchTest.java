import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void EmptyArraySearch() {
        String[] arr = {};
        int i = findString(arr, "1", 0, arr.length - 1);
        assertEquals(-1, i);
    }

    @Test
    public void SingleElemArraySearch() {
        String[] arr = {"a"};
        int i = findString(arr, "a", 0, arr.length - 1);
        assertEquals(0, i);
    }

    @Test
    public void DoubleElemArraySearch() {
        String[] arr = {"a", "b"};
        int i = findString(arr, "b", 0, arr.length - 1);
        assertEquals(1, i);
    }

    @Test
    public void MultiElemArraySearch() {
        String[] arr = {"a", "b", "c", "d", "e"};
        int i = findString(arr, "d", 0, arr.length - 1);
        assertEquals(3, i);
    }

    @Test
    public void MultiElemWithEmptyStringArraySearch() {
        String[] arr = {"a", "b", "", "c", "", "", "", "d", "", "e"};
        int i = findString(arr, "c", 0, arr.length - 1);
        assertEquals(3, i);
    }

    private int findString(String[] sortedStrs, String s, int i, int j) {
        if (sortedStrs.length == 0) {
            return -1;
        }
        while (i <= j) {
            int mid = (i + j) / 2;
            if (sortedStrs[mid].equals(s)) {
                return mid;
            } else if (sortedStrs[mid].equals("")) {
                int k = mid;
                for (; k < sortedStrs.length && sortedStrs[k].equals(""); k++) ;
                if (sortedStrs[k].equals(s)) {
                    return k;
                } else if (s.compareTo(sortedStrs[k]) < 0) {
                    j = mid - 1;
                } else {
                    i = k + 1;
                }
            } else if (s.compareTo(sortedStrs[mid]) < 0) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
