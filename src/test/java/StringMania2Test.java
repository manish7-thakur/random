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
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("- 34326 with words ");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi(" 423645236423644352 with words ");
    expected = 2147483647;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("-423645236423644352 with words ");
    expected = -2147483648;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("words and 987");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("-63 words and - 987");
    expected = -63;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("+1");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.atoi("+-1");
    expected = 0;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void evaluateReversePolishNotation() {
    int actual = StringMania2.evaluateRPN(new String[]{"5"});
    int expected = 5;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.evaluateRPN(new String[]{"5", "-2", "/"});
    expected = -2;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.evaluateRPN(new String[]{"5", "-2", "/", "-20", "+"});
    expected = -22;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.evaluateRPN(new String[]{"5", "-2", "/", "-20", "+", "0", "*"});
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.evaluateRPN(new String[]{"5", "-2", "-", "7", "/"});
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.evaluateRPN(new String[]{"4", "13", "5", "/", "+"});
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = StringMania2.evaluateRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
    expected = 22;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void removeDuplicatesAndReturnLexographicalSubsequence() {
    String actual = StringMania2.removeDuplicateLetters("a");
    String expected = "a";
    Assert.assertEquals(expected, actual);

    actual = StringMania2.removeDuplicateLetters("aba");
    expected = "ab";
    Assert.assertEquals(expected, actual);

    actual = StringMania2.removeDuplicateLetters("bab");
    expected = "ab";
    Assert.assertEquals(expected, actual);

    actual = StringMania2.removeDuplicateLetters("acbca");
    expected = "abc";
    Assert.assertEquals(expected, actual);

    actual = StringMania2.removeDuplicateLetters("aa");
    expected = "a";
    Assert.assertEquals(expected, actual);

    actual = StringMania2.removeDuplicateLetters("bcabc");
    expected = "abc";
    Assert.assertEquals(expected, actual);

  }
}
