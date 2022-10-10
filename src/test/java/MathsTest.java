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

    actual = Maths.divide(-17, -3);
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(Integer.MAX_VALUE, 1);
    expected = Integer.MAX_VALUE;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(Integer.MAX_VALUE, -Integer.MAX_VALUE);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(Integer.MIN_VALUE, -Integer.MAX_VALUE);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(Integer.MIN_VALUE, Integer.MAX_VALUE);
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(Integer.MIN_VALUE, Integer.MIN_VALUE);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(Integer.MAX_VALUE, Integer.MIN_VALUE);
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = Maths.divide(Integer.MIN_VALUE, -Integer.MIN_VALUE);
    expected = 1;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void countNumberWithUniqueDigitsInRange() {
    int actual = Maths.countNumbersWithUniqueDigits(0);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = Maths.countNumbersWithUniqueDigits(1);
    expected = 10;
    Assert.assertEquals(expected, actual);

    actual = Maths.countNumbersWithUniqueDigits(2);
    expected = 91;
    Assert.assertEquals(expected, actual);

    actual = Maths.countNumbersWithUniqueDigits(3);
    expected = 739;
    Assert.assertEquals(expected, actual);

    actual = Maths.countNumbersWithUniqueDigits(6);
    expected = 168571;
    Assert.assertEquals(expected, actual);

    actual = Maths.countNumbersWithUniqueDigits(7);
    expected = 712891;
    Assert.assertEquals(expected, actual);

    actual = Maths.countNumbersWithUniqueDigits(8);
    expected = 2345851;
    Assert.assertEquals(expected, actual);
  }
}
