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

    actual = ArrayMania.numIslands(new char[][]{
      {'1', '0', '0', '1'},
      {'1', '1', '0', '1'}});
    expected = 2;
    Assert.assertEquals(expected, actual);
    actual = ArrayMania.numIslands(new char[][]{
      {'1', '0', '0', '1'},
      {'1', '0', '0', '0'},
      {'1', '1', '0', '1'}});
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
}
