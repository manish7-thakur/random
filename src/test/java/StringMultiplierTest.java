import org.junit.*;

public class StringMultiplierTest {
  @Test
  public void multiplyString() {
    String actual = StringMultiplier.multiply("1", "2");
    String expected = "2";
    Assert.assertEquals(expected, actual);
  }
}
