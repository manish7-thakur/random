import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void EmptyArraySearch() {
        String[] arr = {};
        int i = BinarySearch.binarySearch(arr, "1", 0, arr.length - 1);
        assertEquals(-1, i);
    }

    @Test
    public void SingleElemArraySearch() {
        String[] arr = {"a"};
        int i = BinarySearch.binarySearch(arr, "a", 0, arr.length - 1);
        assertEquals(0, i);
    }

    @Test
    public void DoubleElemArraySearch() {
        String[] arr = {"a", "b"};
        int i = BinarySearch.binarySearch(arr, "b", 0, arr.length - 1);
        assertEquals(1, i);
    }

    @Test
    public void MultiElemArraySearch() {
        String[] arr = {"a", "b", "c", "d", "e"};
        int i = BinarySearch.binarySearch(arr, "d", 0, arr.length - 1);
        assertEquals(3, i);
    }

    @Test
    public void MultiElemWithEmptyStringArraySearch() {
        String[] arr = {"a", "b", "", "", "c", "", "", "", "d", "", "e"};
        int i = BinarySearch.binarySearch(arr, "c", 0, arr.length - 1);
        assertEquals(4, i);
    }
}
