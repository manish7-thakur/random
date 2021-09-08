import org.junit.*;

public class MaximalRectangleTest {
  @Test
  public void calcMaxArea() {
    int actual = MaximalRectangle.maximalRectangle(new char[][]{});
    int expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MaximalRectangle.maximalRectangle(new char[][]{{'0'}});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MaximalRectangle.maximalRectangle(new char[][]{{'1'}});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = MaximalRectangle.maximalRectangle(new char[][]{{'0', '0'}});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = MaximalRectangle.maximalRectangle(new char[][]{{'1', '1'}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = MaximalRectangle.maximalRectangle(new char[][]{{'1', '0'}, {'1', '0'}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = MaximalRectangle.maximalRectangle(new char[][]{{'1', '0'}, {'1', '1'}});
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = MaximalRectangle.maximalRectangle(new char[][]{{'1', '1'}, {'1', '1'}});
    expected = 4;
    Assert.assertEquals(expected, actual);
  }
}
