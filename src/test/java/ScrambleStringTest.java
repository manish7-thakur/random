import org.junit.*;

public class ScrambleStringTest {
  @Test
  public void isScrambledFormOf() {
    boolean actual = ScrambleString.isScramble("a", "a");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("ab", "ba");
    Assert.assertTrue(actual);

    actual = ScrambleString.isScramble("aa", "ba");
    Assert.assertFalse(actual);

    actual = ScrambleString.isScramble("aa", "ba");
    Assert.assertFalse(actual);

    actual = ScrambleString.isScramble("abc", "bca");
    Assert.assertTrue(actual);
  }

}
