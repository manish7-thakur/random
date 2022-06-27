import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

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
      int actual = BinarySearch.searchInsert(new int[]{2}, 1);
      int expected = 0;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{2}, 3);
      expected = 1;
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

      actual = BinarySearch.searchInsert(new int[]{1, 3, 5, 6}, 7);
      expected = 4;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 3, 5, 6}, 2);
      expected = 1;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 2, 5, 6, 9}, 7);
      expected = 4;
      assertEquals(expected, actual);

      actual = BinarySearch.searchInsert(new int[]{1, 2, 5, 6, 16, 21, 29, 34, 48, 54, 62, 72, 82, 91}, 71);
      expected = 11;
      assertEquals(expected, actual);
    }
    @Test
    public void firstAndLastPosInSortedArray() {
      int[] actual = BinarySearch.searchRange(new int[]{}, 2);
      int[] expected = new int[]{-1, -1};
      assertArrayEquals(expected, actual);

      actual = BinarySearch.searchRange(new int[]{1}, 1);
      expected = new int[]{0, 0};
      assertArrayEquals(expected, actual);

      actual = BinarySearch.searchRange(new int[]{1}, 2);
      expected = new int[]{-1, -1};
      assertArrayEquals(expected, actual);

      actual = BinarySearch.searchRange(new int[]{1, 2}, 2);
      expected = new int[]{1, 1};
      assertArrayEquals(expected, actual);

      actual = BinarySearch.searchRange(new int[]{1, 2, 2}, 2);
      expected = new int[]{1, 2};
      assertArrayEquals(expected, actual);

      actual = BinarySearch.searchRange(new int[]{2, 4, 4, 4, 9}, 4);
      expected = new int[]{1, 3};
      assertArrayEquals(expected, actual);

      actual = BinarySearch.searchRange(new int[]{2, 2, 2, 4, 4, 9}, 9);
      expected = new int[]{5, 5};
      assertArrayEquals(expected, actual);

      actual = BinarySearch.searchRange(new int[]{1, 2, 2, 4, 4, 9}, 1);
      expected = new int[]{0, 0};
      assertArrayEquals(expected, actual);
    }
    @Test
    public void kClosestElementsToNumber() {
      List<Integer> actual = BinarySearch.findClosestElements(new int[]{3}, 1, 4);
      List<Integer> expected = List.of(3);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{3}, 1, 2);
      expected = List.of(3);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{1, 4}, 1, 2);
      expected = List.of(1);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{1, 4}, 1, 3);
      expected = List.of(4);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{1, 4}, 2, 3);
      expected = List.of(1, 4);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{1, 4, 6}, 3, 3);
      expected = List.of(1, 4, 6);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{-3, -2, 0, 4, 7}, 3, -1);
      expected = List.of(-3, -2, 0);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{-3, -2, 0, 1, 7}, 3, -1);
      expected = List.of(-3, -2, 0);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{-3, -2, 0, 1, 7}, 4, -2);
      expected = List.of(-3, -2, 0, 1);
      assertEquals(expected, actual);

      actual = BinarySearch.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);
      expected = List.of(1, 2, 3, 4);
      assertEquals(expected, actual);
    }

}
