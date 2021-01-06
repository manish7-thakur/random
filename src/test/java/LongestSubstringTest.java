import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {
    @Test
    public void Substring3CharsNonRepeating() {
        String actual = LongestSubstring.nonRepeatingSubstring("abc");
        String expected = "abc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Substring5CharsRepeating() {
        String actual = LongestSubstring.nonRepeatingSubstring("abca");
        String expected = "abc";
        Assert.assertEquals(expected, actual);
    }
}