import org.junit.*;
import java.util.*;

public class ArrayMania4Test {
  @Test
  public void playTheGameOfLife() {
    int[][] actual = new int[][]{{0, 1}};
    ArrayMania4.gameOfLife(actual);
    int[][] expected = new int[][]{{0, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{0, 1},  {1, 1}};
    ArrayMania4.gameOfLife(actual);
    expected = new int[][]{{1, 1}, {1, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1},  {1, 1}};
    ArrayMania4.gameOfLife(actual);
    expected = new int[][]{{1, 1}, {1, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 0, 1},{1, 0, 1},{1, 0, 1}};
    ArrayMania4.gameOfLife(actual);
    expected = new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 0, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{0, 1, 0},{0, 1, 0},{1, 1, 1}};
    ArrayMania4.gameOfLife(actual);
    expected = new int[][]{{0, 0, 0}, {0, 0, 0}, {1, 1, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
    ArrayMania4.gameOfLife(actual);
    expected = new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
    Assert.assertArrayEquals(expected, actual);
  }
  @Test
  public void findNextLargerPermutationOfAnArray() {
    int[] actual = new int[]{2};
    ArrayMania4.nextPermutation(actual);
    int[] expected = new int[]{2};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 2};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{2, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{2, 1};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 2, 3};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 3, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 3, 2};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{2, 1, 3};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{2, 1, 3};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{2, 3, 1};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{2, 3, 1};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{3, 1, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{3, 2, 1};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 2, 3};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 2, 3, 4};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 2, 4, 3};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 2, 4, 3};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 3, 2, 4};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 3, 2, 4};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 3, 4, 2};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{1, 3, 4, 2};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 4, 2, 3};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{4, 3, 2, 1};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{1, 2, 3, 4};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{3, 2, 6, 5, 4};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{3, 4, 2, 5, 6};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[]{3, 5, 6, 5, 4};
    ArrayMania4.nextPermutation(actual);
    expected = new int[]{3, 6, 4, 5, 5};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void summaryOfRanges() {
    List<String> actual = ArrayMania4.summaryRanges(new int[]{});
    List<String> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.summaryRanges(new int[]{0});
    expected = List.of("0");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.summaryRanges(new int[]{0, 1});
    expected = List.of("0->1");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.summaryRanges(new int[]{0, 2});
    expected = List.of("0", "2");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.summaryRanges(new int[]{0, 1, 2});
    expected = List.of("0->2");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.summaryRanges(new int[]{0, 1, 2, 4, 5});
    expected = List.of("0->2", "4->5");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.summaryRanges(new int[]{0, 1, 2, 4, 6, 7});
    expected = List.of("0->2", "4", "6->7");
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.summaryRanges(new int[]{0, 2, 4, 8, 10, 11, 12});
    expected = List.of("0", "2", "4", "8", "10->12");
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void findMissingNumsInRange() {
    List<Integer> actual = ArrayMania4.findDisappearedNumbers(new int[]{1});
    List<Integer> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.findDisappearedNumbers(new int[]{1, 1});
    expected = List.of(2);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.findDisappearedNumbers(new int[]{2, 2});
    expected = List.of(1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.findDisappearedNumbers(new int[]{2, 1});
    expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.findDisappearedNumbers(new int[]{2, 2, 3});
    expected = List.of(1);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.findDisappearedNumbers(new int[]{2, 2, 3, 1});
    expected = List.of(4);
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    expected = List.of(5, 6);
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void addOneToArray() {
    int[] actual = ArrayMania4.plusOne(new int[]{1});
    int[] expected = new int[]{2};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania4.plusOne(new int[]{9});
    expected = new int[]{1, 0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania4.plusOne(new int[]{9, 9});
    expected = new int[]{1, 0, 0};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania4.plusOne(new int[]{9, 8});
    expected = new int[]{9, 9};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania4.plusOne(new int[]{1, 9, 9, 9});
    expected = new int[]{2, 0, 0, 0};
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void calculatePermieterOfIsland() {
    int actual = ArrayMania4.islandPerimeter(new int[][]{{0}});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.islandPerimeter(new int[][]{{1}});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.islandPerimeter(new int[][]{{1, 0}});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.islandPerimeter(new int[][]{{1, 1, 0}});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.islandPerimeter(new int[][]{{1, 1, 1}});
    expected = 8;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.islandPerimeter(new int[][]{{1, 1}, {1, 0}});
    expected = 8;
    Assert.assertEquals(expected, actual);

    actual = ArrayMania4.islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}});
    expected = 16;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void subArraySumofAtleast2ElemsWithMultipleK() {
    boolean actual = ArrayMania4.checkSubarraySum(new int[]{0}, 2);
    Assert.assertFalse(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{0, 1}, 1);
    Assert.assertTrue(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{1, 2}, 2);
    Assert.assertFalse(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{5, 0, 0, 0}, 3);
    Assert.assertTrue(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{1, 2, 2}, 2);
    Assert.assertTrue(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{2, 2, 1}, 3);
    Assert.assertTrue(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{2, 4, 5, 2}, 4);
    Assert.assertFalse(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{2, 4, 5, 3}, 8);
    Assert.assertTrue(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{2, 4, 5, 8}, 8);
    Assert.assertFalse(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6);
    Assert.assertTrue(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6);
    Assert.assertTrue(actual);

    actual = ArrayMania4.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13);
    Assert.assertFalse(actual);
  }
  @Test
  public void intersectionOfTwoArrays() {
    int[] actual = ArrayMania4.intersection(new int[]{1}, new int[]{2});
    int[] expected = new int[0];
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania4.intersection(new int[]{1}, new int[]{2, 1});
    expected = new int[]{1};
    Assert.assertArrayEquals(expected, actual);

    actual = ArrayMania4.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
    expected = new int[]{4, 9};
    Assert.assertArrayEquals(expected, actual);
  }
}
