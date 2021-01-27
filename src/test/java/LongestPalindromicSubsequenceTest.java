import org.junit.*;

public class LongestPalindromicSubsequenceTest {
	@Test
	public void singleCharString() {
		String s = "a";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void doubleCharStringPalindrome() {
		String s = "aa";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void doubleCharStringNonpalindrome() {
		String s = "ab";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tripleCharStringNonpalindrome() {
		String s = "abc";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tripleCharStringPalindrome() {
		String s = "aba";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tripleCharStringFirst2CharPalindrome() {
		String s = "aab";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tripleCharStringLast2CharPalindrome() {
		String s = "baa";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void fourCharStringfirst3CharPalindrome() {
		String s = "abac";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void fourCharStringLast3CharPalindrome() {
		String s = "bcac";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void fourCharStringNoPalindrome() {
		String s = "abcd";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}


	@Test
	public void fiveCharString() {
		String s = "abcda";
		int actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		int expected = 3;
		Assert.assertEquals(expected, actual);

		s = "abcba";
		 actual = LongestPalindromicSubsequence.find(s, s.length() - 1);
		 expected = 5;
		Assert.assertEquals(expected, actual);
	}

}