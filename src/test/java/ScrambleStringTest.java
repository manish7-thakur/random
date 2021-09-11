import org.junit.*;

public class ScrambleStringTest {
  @Test
  public void isScrambledFormOf() {
    boolean actual = ScrambleString.isScramble("a", "a");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("a", "ab");
    Assert.assertFalse(actual);

    actual = ScrambleString.isScramble("ab", "ba");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("aa", "ba");
    Assert.assertFalse(actual);

    actual = ScrambleString.isScramble("abc", "bca");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("abcd", "cdba");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("abcd", "acdb");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("great", "rgeat");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("abcde", "caebd");
    Assert.assertFalse(actual);
  }

}
