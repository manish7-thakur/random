import org.junit.*;

public class StringMania2Test {
  @Test
  public void stringToInteger() {
    int actual = StringMania2.atoi("2");
    int expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("32");
    expected = 32;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("326");
    expected = 326;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("-326");
    expected = -326;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("- 326 ");
    expected = -326;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("- 34326 with words ");
    expected = -34326;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi(" 423645236423644352 with words ");
    expected = 2147483647;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("- 423645236423644352 with words ");
    expected = -2147483648;
    Assert.assertEquals(expected, actual);
  }
}
