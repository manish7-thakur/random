import org.junit.*;

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
}
