import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void EmptyArraySearch() {
        String[] arr = {};
        int i = BinarySearch.binarySearch(arr, "1", 0, arr.length - 1);
        assertEquals(-1, i);

        arr = new String[]{"a"};
        i = BinarySearch.binarySearch(arr, "a", 0, arr.length - 1);
        assertEquals(0, i);

        arr = new String[]{"a", "b"};
        i = BinarySearch.binarySearch(arr, "b", 0, arr.length - 1);
        assertEquals(1, i);

        arr = new String[]{"a", "b", "c", "d", "e"};
        i = BinarySearch.binarySearch(arr, "d", 0, arr.length - 1);
        assertEquals(3, i);
    }
}
