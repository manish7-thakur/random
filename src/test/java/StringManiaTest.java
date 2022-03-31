import org.junit.*;

public class StringManiaTest {
  @Test
  public void longestSubstringLengthWithoutRepeatingChars() {
    int actual = StringMania.lengthOfLongestSubstring("a");
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("ab");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aa");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aaa");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aba");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aab");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aabac");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("ababcdab");
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aababc");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aabaagdradsbvcgsdrvcavcfsrecavdsfdrewvcgsetjtlyobcwvsdaecsbcvcadsecwvcscwdfdsdvacsewcsd");
    expected = 13;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void longestRepeatingCharacterReplacement() {
    int actual = StringMania.characterReplacement("w", 0);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("wp", 0);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("wp", 1);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("wpap", 1);
    expected = 3;
    Assert.assertEquals(expected, actual);
  }
}
