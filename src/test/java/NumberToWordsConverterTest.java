import org.junit.*;

public class NumberToWordsConverterTest {
  @Test
  public void testIntegerToWordsConversion() {
    String actual = NumberToWordsConverter.numberToWords(1);
    String expected = "One";
    Assert.assertEquals(expected, actual);
  }
}
