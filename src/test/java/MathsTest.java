import org.junit.*;

public class MathsTest {
  @Test
  public void divideWithoutUsingSlash() {
    int actual = Maths.divide(2, 2);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(10, 3);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(7, -3);
    expected = -2;
    Assert.assertEquals(expected, actual);
  }
}
