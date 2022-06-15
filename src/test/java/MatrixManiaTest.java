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

    actual = new int[][]{{1, 1, 0}, {1, 1, 1}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{2, 1, 0}, {3, 2, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1,1,0,0,1,0,0,1,1,0},{1,0,0,1,0,1,1,1,1,1},{1,1,1,0,0,1,1,1,1,0}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{2,1,0,0,1,0,0,1,1,0},{1,0,0,1,0,1,1,2,2,1},{2,1,1,0,0,1,2,2,1,0}};
    Assert.assertArrayEquals(expected, actual);

    actual = new int[][]{{1,1,0,0,1,0,0,1,1,0},{1,0,0,1,0,1,1,1,1,1},{1,1,1,0,0,1,1,1,1,0},{0,1,1,1,0,1,1,1,1,1},{0,0,1,1,1,1,1,1,1,0},{1,1,1,1,1,1,0,1,1,1},{0,1,1,1,1,1,1,0,0,1},{1,1,1,1,1,0,0,1,1,1},{0,1,0,1,1,0,1,1,1,1},{1,1,1,0,1,0,1,1,1,1}};
    MatrixMania.nearestZeroCell(actual);
    expected = new int[][]{{2,1,0,0,1,0,0,1,1,0},{1,0,0,1,0,1,1,2,2,1},{1,1,1,0,0,1,2,2,1,0},{0,1,2,1,0,1,2,3,2,1},{0,0,1,2,1,2,1,2,1,0},{1,1,2,3,2,1,0,1,1,1},{0,1,2,3,2,1,1,0,0,1},{1,2,1,2,1,0,0,1,1,2},{0,1,0,1,1,0,1,2,2,3},{1,2,1,0,1,0,1,2,3,4}};
    Assert.assertArrayEquals(expected, actual);
  }
  @Test
  public void findKClosestPointToOrigin() {
    int[][] actual = MatrixMania.kClosest(new int[][]{{1, 0}, {0, 1}}, 1);
    int[][] expected = new int[][]{{1, 0}};
    Assert.assertArrayEquals(expected, actual);

    actual = MatrixMania.kClosest(new int[][]{{1, 0}, {0, 1}}, 2);
    expected = new int[][]{{1, 0}, {0, 1}};
    Assert.assertArrayEquals(expected, actual);

    actual = MatrixMania.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1);
    expected = new int[][]{{-2, 2}};
    Assert.assertArrayEquals(expected, actual);

    actual = MatrixMania.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
    expected = new int[][]{{3, 3}, {-2, 4}};
    Assert.assertArrayEquals(expected, actual);

    actual = MatrixMania.kClosest(new int[][]{{3, 3}, {5, -1}, {-3, 4}, {2, 3}, {3, 5}, {5, 2}}, 4);
    expected = new int[][]{{2, 3}, {3, 3}, {-3, 4}, {5, -1}};
    Assert.assertArrayEquals(expected, actual);
  }
  @Test
  public void timeToRotAllOranges() {
    int actual = MatrixMania.orangesRotting(new int[][]{{0}});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{0, 2}});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{0, 2, 1}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{0, 1, 2}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{2, 0}, {1, 0}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{1, 0}, {2, 0}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{1, 0, 2}, {2, 0, 1}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{1, 0, 2}, {0, 0, 1}});
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = MatrixMania.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}});
    expected = -1;
    Assert.assertEquals(expected, actual);


  }
}
