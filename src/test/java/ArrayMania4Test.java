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
}
