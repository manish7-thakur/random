import org.junit.*;
import java.util.*;
public class ArrayManiaTest {
  @Test
  public void findTripletsWithSumZero() {
    List<List<Integer>> actual = ArrayMania.threeSum(new int[]{});
    List<List<Integer>> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{0, 1});
    expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{0, 1, -1});
    expected = List.of(List.of(-1, 0, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{1, 0, 1, -1, -2});
    expected = List.of(List.of(-2, 1, 1), List.of(-1, 0, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{1, 2, 0, 1, -2});
    expected = List.of(List.of(-2, 0, 2), List.of(-2, 1, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{1, -1, 0, 1, -1, -2});
    expected = List.of(List.of(-2, 1, 1), List.of(-1, 0, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.threeSum(new int[]{-1, 0, 3, -1, -2});
    expected = List.of(List.of(-2, -1, 3));
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findMaxAreaOfRectangle() {
    int actual = ArrayMania.maxArea(new int[]{1, 1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.maxArea(new int[]{2, 3, 0});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.maxArea(new int[]{2, 3, 2, 4});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.maxArea(new int[]{2, 5, 2, 6, 2});
    expected = 10;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.maxArea(new int[]{2, 5, 2, 6, 2, 5, 9});
    expected = 25;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    expected = 49;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void missingNumInRangeZeroToN() {
    int actual = ArrayMania.missingNumber(new int[]{0});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{1});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{0, 1});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{0, 2});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{3, 1, 0});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{3, 2, 1});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{3, 0, 1, 4});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{3, 5, 0, 1, 2});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
    expected = 8;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void waterFlowToAtlanticAndPacific() {
    var actual = ArrayMania.pacificAtlantic(new int[][]{{1}});
    var expected = List.of(List.of(0, 0));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.pacificAtlantic(new int[][]{{2, 1}, {1, 2}});
    expected = List.of(List.of(0, 0), List.of(0, 1), List.of(1, 0), List.of(1, 1));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.pacificAtlantic(new int[][]{{1, 3}, {3, 2}});
    expected = List.of(List.of(0, 1), List.of(1, 0));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.pacificAtlantic(new int[][]{{3, 1, 2}, {3, 2, 2}});
    expected = List.of(List.of(0, 0), List.of(0, 2), List.of(1, 0), List.of(1, 1), List.of(1, 2));
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.pacificAtlantic(new int[][]{{3, 4, 1, 2}, {4, 3, 1, 2}, {8, 1, 6, 4}, {7, 9, 4, 3}});
    expected = List.of(List.of(0, 3), List.of(1, 3), List.of(2, 0), List.of(2, 2), List.of(2, 3), List.of(3, 0), List.of(3, 1));
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void countNumberOfIslands() {
    var actual = ArrayMania.numIslands(new char[][]{{'0'}});
    var expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.numIslands(new char[][]{{'1'}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.numIslands(new char[][]{{'1', '1'}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.numIslands(new char[][]{{'1', '1', '0', '1'}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.numIslands(new char[][]{{'1', '0', '0', '1'}, {'1', '1', '0', '1'}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.numIslands(new char[][]{{'1', '0', '0', '1'},{'1', '0', '0', '0'},{'1', '1', '0', '1'}});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.numIslands(new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.numIslands(new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}});
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void lengthOfLongestConsecutiveSequence() {
    int actual = ArrayMania.longestConsecutive(new int[] {1});
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {1, 5});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {1, 5, 2});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {1, 2, 4, 3});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {100, 2, 400, 3});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {100, 2, 400, 3, 402, 401});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
    expected = 9;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1, 10, 26, 19, 20, 34, 18, 23, 12, 15, 9, 15, 15, 24, 14, 13, 14, 16, 17, 11, 17, 17});
    expected = 21;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {0, -3, 7, -2, 5, -8, -4, 6, 0, -1, 10, -7, 19, 20, 34, 18, -6, 12, -15, 9, -15, 15, 24, 14, -13, -14, -16, -17, 11, 17, 17});
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.longestConsecutive(new int[] {0, -3, -5, -4, 5, 7, -2, -1, 1, 2});
    expected = 8;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void insertAndMergeIntervals() {
    int[][] actual = ArrayMania.insertInterval(new int[][]{{1, 2}}, new int[]{3, 4});
    int[][] expected = new int[][]{{1, 2}, {3, 4}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.insertInterval(new int[][]{{1, 3}}, new int[]{2, 5});
    expected = new int[][]{{1, 5}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.insertInterval(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
    expected = new int[][]{{1, 5}, {6, 9}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.insertInterval(new int[][]{{1, 3}, {4, 5}}, new int[]{2, 5});
    expected = new int[][]{{1, 5}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.insertInterval(new int[][]{{1, 2}, {2, 3}}, new int[]{2, 3});
    expected = new int[][]{{1, 3}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.insertInterval(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4, 8});
    expected = new int[][]{{1, 2}, {3, 10}, {12, 16}};
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void mergeIntervalsWithSorting() {
    int[][] actual = ArrayMania.merge(new int[][]{{1, 2}, {3, 4}});
    int[][] expected = new int[][]{{1, 2}, {3, 4}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{1, 3}, {2, 4}});
    expected = new int[][]{{1, 4}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{1, 2}, {2, 4}});
    expected = new int[][]{{1, 4}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{1, 2}, {2, 4}, {5, 6}});
    expected = new int[][]{{1, 4}, {5, 6}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{1, 2}, {5, 6}, {2, 4}});
    expected = new int[][]{{1, 4}, {5, 6}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{4, 6}, {1, 2}, {2, 4}});
    expected = new int[][]{{1, 6}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{6, 8}, {7, 9}, {5, 6}});
    expected = new int[][]{{5, 9}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{6, 8}, {7, 9}, {5, 6}});
    expected = new int[][]{{5, 9}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{6, 8}, {1, 2}, {7, 9}, {5, 6}, {3, 4}});
    expected = new int[][]{{1, 2}, {3, 4}, {5, 9}};
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.merge(new int[][]{{6, 8}, {1, 2}, {7, 9}, {2, 3}, {5, 6}, {3, 4}});
    expected = new int[][]{{1, 4}, {5, 9}};
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void minNumberOfOverlappingIntervalsRemoval() {
    int actual = ArrayMania.eraseOverlapIntervals(new int[][]{{1, 2}});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{2, 3}, {1, 2}});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{1, 5}, {1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{1, 5}, {2, 3}, {1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{1, 2}, {0, 5}, {2, 3}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{-65,-11},{-62,-49},{-31,49}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{1, 2}, {3, 5}, {0, 5}, {2, 3}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{2, 5}, {3, 4}, {1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{2, 5}, {1, 2}, {3, 4}, {2, 4}, {2, 3}, {3, 5}});
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{2, 5}, {3, 4}, {1, 2}, {3, 4}, {2, 4}, {2, 3}, {3, 5}});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{2, 5}, {1, 6}, {1, 2}, {3, 4}, {2, 4}, {2, 3}, {3, 5}});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}});
    expected = 7;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void setEntireColumnAndRowToZeroWithConstantSpace() {
    int[][] actual = new int[][]{{0}};
    ArrayMania.setZeroes(actual);
    int[][] expected = new int[][]{{0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1}, {1, 0}};
    ArrayMania.setZeroes(actual);
    expected = new int[][]{{1, 0}, {0, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1, 3}, {3, 1, 0}, {0, 1, 0}};
    ArrayMania.setZeroes(actual);
    expected = new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 0, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1, 0}, {3, 1, 3}, {0, 1, 2}};
    ArrayMania.setZeroes(actual);
    expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{0, 1, 1}, {3, 1, 3}, {1, 1, 2}};
    ArrayMania.setZeroes(actual);
    expected = new int[][]{{0, 0, 0}, {0, 1, 3}, {0, 1, 2}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    ArrayMania.setZeroes(actual);
    expected = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    ArrayMania.setZeroes(actual);
    expected = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
    Assert.assertArrayEquals(expected, actual);
  }
  @Test
  public void collectElementsOfArrayInSpiralOrder() {
    List<Integer> actual = ArrayMania.spiralOrder(new int[][]{{1}});
    List<Integer> expected = List.of(1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 3}, {2, 4}});
    expected = List.of(1, 3, 4, 2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 3, 4}, {2, 5, 6}});
    expected = List.of(1, 3, 4, 6, 5, 2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 3, 4}, {2, 5, 6}, {8, 9, 2}});
    expected = List.of(1, 3, 4, 6, 2, 9, 8, 2, 5);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 3, 4, 5, 6}, {2, 5, 6, 4, 5}, {8, 9, 2, 6, 7}});
    expected = List.of(1, 3, 4, 5, 6, 5, 7, 6, 2, 9, 8, 2, 5, 6, 4);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 3, 4}, {2, 5, 6}, {8, 9, 2}, {3, 5, 6}});
    expected = List.of(1, 3, 4, 6, 2, 6, 5, 3, 8, 2, 5, 9);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 3, 4, 9}, {2, 5, 6, 3}, {8, 9, 2, 6}, {3, 5, 6, 7}});
    expected = List.of(1, 3, 4, 9, 3, 6, 7, 6, 5, 3, 8, 2, 5, 6, 2, 9);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 2, 4, 6, 8, 9}, {2, 1, 4, 8, 9, 5}, {3, 1, 4, 6, 8, 9}, {8, 1, 7, 6, 5, 4}});
    expected = List.of(1, 2, 4, 6, 8, 9, 5, 9, 4, 5, 6, 7, 1, 8, 3, 2, 1, 4, 8, 9, 8, 6, 4, 1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.spiralOrder(new int[][]{{1, 2, 4, 6, 8, 9}, {2, 1, 4, 8, 9, 5}, {3, 1, 4, 6, 8, 9}, {8, 1, 7, 6, 5, 4}, {5, 1, 8, 4, 6, 9}});
    expected = List.of(1, 2, 4, 6, 8, 9, 5, 9, 4, 9, 6, 4, 8, 1, 5, 8, 3, 2, 1, 4, 8, 9, 8, 5, 6, 7, 1, 1, 4, 6);
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void transposeSquareMatrix() {
    int[][] actual = new int[][]{{1}};
    ArrayMania.transpose(actual);
    int[][] expected = new int[][]{{1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 2}, {3, 4}};
    ArrayMania.transpose(actual);
    expected = new int[][]{{1, 3}, {2, 4}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 2, 4}, {5, 6, 9}, {2, 8, 5}};
    ArrayMania.transpose(actual);
    expected = new int[][]{{1, 5, 2}, {2, 6, 8}, {4, 9, 5}};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void reverseSingleDimensionArray() {
    int[] actual = new int[]{1};
    ArrayMania.reverse(actual);
    int[] expected = new int[]{1};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 2};
    ArrayMania.reverse(actual);
    expected = new int[]{2, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 2, 4};
    ArrayMania.reverse(actual);
    expected = new int[]{4, 2, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{8, 1, 2, 4};
    ArrayMania.reverse(actual);
    expected = new int[]{4, 2, 1, 8};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void rotateSquareMatrix90Degrees() {
    int[][] actual = new int[][]{{2}};
    ArrayMania.rotate(actual);
    int[][] expected = new int[][]{{2}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{2, 4}, {5, 6}};
    ArrayMania.rotate(actual);
    expected = new int[][]{{5, 2}, {6, 4}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
    ArrayMania.rotate(actual);
    expected = new int[][]{{7,4,1}, {8,5,2}, {9,6,3}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
    ArrayMania.rotate(actual);
    expected = new int[][]{{15,13,2,5}, {14,3,4,1}, {12,6,8,9}, {16,7,10,11}};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void searchWordIn2DMatrix() {
    boolean actual = ArrayMania.exists(new char[][]{{'s'}}, "s");
    Assert.assertTrue(actual);

    actual = ArrayMania.exists(new char[][]{{'p', 'a'}}, "as");
    Assert.assertFalse(actual);

    actual = ArrayMania.exists(new char[][]{{'p', 'a'}}, "ap");
    Assert.assertTrue(actual);

    actual = ArrayMania.exists(new char[][]{{'p', 'a'}, {'c', 'd'}}, "dcp");
    Assert.assertTrue(actual);

    actual = ArrayMania.exists(new char[][]{{'p', 'a', 'r'}, {'e', 'd', 'e'}}, "derd");
    Assert.assertFalse(actual);

    actual = ArrayMania.exists(new char[][]{{'d', 'a', 'r'}, {'d', 'p', 'p'}, {'r', 'd', 'k'}}, "ddar");
    Assert.assertTrue(actual);

    actual = ArrayMania.exists(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED");
    Assert.assertTrue(actual);

    actual = ArrayMania.exists(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE");
    Assert.assertTrue(actual);

    actual = ArrayMania.exists(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB");
    Assert.assertFalse(actual);
  }
  @Test
  public void topKMostFrequentElements() {
    int[] actual = ArrayMania.topKFrequent(new int[] {1}, 1);
    int[] expected = new int[]{1};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania.topKFrequent(new int[] {1, 2, 2}, 1);
    expected = new int[]{2};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania.topKFrequent(new int[] {1, 2, 2}, 2);
    expected = new int[]{2, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania.topKFrequent(new int[] {2, 2, 3, 3, 4, 1}, 2);
    expected = new int[]{3, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);
    expected = new int[]{1, 2};
    Assert.assertArrayEquals(expected, actual);
  }
  @Test
  public void topKMostFrequentPairs() {
    ArrayMania.Pair[] pairs = new ArrayMania.Pair[]{new ArrayMania.Pair(0, 2)};
    int actual  = ArrayMania.partition(pairs, 0, 0);
    int expected = 0;
    Assert.assertEquals(expected, actual);
    Assert.assertArrayEquals(new ArrayMania.Pair[]{new ArrayMania.Pair(0, 2)}, pairs);

    pairs = new ArrayMania.Pair[]{new ArrayMania.Pair(0, 1), new ArrayMania.Pair(0, 2)};
    actual  = ArrayMania.partition(pairs, 0, 1);
    expected = 1;
    Assert.assertEquals(expected, actual);
    Assert.assertArrayEquals(new ArrayMania.Pair[]{new ArrayMania.Pair(0, 2), new ArrayMania.Pair(0, 1)}, pairs);

    pairs = new ArrayMania.Pair[]{new ArrayMania.Pair(0, 2), new ArrayMania.Pair(0, 3), new ArrayMania.Pair(0, 4)};
    actual  = ArrayMania.partition(pairs, 0, 2);
    expected = 2;
    Assert.assertEquals(expected, actual);
    Assert.assertArrayEquals(new ArrayMania.Pair[]{new ArrayMania.Pair(0, 4), new ArrayMania.Pair(0, 3), new ArrayMania.Pair(0, 2)}, pairs);

    pairs = new ArrayMania.Pair[]{new ArrayMania.Pair(0, 2), new ArrayMania.Pair(0, 1), new ArrayMania.Pair(0, 4)};
    actual  = ArrayMania.partition(pairs, 0, 2);
    expected = 1;
    Assert.assertEquals(expected, actual);
    Assert.assertArrayEquals(new ArrayMania.Pair[]{new ArrayMania.Pair(0, 4), new ArrayMania.Pair(0, 2), new ArrayMania.Pair(0, 1)}, pairs);
  }
  @Test
  public void searchWordInTheBoard() {
    boolean actual = ArrayMania.searchRec(new char[][]{{'a'}}, "a", 0, 0, 0, new boolean[][]{{false}});
    Assert.assertTrue(actual);

    actual = ArrayMania.searchRec(new char[][]{{'a', 'c'}, {'b', 'b'}}, "bb", 1, 0, 0, new boolean[][]{{false, false}, {false, false}});
    Assert.assertTrue(actual);

    actual = ArrayMania.searchRec(new char[][]{
      {'a', 'c', 't'},
      {'b', 'c', 'c'}}, "cbc", 1, 1, 0, new boolean[][]{{false, false, false}, {false, false, false}});
    Assert.assertFalse(actual);

    actual = ArrayMania.searchRec(new char[][]{
      {'a', 'c', 't'},
      {'e', 'c', 'e'},
      {'p', 'c', 'b'}}, "bccet", 2, 2, 0, new boolean[][]{{false, false, false}, {false, false, false}, {false, false, false}});
    Assert.assertTrue(actual);
  }
  @Test
  public void searchAllWordsInTheBoard() {
    List<String> actual = ArrayMania.findWords(new char[][]{{'a'}}, new String[]{"a"});
    List<String> expected = List.of("a");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.findWords(new char[][]{{'a', 'a'}, {'c', 'b'}}, new String[]{"ab", "bb"});
    expected = List.of("ab");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.findWords(new char[][]{{'a', 'a'}, {'c', 'b'}}, new String[]{"ab", "bc"});
    expected = List.of("ab", "bc");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.findWords(new char[][]{
      {'a', 'a', 'n'},
      {'c', 'b', 'j'},
      {'v', 'b', 'k'}}, new String[]{"vbba", "jbbvcb", "kbbc", "cban", "acbn", "vcbc"});
    expected = List.of("vbba", "kbbc", "cban");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.findWords(new char[][]{
      {'a', 'a', 'n'},
      {'a', 'b', 'j'},
      {'v', 'b', 'f'}}, new String[]{"vbba", "jbbvcb", "kbbc", "abbf", "acbn", "vcbc"});
    expected = List.of("vbba", "abbf");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.findWords(new char[][]{{'m','b','c','d','e','f','g','h','i','j','k','l'},{'n','a','a','a','a','a','a','a','a','a','a','a'},{'o','a','a','a','a','a','a','a','a','a','a','a'},{'p','a','a','a','a','a','a','a','a','a','a','a'},{'q','a','a','a','a','a','a','a','a','a','a','a'},{'r','a','a','a','a','a','a','a','a','a','a','a'},{'s','a','a','a','a','a','a','a','a','a','a','a'},{'t','a','a','a','a','a','a','a','a','a','a','a'},{'u','a','a','a','a','a','a','a','a','a','a','a'},{'v','a','a','a','a','a','a','a','a','a','a','a'},{'w','a','a','a','a','a','a','a','a','a','a','a'},{'x','y','z','a','a','a','a','a','a','a','a','a'}}, new String[]{"aaaaaaaaaa","aaaaaaaaab","aaaaaaaaac","aaaaaaaaad","aaaaaaaaae","aaaaaaaaaf","aaaaaaaaag","aaaaaaaaah","aaaaaaaaai","aaaaaaaaaj","aaaaaaaaak","aaaaaaaaal","aaaaaaaaam","aaaaaaaaan","aaaaaaaaao","aaaaaaaaap","aaaaaaaaaq","aaaaaaaaar","aaaaaaaaas","aaaaaaaaat","aaaaaaaaau","aaaaaaaaav","aaaaaaaaaw","aaaaaaaaax","aaaaaaaaay","aaaaaaaaaz","aaaaaaaaba","aaaaaaaabb","aaaaaaaabc","aaaaaaaabd","aaaaaaaabe","aaaaaaaabf","aaaaaaaabg","aaaaaaaabh","aaaaaaaabi","aaaaaaaabj","aaaaaaaabk","aaaaaaaabl","aaaaaaaabm","aaaaaaaabn","aaaaaaaabo","aaaaaaaabp","aaaaaaaabq","aaaaaaaabr","aaaaaaaabs","aaaaaaaabt","aaaaaaaabu","aaaaaaaabv","aaaaaaaabw","aaaaaaaabx","aaaaaaaaby","aaaaaaaabz","aaaaaaaaca","aaaaaaaacb","aaaaaaaacc","aaaaaaaacd","aaaaaaaace","aaaaaaaacf","aaaaaaaacg","aaaaaaaach","aaaaaaaaci","aaaaaaaacj","aaaaaaaack","aaaaaaaacl","aaaaaaaacm","aaaaaaaacn","aaaaaaaaco","aaaaaaaacp","aaaaaaaacq","aaaaaaaacr","aaaaaaaacs","aaaaaaaact","aaaaaaaacu","aaaaaaaacv","aaaaaaaacw","aaaaaaaacx","aaaaaaaacy","aaaaaaaacz","aaaaaaaada","aaaaaaaadb","aaaaaaaadc","aaaaaaaadd","aaaaaaaade","aaaaaaaadf","aaaaaaaadg","aaaaaaaadh","aaaaaaaadi","aaaaaaaadj","aaaaaaaadk","aaaaaaaadl","aaaaaaaadm","aaaaaaaadn","aaaaaaaado","aaaaaaaadp","aaaaaaaadq","aaaaaaaadr","aaaaaaaads","aaaaaaaadt","aaaaaaaadu","aaaaaaaadv","aaaaaaaadw","aaaaaaaadx","aaaaaaaady","aaaaaaaadz","aaaaaaaaea","aaaaaaaaeb","aaaaaaaaec","aaaaaaaaed","aaaaaaaaee","aaaaaaaaef","aaaaaaaaeg","aaaaaaaaeh","aaaaaaaaei","aaaaaaaaej","aaaaaaaaek","aaaaaaaael","aaaaaaaaem","aaaaaaaaen","aaaaaaaaeo","aaaaaaaaep","aaaaaaaaeq","aaaaaaaaer","aaaaaaaaes","aaaaaaaaet","aaaaaaaaeu","aaaaaaaaev","aaaaaaaaew","aaaaaaaaex","aaaaaaaaey","aaaaaaaaez","aaaaaaaafa","aaaaaaaafb","aaaaaaaafc","aaaaaaaafd","aaaaaaaafe","aaaaaaaaff","aaaaaaaafg","aaaaaaaafh","aaaaaaaafi","aaaaaaaafj","aaaaaaaafk","aaaaaaaafl","aaaaaaaafm","aaaaaaaafn","aaaaaaaafo","aaaaaaaafp","aaaaaaaafq","aaaaaaaafr","aaaaaaaafs","aaaaaaaaft","aaaaaaaafu","aaaaaaaafv","aaaaaaaafw","aaaaaaaafx","aaaaaaaafy","aaaaaaaafz","aaaaaaaaga","aaaaaaaagb","aaaaaaaagc","aaaaaaaagd","aaaaaaaage","aaaaaaaagf","aaaaaaaagg","aaaaaaaagh","aaaaaaaagi","aaaaaaaagj","aaaaaaaagk","aaaaaaaagl","aaaaaaaagm","aaaaaaaagn","aaaaaaaago","aaaaaaaagp","aaaaaaaagq","aaaaaaaagr","aaaaaaaags","aaaaaaaagt","aaaaaaaagu","aaaaaaaagv","aaaaaaaagw","aaaaaaaagx","aaaaaaaagy","aaaaaaaagz","aaaaaaaaha","aaaaaaaahb","aaaaaaaahc","aaaaaaaahd","aaaaaaaahe","aaaaaaaahf","aaaaaaaahg","aaaaaaaahh","aaaaaaaahi","aaaaaaaahj","aaaaaaaahk","aaaaaaaahl","aaaaaaaahm","aaaaaaaahn","aaaaaaaaho","aaaaaaaahp","aaaaaaaahq","aaaaaaaahr","aaaaaaaahs","aaaaaaaaht","aaaaaaaahu","aaaaaaaahv","aaaaaaaahw","aaaaaaaahx","aaaaaaaahy","aaaaaaaahz","aaaaaaaaia","aaaaaaaaib","aaaaaaaaic","aaaaaaaaid","aaaaaaaaie","aaaaaaaaif","aaaaaaaaig","aaaaaaaaih","aaaaaaaaii","aaaaaaaaij","aaaaaaaaik","aaaaaaaail","aaaaaaaaim","aaaaaaaain","aaaaaaaaio","aaaaaaaaip","aaaaaaaaiq","aaaaaaaair","aaaaaaaais","aaaaaaaait","aaaaaaaaiu","aaaaaaaaiv","aaaaaaaaiw","aaaaaaaaix","aaaaaaaaiy","aaaaaaaaiz","aaaaaaaaja","aaaaaaaajb","aaaaaaaajc","aaaaaaaajd","aaaaaaaaje","aaaaaaaajf","aaaaaaaajg","aaaaaaaajh","aaaaaaaaji","aaaaaaaajj","aaaaaaaajk","aaaaaaaajl","aaaaaaaajm","aaaaaaaajn","aaaaaaaajo","aaaaaaaajp","aaaaaaaajq","aaaaaaaajr","aaaaaaaajs","aaaaaaaajt","aaaaaaaaju","aaaaaaaajv","aaaaaaaajw","aaaaaaaajx","aaaaaaaajy","aaaaaaaajz","aaaaaaaaka","aaaaaaaakb","aaaaaaaakc","aaaaaaaakd","aaaaaaaake","aaaaaaaakf","aaaaaaaakg","aaaaaaaakh","aaaaaaaaki","aaaaaaaakj","aaaaaaaakk","aaaaaaaakl","aaaaaaaakm","aaaaaaaakn","aaaaaaaako","aaaaaaaakp","aaaaaaaakq","aaaaaaaakr","aaaaaaaaks","aaaaaaaakt","aaaaaaaaku","aaaaaaaakv","aaaaaaaakw","aaaaaaaakx","aaaaaaaaky","aaaaaaaakz","aaaaaaaala","aaaaaaaalb","aaaaaaaalc","aaaaaaaald","aaaaaaaale","aaaaaaaalf","aaaaaaaalg","aaaaaaaalh","aaaaaaaali","aaaaaaaalj","aaaaaaaalk","aaaaaaaall","aaaaaaaalm","aaaaaaaaln","aaaaaaaalo","aaaaaaaalp","aaaaaaaalq","aaaaaaaalr","aaaaaaaals","aaaaaaaalt","aaaaaaaalu","aaaaaaaalv","aaaaaaaalw","aaaaaaaalx","aaaaaaaaly","aaaaaaaalz","aaaaaaaama","aaaaaaaamb","aaaaaaaamc","aaaaaaaamd","aaaaaaaame","aaaaaaaamf","aaaaaaaamg","aaaaaaaamh","aaaaaaaami","aaaaaaaamj","aaaaaaaamk","aaaaaaaaml","aaaaaaaamm","aaaaaaaamn","aaaaaaaamo","aaaaaaaamp","aaaaaaaamq","aaaaaaaamr","aaaaaaaams","aaaaaaaamt","aaaaaaaamu","aaaaaaaamv","aaaaaaaamw","aaaaaaaamx","aaaaaaaamy","aaaaaaaamz","aaaaaaaana","aaaaaaaanb","aaaaaaaanc","aaaaaaaand","aaaaaaaane","aaaaaaaanf","aaaaaaaang","aaaaaaaanh","aaaaaaaani","aaaaaaaanj","aaaaaaaank","aaaaaaaanl","aaaaaaaanm","aaaaaaaann","aaaaaaaano","aaaaaaaanp","aaaaaaaanq","aaaaaaaanr","aaaaaaaans","aaaaaaaant","aaaaaaaanu","aaaaaaaanv","aaaaaaaanw","aaaaaaaanx","aaaaaaaany","aaaaaaaanz","aaaaaaaaoa","aaaaaaaaob","aaaaaaaaoc","aaaaaaaaod","aaaaaaaaoe","aaaaaaaaof","aaaaaaaaog","aaaaaaaaoh","aaaaaaaaoi","aaaaaaaaoj","aaaaaaaaok","aaaaaaaaol","aaaaaaaaom","aaaaaaaaon","aaaaaaaaoo","aaaaaaaaop","aaaaaaaaoq","aaaaaaaaor","aaaaaaaaos","aaaaaaaaot","aaaaaaaaou","aaaaaaaaov","aaaaaaaaow","aaaaaaaaox","aaaaaaaaoy","aaaaaaaaoz","aaaaaaaapa","aaaaaaaapb","aaaaaaaapc","aaaaaaaapd","aaaaaaaape","aaaaaaaapf","aaaaaaaapg","aaaaaaaaph","aaaaaaaapi","aaaaaaaapj","aaaaaaaapk","aaaaaaaapl","aaaaaaaapm","aaaaaaaapn","aaaaaaaapo","aaaaaaaapp","aaaaaaaapq","aaaaaaaapr","aaaaaaaaps","aaaaaaaapt","aaaaaaaapu","aaaaaaaapv","aaaaaaaapw","aaaaaaaapx","aaaaaaaapy","aaaaaaaapz","aaaaaaaaqa","aaaaaaaaqb","aaaaaaaaqc","aaaaaaaaqd","aaaaaaaaqe","aaaaaaaaqf","aaaaaaaaqg","aaaaaaaaqh","aaaaaaaaqi","aaaaaaaaqj","aaaaaaaaqk","aaaaaaaaql","aaaaaaaaqm","aaaaaaaaqn","aaaaaaaaqo","aaaaaaaaqp","aaaaaaaaqq","aaaaaaaaqr","aaaaaaaaqs","aaaaaaaaqt","aaaaaaaaqu","aaaaaaaaqv","aaaaaaaaqw","aaaaaaaaqx","aaaaaaaaqy","aaaaaaaaqz","aaaaaaaara","aaaaaaaarb","aaaaaaaarc","aaaaaaaard","aaaaaaaare","aaaaaaaarf","aaaaaaaarg","aaaaaaaarh","aaaaaaaari","aaaaaaaarj","aaaaaaaark","aaaaaaaarl","aaaaaaaarm","aaaaaaaarn","aaaaaaaaro","aaaaaaaarp","aaaaaaaarq","aaaaaaaarr","aaaaaaaars","aaaaaaaart","aaaaaaaaru","aaaaaaaarv","aaaaaaaarw","aaaaaaaarx","aaaaaaaary","aaaaaaaarz","aaaaaaaasa","aaaaaaaasb","aaaaaaaasc","aaaaaaaasd","aaaaaaaase","aaaaaaaasf","aaaaaaaasg","aaaaaaaash","aaaaaaaasi","aaaaaaaasj","aaaaaaaask","aaaaaaaasl","aaaaaaaasm","aaaaaaaasn","aaaaaaaaso","aaaaaaaasp","aaaaaaaasq","aaaaaaaasr","aaaaaaaass","aaaaaaaast","aaaaaaaasu","aaaaaaaasv","aaaaaaaasw","aaaaaaaasx","aaaaaaaasy","aaaaaaaasz","aaaaaaaata","aaaaaaaatb","aaaaaaaatc","aaaaaaaatd","aaaaaaaate","aaaaaaaatf","aaaaaaaatg","aaaaaaaath","aaaaaaaati","aaaaaaaatj","aaaaaaaatk","aaaaaaaatl","aaaaaaaatm","aaaaaaaatn","aaaaaaaato","aaaaaaaatp","aaaaaaaatq","aaaaaaaatr","aaaaaaaats","aaaaaaaatt","aaaaaaaatu","aaaaaaaatv","aaaaaaaatw","aaaaaaaatx","aaaaaaaaty","aaaaaaaatz","aaaaaaaaua","aaaaaaaaub","aaaaaaaauc","aaaaaaaaud","aaaaaaaaue","aaaaaaaauf","aaaaaaaaug","aaaaaaaauh","aaaaaaaaui","aaaaaaaauj","aaaaaaaauk","aaaaaaaaul","aaaaaaaaum","aaaaaaaaun","aaaaaaaauo","aaaaaaaaup","aaaaaaaauq","aaaaaaaaur","aaaaaaaaus","aaaaaaaaut","aaaaaaaauu","aaaaaaaauv","aaaaaaaauw","aaaaaaaaux","aaaaaaaauy","aaaaaaaauz","aaaaaaaava","aaaaaaaavb","aaaaaaaavc","aaaaaaaavd","aaaaaaaave","aaaaaaaavf","aaaaaaaavg","aaaaaaaavh","aaaaaaaavi","aaaaaaaavj","aaaaaaaavk","aaaaaaaavl","aaaaaaaavm","aaaaaaaavn","aaaaaaaavo","aaaaaaaavp","aaaaaaaavq","aaaaaaaavr","aaaaaaaavs","aaaaaaaavt","aaaaaaaavu","aaaaaaaavv","aaaaaaaavw","aaaaaaaavx","aaaaaaaavy","aaaaaaaavz","aaaaaaaawa","aaaaaaaawb","aaaaaaaawc","aaaaaaaawd","aaaaaaaawe","aaaaaaaawf","aaaaaaaawg","aaaaaaaawh","aaaaaaaawi","aaaaaaaawj","aaaaaaaawk","aaaaaaaawl","aaaaaaaawm","aaaaaaaawn","aaaaaaaawo","aaaaaaaawp","aaaaaaaawq","aaaaaaaawr","aaaaaaaaws","aaaaaaaawt","aaaaaaaawu","aaaaaaaawv","aaaaaaaaww","aaaaaaaawx","aaaaaaaawy","aaaaaaaawz","aaaaaaaaxa","aaaaaaaaxb","aaaaaaaaxc","aaaaaaaaxd","aaaaaaaaxe","aaaaaaaaxf","aaaaaaaaxg","aaaaaaaaxh","aaaaaaaaxi","aaaaaaaaxj","aaaaaaaaxk","aaaaaaaaxl","aaaaaaaaxm","aaaaaaaaxn","aaaaaaaaxo","aaaaaaaaxp","aaaaaaaaxq","aaaaaaaaxr","aaaaaaaaxs","aaaaaaaaxt","aaaaaaaaxu","aaaaaaaaxv","aaaaaaaaxw","aaaaaaaaxx","aaaaaaaaxy","aaaaaaaaxz","aaaaaaaaya","aaaaaaaayb","aaaaaaaayc","aaaaaaaayd","aaaaaaaaye","aaaaaaaayf","aaaaaaaayg","aaaaaaaayh","aaaaaaaayi","aaaaaaaayj","aaaaaaaayk","aaaaaaaayl","aaaaaaaaym","aaaaaaaayn","aaaaaaaayo","aaaaaaaayp","aaaaaaaayq","aaaaaaaayr","aaaaaaaays","aaaaaaaayt","aaaaaaaayu","aaaaaaaayv","aaaaaaaayw","aaaaaaaayx","aaaaaaaayy","aaaaaaaayz","aaaaaaaaza","aaaaaaaazb","aaaaaaaazc","aaaaaaaazd","aaaaaaaaze","aaaaaaaazf","aaaaaaaazg","aaaaaaaazh","aaaaaaaazi","aaaaaaaazj","aaaaaaaazk","aaaaaaaazl","aaaaaaaazm","aaaaaaaazn","aaaaaaaazo","aaaaaaaazp","aaaaaaaazq","aaaaaaaazr","aaaaaaaazs","aaaaaaaazt","aaaaaaaazu","aaaaaaaazv","aaaaaaaazw","aaaaaaaazx","aaaaaaaazy","aaaaaaaazz"});
    expected = List.of("aaaaaaaaaa", "aaaaaaaaab", "aaaaaaaaac", "aaaaaaaaad", "aaaaaaaaae", "aaaaaaaaaf", "aaaaaaaaag", "aaaaaaaaah", "aaaaaaaaai", "aaaaaaaaaj", "aaaaaaaaak", "aaaaaaaaal", "aaaaaaaaan", "aaaaaaaaao", "aaaaaaaaap", "aaaaaaaaaq", "aaaaaaaaar", "aaaaaaaaas", "aaaaaaaaat", "aaaaaaaaau", "aaaaaaaaav", "aaaaaaaaaw", "aaaaaaaaay", "aaaaaaaaaz", "aaaaaaaabc", "aaaaaaaabm", "aaaaaaaacb", "aaaaaaaacd", "aaaaaaaadc", "aaaaaaaade", "aaaaaaaaed", "aaaaaaaaef", "aaaaaaaafe", "aaaaaaaafg", "aaaaaaaagf", "aaaaaaaagh", "aaaaaaaahg", "aaaaaaaahi", "aaaaaaaaih", "aaaaaaaaij", "aaaaaaaaji", "aaaaaaaajk", "aaaaaaaakj", "aaaaaaaakl", "aaaaaaaalk", "aaaaaaaanm", "aaaaaaaano", "aaaaaaaaon", "aaaaaaaaop", "aaaaaaaapo", "aaaaaaaapq", "aaaaaaaaqp", "aaaaaaaaqr", "aaaaaaaarq", "aaaaaaaars", "aaaaaaaasr", "aaaaaaaast", "aaaaaaaats", "aaaaaaaatu", "aaaaaaaaut", "aaaaaaaauv", "aaaaaaaavu", "aaaaaaaavw", "aaaaaaaawv", "aaaaaaaawx", "aaaaaaaayx", "aaaaaaaayz", "aaaaaaaaza", "aaaaaaaazy");
    Assert.assertEquals(expected, actual);
  }
}
