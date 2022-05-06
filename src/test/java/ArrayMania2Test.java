import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class ArrayMania2Test {
    @Test
    public void arrangeSingleElem() {
        int[] actual = ArrayMania2.arrange(new int[]{3});
        int[] expected = new int[]{3};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{3, 1});
        expected = new int[]{1, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{1, 2, 3});
        expected = new int[]{1, 3, 2};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{1, 3, 4, 2});
        expected = new int[]{1, 4, 2, 3};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{1, 5, 3, 4, 2});
        expected = new int[]{1, 5, 3, 4, 2};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{1, 2, 3, 4, 5});
        expected = new int[]{1, 3, 2, 5, 4};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{5, 4, 3, 2, 1});
        expected = new int[]{4, 5, 2, 3, 1};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{1, 2, 3, 4, 5, 6});
        expected = new int[]{1, 3, 2, 5, 4, 6};
        Assert.assertArrayEquals(expected, actual);

        actual = ArrayMania2.arrange(new int[]{6, 5, 4, 3, 2, 1});
        expected = new int[]{5, 6, 3, 4, 1, 2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateArraySpecifiedTimes() {
      int[] actual = new int[]{1};
      ArrayMania2.rotate(actual, 0);
      int[] expected = new int[]{1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2};
      ArrayMania2.rotate(actual, 1);
      expected = new int[]{2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2};
      ArrayMania2.rotate(actual, 2);
      expected = new int[]{2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1};
      ArrayMania2.rotate(actual, 1);
      expected = new int[]{1, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1};
      ArrayMania2.rotate(actual, 2);
      expected = new int[]{2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayMania2.rotate(actual, 1);
      expected = new int[]{3, 2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayMania2.rotate(actual, 2);
      expected = new int[]{1, 3, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayMania2.rotate(actual, 3);
      expected = new int[]{2, 1, 3};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3};
      ArrayMania2.rotate(actual, 4);
      expected = new int[]{3, 2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5};
      ArrayMania2.rotate(actual, 4);
      expected = new int[]{2, 1, 3, 5};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5};
      ArrayMania2.rotate(actual, 3);
      expected = new int[]{1, 3, 5, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5};
      ArrayMania2.rotate(actual, 6);
      expected = new int[]{3, 5, 2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{-1, -100, 3, 99};
      ArrayMania2.rotate(actual, 6);
      expected = new int[]{3, 99, -1, -100};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 1, 3, 5, 8};
      ArrayMania2.rotate(actual, 4);
      expected = new int[]{1, 3, 5, 8, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{1, 2, 3, 4, 5, 6, 7};
      ArrayMania2.rotate(actual, 3);
      expected = new int[]{5, 6, 7, 1, 2, 3, 4};
      Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void findMaxSubArraySum() {
      int actual = ArrayMania2.maxSubArray(new int[]{-1});
      int expected = -1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{4});
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-2, -1});
      expected = -1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-2, -1, 0});
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-2, -1, 1, 2});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-2, 3, -1, 2});
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{5, 4, -1, 7, 8});
      expected = 23;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-5, -4, -1, -7, -8});
      expected = -1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-5, -4, -1, -7, 0, -8});
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-1, -1, -1, -1, -1});
      expected = -1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
      expected = 6;
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void inplaceMergeSecondArrayToFirst() {
      int[] actual = new int[]{1};
      int[] b = new int[0];
      int[] expected = new int[]{1};
      ArrayMania2.merge(actual, 1, b, b.length);
      Assert.assertArrayEquals(expected, actual);

      actual = new int[1];
      b = new int[]{1};
      expected = new int[]{1};
      ArrayMania2.merge(actual, 0, b, b.length);
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{0, 2, 0};
      b = new int[]{1};
      expected = new int[]{0, 1, 2};
      ArrayMania2.merge(actual, 2, b, b.length);
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 3, 0, 0};
      b = new int[]{0 , 2};
      expected = new int[]{0, 2, 2, 3};
      ArrayMania2.merge(actual, 2, b, b.length);
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 3, 0, 0};
      b = new int[]{0 , 1};
      expected = new int[]{0, 1, 2, 3};
      ArrayMania2.merge(actual, 2, b, b.length);
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 6, 0, 0, 0, 0};
      b = new int[]{0, 2, 3, 5};
      expected = new int[]{0, 2, 2, 3, 5, 6};
      ArrayMania2.merge(actual, 2, b, b.length);
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{2, 4, 6, 0, 0, 0, 0};
      b = new int[]{1, 3, 5, 7};
      expected = new int[]{1, 2, 3, 4, 5, 6, 7};
      ArrayMania2.merge(actual, 3, b, b.length);
      Assert.assertArrayEquals(expected, actual);

      actual = new int[]{1, 2, 4, 6, 0, 0, 0};
      b = new int[]{7, 8, 9};
      expected = new int[]{1, 2, 4, 6, 7, 8, 9};
      ArrayMania2.merge(actual, 4, b, b.length);
      Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void findIntersectionOf2Arrays() {
      List<Integer> actual = ArrayMania2.intersect(new int[]{1}, new int[]{1});
      List<Integer> expected = Arrays.asList(1);
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.intersect(new int[]{1, 2}, new int[]{1, 2});
      expected = Arrays.asList(1, 2);
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.intersect(new int[]{3, 6, 3}, new int[]{2, 3, 3});
      expected = Arrays.asList(3, 3);
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.intersect(new int[]{3, 6, 3}, new int[]{2, 3, 3});
      expected = Arrays.asList(3, 3);
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.intersect(new int[]{3, 6, 1, 3, 1}, new int[]{2, 3, 3, 1, 2, 1});
      expected = Arrays.asList(3, 3, 1, 1);
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.intersect(new int[]{3, 6, 1, 3, 1, 1}, new int[]{2, 3, 3, 1, 2, 1, 1});
      expected = Arrays.asList(3, 3, 1, 1, 1);
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildPascalTriangle() {
      List<List<Integer>> actual = ArrayMania2.generate(1);
      List<List<Integer>> expected = List.of(List.of(1));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.generate(2);
      expected = List.of(List.of(1), List.of(1,1));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.generate(3);
      expected = List.of(List.of(1), List.of(1,1), List.of(1,2,1));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.generate(4);
      expected = List.of(List.of(1), List.of(1,1), List.of(1,2,1), List.of(1,3,3,1));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.generate(5);
      expected = List.of(List.of(1), List.of(1,1), List.of(1,2,1), List.of(1,3,3,1), List.of(1,4,6,4,1));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.generate(6);
      expected = List.of(List.of(1), List.of(1,1), List.of(1,2,1), List.of(1,3,3,1), List.of(1,4,6,4,1), List.of(1,5,10,10,5,1));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.generate(30);
      Assert.assertEquals(30, actual.size());
    }
    @Test
    public void searchInt2DArray() {
      boolean actual = ArrayMania2.searchMatrix(new int[][]{{1}}, 1);
      Assert.assertTrue(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1}, {3}}, 2);
      Assert.assertFalse(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 5}, {6, 8}}, 6);
      Assert.assertTrue(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 5, 8}, {9, 11, 14}, {15, 18, 21}}, 15);
      Assert.assertTrue(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 30);
      Assert.assertTrue(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 11);
      Assert.assertTrue(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 18);
      Assert.assertFalse(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 3, 5, 7, 10}, {11, 11, 16, 20, 22}, {23, 30, 34, 60, 62}}, 11);
      Assert.assertTrue(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 3, 5, 7, 10}, {11, 11, 16, 20, 22}, {23, 30, 34, 60, 62}}, 1);
      Assert.assertTrue(actual);

      actual = ArrayMania2.searchMatrix(new int[][]{{1, 3, 5, 7, 10}, {11, 11, 16, 20, 22}, {23, 30, 34, 60, 62}}, 0);
      Assert.assertFalse(actual);
    }
    @Test
    public void createRansomNoteFromMagazine() {
      boolean actual = ArrayMania2.canConstruct("a", "b");
      Assert.assertFalse(actual);

      actual = ArrayMania2.canConstruct("a", "a");
      Assert.assertTrue(actual);

      actual = ArrayMania2.canConstruct("aa", "ab");
      Assert.assertFalse(actual);

      actual = ArrayMania2.canConstruct("aa", "aab");
      Assert.assertTrue(actual);
    }

    @Test
    public void productOfWholeArrayExceptSelf() {
      int[] actual = ArrayMania2.productExceptSelf(new int[]{2, 5});
      int[] expected = new int[]{5, 2};
      Assert.assertArrayEquals(expected, actual);

      actual = ArrayMania2.productExceptSelf(new int[]{2, 3, 5});
      expected = new int[]{15, 10, 6};
      Assert.assertArrayEquals(expected, actual);

      actual = ArrayMania2.productExceptSelf(new int[]{1, 2, 3, 4});
      expected = new int[]{24, 12, 8, 6};
      Assert.assertArrayEquals(expected, actual);

      actual = ArrayMania2.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
      expected = new int[]{0, 0, 9, 0, 0};
      Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxProductOfSubArray() {
      int actual = ArrayMania2.maxProduct(new int[]{2});
      int expected = 2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{-2});
      expected = -2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{2, 2});
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{2, -1, 3});
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{2, -1, 3, 2});
      expected = 6;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{2, -1, -3});
      expected = 6;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{-2, 0, -3});
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{2, 4, 0, -3});
      expected = 8;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{-2, 2, 2, -4});
      expected = 32;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{2, 2, -1, -3, -1});
      expected = 12;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.maxProduct(new int[]{2, 2, -1, -3, -1, 4, 2});
      expected = 24;
      Assert.assertEquals(expected, actual);
    }
    @Test
    public void findMinRatatedArray() {
      int actual = ArrayMania2.findMinInRotatedSortedArray(new int[]{1});
      int expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.findMinInRotatedSortedArray(new int[]{3, 2});
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.findMinInRotatedSortedArray(new int[]{3, 1, 2});
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.findMinInRotatedSortedArray(new int[]{2, 3, 4, 1});
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.findMinInRotatedSortedArray(new int[]{1, 2, 3, 4});
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.findMinInRotatedSortedArray(new int[]{4, 5, 0, 2, 3});
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.findMinInRotatedSortedArray(new int[]{6, 7, 8, 9, 1, 2, 3, 4, 5});
      expected = 1;
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchTargetInRotatedSortedArray() {
      int actual = ArrayMania2.searchInRotatedSortedArray(new int[]{1}, 2);
      int expected = -1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{1}, 1);
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{2, 1}, 1);
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{3, 1, 2}, 2);
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{4, 1, 2, 3}, 4);
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{4, 1, 2, 3}, 2);
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{4, 1, 2, 3}, 3);
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 1, 2, 3, 4}, 1);
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{3, 4, 5, 1, 2}, 2);
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{3, 4, 5, 1, 2}, 3);
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{3, 4, 5, 1, 2}, 4);
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{3, 4, 5, 1, 2}, 1);
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 1, 2, 3, 4}, 4);
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 1, 2, 3, 4}, 5);
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 6, 1, 2, 3, 4}, 2);
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 6, 1, 2, 3, 4}, 3);
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 6, 7, 1, 2, 3, 4}, 3);
      expected = 5;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 6, 7, 1, 2, 3, 4}, 7);
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 6, 7, 1, 2, 3, 4}, 6);
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 5);
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.searchInRotatedSortedArray(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8);
      expected = 4;
      Assert.assertEquals(expected, actual);

    }
    @Test
    public void sortArrayByFrequencyThenDescendingValue() {
      int[] actual = ArrayMania2.frequencySort(new int[]{1});
      int[] expected = new int[]{1};
      Assert.assertArrayEquals(expected, actual);

      actual = ArrayMania2.frequencySort(new int[]{1, 2});
      expected = new int[]{2, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = ArrayMania2.frequencySort(new int[]{3, 4, 4});
      expected = new int[]{3, 4, 4};
      Assert.assertArrayEquals(expected, actual);

      actual = ArrayMania2.frequencySort(new int[]{1,1, 3, 4, 4, 2});
      expected = new int[]{3, 2, 4, 4, 1, 1};
      Assert.assertArrayEquals(expected, actual);

      actual = ArrayMania2.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1});
      expected = new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1};
      Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void uniquePathsWithObstacles() {
      int actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0}});
      int expected  = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{1}});
      expected  = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0, 0}, {0, 0}});
      expected  = 2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}});
      expected  = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0, 0}, {1, 0}});
      expected  = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0, 1}, {1, 0}});
      expected  = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0, 0, 0},{0, 1, 0},{0, 0, 0}});
      expected  = 2;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0, 0, 0},{0, 1, 0},{0, 1, 0}});
      expected  = 1;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{{0, 1, 0},{0, 1, 0},{0, 1, 0}});
      expected  = 0;
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.uniquePathsWithObstacles(new int[][]{
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}});
      expected  = 100096486;
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateAllSubsets() {
      List<List<Integer>> actual = ArrayMania2.subsets(new int[]{1});
      List<List<Integer>> expected = List.of(List.of(), List.of(1));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.subsets(new int[]{1, 2});
      expected = List.of(List.of(), List.of(1), List.of(2), List.of(1, 2));
      Assert.assertEquals(expected, actual);

      actual = ArrayMania2.subsets(new int[]{1, 2, 3});
      expected = List.of(List.of(), List.of(1), List.of(2), List.of(3), List.of(1, 2), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
      Assert.assertEquals(expected, actual);
    }
}
