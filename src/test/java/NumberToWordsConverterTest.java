import org.junit.*;

public class NumberToWordsConverterTest {
  @Test
  public void testIntegerToWordsConversion() {
    String actual = NumberToWordsConverter.numberToWords(0);
    String expected = "Zero";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1);
    expected = "One";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(9);
    expected = "Nine";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(10);
    expected = "Ten";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(20);
    expected = "Twenty";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(45);
    expected = "Forty Five";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(99);
    expected = "Ninety Nine";
    Assert.assertEquals(expected, actual);
  }
}
