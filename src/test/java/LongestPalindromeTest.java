import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {
    @Test
    public void isPalindromeNonRepeatingChars() {
        boolean actual = LongestPalindrome.isPalindrome("abcd", 0, 3);
        Assert.assertFalse(actual);
    }

    @Test
    public void isPalindromeRepeatingCharEvenPalindromeLen2() {
        boolean actual = LongestPalindrome.isPalindrome("bb", 0, 1);
        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindromeRepeatingCharEvenPalindrome() {
        boolean actual = LongestPalindrome.isPalindrome("abba", 0, 3);
        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindromeRepeatingCharOddPalindrome() {
        boolean actual = LongestPalindrome.isPalindrome("aba", 0, 2);
        Assert.assertTrue(actual);
    }

    @Test
    public void longestPalindromeNonRepeatingChars() {
        String actual = LongestPalindrome.longestPalindrome("abcd");
        String expected = "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromeRepeatingCharsLen4() {
        String actual = LongestPalindrome.longestPalindrome("abbd");
        String expected = "bb";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromeRepeatingCharsLen5() {
        String actual = LongestPalindrome.longestPalindrome("abcbd");
        String expected = "bcb";
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void longestPalindromeRepeatingCharsLenEntireString() {
        String actual = LongestPalindrome.longestPalindrome("abcba");
        String expected = "abcba";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromeRepeatingCharsLenAll() {
        String actual = LongestPalindrome.longestPalindrome("bbbbbbb");
        String expected = "bbbbbbb";
        Assert.assertEquals(expected, actual);
    }
}