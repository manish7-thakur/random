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
  }
}
