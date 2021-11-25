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

    actual = NumberToWordsConverter.numberToWords(100);
    expected = "One Hundred";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(107);
    expected = "One Hundred Seven";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(110);
    expected = "One Hundred Ten";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(115);
    expected = "One Hundred Fifteen";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(150);
    expected = "One Hundred Fifty";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(199);
    expected = "One Hundred Ninety Nine";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(625);
    expected = "Six Hundred Twenty Five";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1000);
    expected = "One Thousand";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1008);
    expected = "One Thousand Eight";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1018);
    expected = "One Thousand Eighteen";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1058);
    expected = "One Thousand Fifty Eight";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1758);
    expected = "One Thousand Seven Hundred Fifty Eight";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(10000);
    expected = "Ten Thousand";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(10001);
    expected = "Ten Thousand One";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(10020);
    expected = "Ten Thousand Twenty";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(10120);
    expected = "Ten Thousand One Hundred Twenty";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(18820);
    expected = "Eighteen Thousand Eight Hundred Twenty";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(58900);
    expected = "Fifty Eight Thousand Nine Hundred";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(99999);
    expected = "Ninety Nine Thousand Nine Hundred Ninety Nine";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(100000);
    expected = "One Hundred Thousand";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(100001);
    expected = "One Hundred Thousand One";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(173561);
    expected = "One Hundred Seventy Three Thousand Five Hundred Sixty One";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(999999);
    expected = "Nine Hundred Ninety Nine Thousand Nine Hundred Ninety Nine";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1000000);
    expected = "One Million";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(1000001);
    expected = "One Million One";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(2100341);
    expected = "Two Million One Hundred Thousand Three Hundred Forty One";
    Assert.assertEquals(expected, actual);

    actual = NumberToWordsConverter.numberToWords(22100341);
    expected = "Twenty Two Million One Hundred Thousand Three Hundred Forty One";
    Assert.assertEquals(expected, actual);

  }
}
