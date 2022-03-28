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
}
