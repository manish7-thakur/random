import org.junit.*;

public class StringMultiplierTest {
  @Test
  public void multiplyString() {
    String actual = StringMultiplier.multiply2("1", "2");
    String expected = "2";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply2("12", "2");
    expected = "24";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply2("78", "9");
    expected = "702";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply2("78", "99");
    expected = "7722";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply2("728", "199");
    expected = "144872";
    Assert.assertEquals(expected, actual);
  }
}
