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

    actual = StringMania.characterReplacement("WP", 1);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAP", 1);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAPTP", 2);
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WUAPTP", 2);
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAPTPT", 3);
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAPTPTWPEK", 5);
    expected = 9;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void minimumWindowSubstringContainingAllChars() {
    String actual = StringMania.minWindow("b", "a");
    String expected = "";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("a", "a");
    expected = "a";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("a", "aa");
    expected = "";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("abaa", "aa");
    expected = "aa";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("aabc", "ba");
    expected = "ab";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("aabc", "ba");
    expected = "ab";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("aacbcba", "ab");
    expected = "ba";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("addcdad", "ac");
    expected = "cda";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("adobecodebanc", "abc");
    expected = "banc";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("addcdaddsgaedsewdardfaesdadsesdfsdea", "rds");
    expected = "sewdar";
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void checkAnagrams() {
    boolean actual = StringMania.isAnagram("a" , "b");
    Assert.assertFalse(actual);

    actual = StringMania.isAnagram("a" , "ba");
    Assert.assertFalse(actual);

    actual = StringMania.isAnagram("ab" , "ba");
    Assert.assertTrue(actual);

    actual = StringMania.isAnagram("ab" , "baa");
    Assert.assertFalse(actual);

    actual = StringMania.isAnagram("adjsdjyajab" , "bayjjsjddaa");
    Assert.assertTrue(actual);
  }
}
