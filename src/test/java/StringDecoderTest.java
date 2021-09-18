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

    actual = StringDecoder.decode("2[sfh2[ab]]");
    expected = "sfhababsfhabab";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("2[abc]3[cd]ef");
    expected = "abcabccdcdcdef";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("abc3[cd]xyz");
    expected = "abccdcdcdxyz";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("2[a3[d]b]");
    expected = "adddbadddb";
    Assert.assertEquals(expected, actual);

    actual = StringDecoder.decode("2[sf2[a3[d]b]]");
    expected = "sfadddbadddbsfadddbadddb";
    Assert.assertEquals(expected, actual);

  }
}
