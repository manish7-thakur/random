import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void binarySearchWithEmptyStrings() {
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
    @Test
    public void validApiCalls() {
      int actual = BinarySearch.firstBadVersion(1, 1);
      int expected = 1;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(2, 1);
      expected = 1;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(3, 1);
      expected = 1;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(2, 2);
      expected = 2;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(3, 3);
      expected = 3;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(4, 3);
      expected = 3;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(4, 2);
      expected = 2;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(5, 4);
      expected = 4;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(5, 3);
      expected = 3;
      assertEquals(expected, actual);

      actual = BinarySearch.firstBadVersion(2126753390, 1702766719);
      expected = 1702766719;
      assertEquals(expected, actual);
    }
    @Test
    public void findInsertPostion() {
      int actual = BinarySearch.searchInsert(new int[]{1}, 0);
      int expected = 0;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 5}, 2);
      expected = 1;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 2, 5}, 5);
      expected = 2;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 2, 5}, 1);
      expected = 0;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 2, 5}, 3);
      expected = 2;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 2, 5, 6, 9}, 7);
      expected = 4;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 2, 5, 6, 16, 21, 29, 34, 48, 54, 62, 72, 82, 91}, 71);
      expected = 11;
      assertEquals(expected, actual);
    }
}
