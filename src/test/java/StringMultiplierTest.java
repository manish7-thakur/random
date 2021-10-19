import org.junit.*;

public class StringMultiplierTest {
  @Test
  public void multiplyString() {
    String actual = StringMultiplier.multiply("1", "2");
    String expected = "2";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("12", "2");
    expected = "24";
    Assert.assertEquals(expected, actual);

    actual = StringMultiplier.multiply("78", "9");
    expected = "702";
    Assert.assertEquals(expected, actual);
  }
}
