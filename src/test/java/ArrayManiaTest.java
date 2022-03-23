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

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{2, 2}, {1, 2}});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{1, 5}, {1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{1, 5}, {2, 3}, {1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania.eraseOverlapIntervals(new int[][]{{2, 5}, {3, 3}, {1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

  }
}
