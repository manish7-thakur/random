import org.junit.*;

public class LongestMatchingParenthesisFinderTest {
	@Test
	public void findLongestMatchingParenthesisString() {
		int actual = LongestMatchingParenthesisFinder.find(")");
		int expected = 0;
		Assert.assertEquals(expected, actual);

		actual = LongestMatchingParenthesisFinder.find(")(");
		expected = 0;
		Assert.assertEquals(expected, actual);

		actual = LongestMatchingParenthesisFinder.find(")()");
		expected = 2;
		Assert.assertEquals(expected, actual);

		actual = LongestMatchingParenthesisFinder.find(")(())");
		expected = 4;
		Assert.assertEquals(expected, actual);

		actual = LongestMatchingParenthesisFinder.find(")((()())");
		expected = 6;
		Assert.assertEquals(expected, actual);

		actual = LongestMatchingParenthesisFinder.find(")((()()");
		expected = 4;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void validateParenthesis() {
		boolean actual  = LongestMatchingParenthesisFinder.isValid("(");
		Assert.assertFalse(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("()");
		Assert.assertTrue(actual);

		actual  = LongestMatchingParenthesisFinder.isValid(")(");
		Assert.assertFalse(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("{}");
		Assert.assertTrue(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("[]");
		Assert.assertTrue(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("[{}]");
		Assert.assertTrue(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("[{(})]");
		Assert.assertFalse(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("[{()]");
		Assert.assertFalse(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("[{()}]");
		Assert.assertTrue(actual);

		actual  = LongestMatchingParenthesisFinder.isValid("[]{}()");
		Assert.assertTrue(actual);
	}
}
