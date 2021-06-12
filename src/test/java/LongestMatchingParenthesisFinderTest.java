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
}