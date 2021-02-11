import org.junit.*;

public class PatternFinderTest {
	@Test
	public void findPatternEmptyText() {
		int actual = PatternFinder.find("", "a");
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void findPatternSingleCharText() {
		int actual = PatternFinder.find("a", "a");
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void findPatternDoubleCharText() {
		int actual = PatternFinder.find("ab", "b");
		int expected = 1;
		Assert.assertEquals(expected, actual);
		actual = PatternFinder.find("ab", "ab");
		expected = 0;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void findPatternTripleCharText() {
		int actual = PatternFinder.find("abc", "c");
		int expected = 2;
		Assert.assertEquals(expected, actual);
		actual = PatternFinder.find("cab", "ab");
		expected = 1;
		Assert.assertEquals(expected, actual);
		actual = PatternFinder.find("abc", "ab");
		expected = 0;
		Assert.assertEquals(expected, actual);
		actual = PatternFinder.find("abc", "ac");
		expected = -1;
		Assert.assertEquals(expected, actual);
	}

		@Test
	public void findPatternFourCharText() {
		int actual = PatternFinder.find("abcd", "d");
		int expected = 3;
		Assert.assertEquals(expected, actual);
		actual = PatternFinder.find("cdab", "ab");
		expected = 2;
		Assert.assertEquals(expected, actual);
		actual = PatternFinder.find("abdc", "acb");
		expected = -1;
		Assert.assertEquals(expected, actual);
		actual = PatternFinder.find("adbc", "db");
		expected = 1;
		Assert.assertEquals(expected, actual);
	}
}