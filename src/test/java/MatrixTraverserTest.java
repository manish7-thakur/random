import org.junit.*;

public class MatrixTraverserTest {
  @Test
  public void testFindNumInSortedMatrix() {
    boolean actual = MatrixTraverser.searchMatrix(new int[][]{{1}}, 1);
    Assert.assertTrue(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1}}, 2);
    Assert.assertFalse(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1, 2}}, 2);
    Assert.assertTrue(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1, 2}, {2, 4}}, 4);
    Assert.assertTrue(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1, 2}, {3, 4}}, 3);
    Assert.assertTrue(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1, 2}, {3, 4}}, 5);
    Assert.assertFalse(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1, 2, 4}, {5, 6, 8}}, 5);
    Assert.assertTrue(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1, 2, 4}, {5, 6, 8}, {6, 8, 9}}, 3);
    Assert.assertFalse(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{{1, 2, 4}, {5, 6, 8}, {7, 8, 9}}, 7);
    Assert.assertTrue(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{
      {1, 4, 7,11,15},
      {2, 5, 8,12,19},
      {3, 6, 9,16,22},
      {10,13,14,17,24},
      {18,21,23,26,30}}, 18);
    Assert.assertTrue(actual);

    actual = MatrixTraverser.searchMatrix(new int[][]{
      {1, 4, 7,11,15},
      {2, 5, 8,12,19},
      {3, 6, 9,16,22},
      {10,13,14,17,24},
      {18,21,23,26,30}}, 20);
    Assert.assertFalse(actual);
  }
}
