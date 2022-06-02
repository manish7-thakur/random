import org.junit.*;

public class MatrixManiaTest {
  @Test
  public void nearestDistanceToZeroForEachCell() {
    int[][] actual = new int[][]{{0}};
    MatrixMania.nearestZeroCell(actual);
    int[][] expected = new int[][]{{0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1, 0}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{2, 1, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1, 0}, {0, 1, 0}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{1, 1, 0}, {0, 1, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1, 0}, {1, 1, 0}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{2, 1, 0}, {2, 1, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{2, 1, 2}, {1, 0, 1}, {2, 1, 2}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1, 0, 1}, {1, 0, 1}, {0, 1, 0}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{1, 0, 1}, {1, 0, 1}, {0, 1, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{
      {1, 1, 0},
      {1, 1, 1}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{
      {2, 1, 0},
      {3, 2, 1}};
    Assert.assertArrayEquals(expected, actual);
  }
}
