import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {
	@Test
	public void isPalindromeNonRepeatingChars() {
	boolean actual = LongestPalindrome.isPalindrome("abcd", 0, 3);
	Assert.assertFalse(actual);
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
}