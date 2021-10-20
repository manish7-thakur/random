import org.junit.*;

public class StringMultiplierTest {
  @Test
  public void multiplyString() {
    String actual = StringMultiplier.multiply("1", "2");
    String expected = "2";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply2("12", "2");
    expected = "24";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("78", "9");
    expected = "702";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("78", "99");
    expected = "7722";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("728", "199");
    expected = "144872";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("7228", "1949");
    expected = "14087372";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("9999", "0");
    expected = "0";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("123456789", "987654321");
    expected = "121932631112635269";
    Assert.assertEquals(expected, actual);
  }
}
