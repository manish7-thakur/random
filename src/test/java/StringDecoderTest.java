import org.junit.*;

public class StringDecoderTest {
  @Test
  public void decodeString() {
    String actual = StringDecoder.decode("1[a]");
    String expected = "a";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("2[a]");
    expected = "aa";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("12[a]");
    expected = "aaaaaaaaaaaa";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("4[ab]");
    expected = "abababab";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("2[sfh]2[ab]");
    expected = "sfhsfhabab";
    Assert.assertEquals(expected, actual);

  }
}
