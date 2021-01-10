import org.junit.*;

public class RegExTest {
	@Test
	public void matchEmptyString() {
		boolean actual = RegEx.matches("","", -1, -1);
		Assert.assertTrue(actual);
	}

	@Test
	public void matchStringSingleCharNoWildCard() {
		boolean actual = RegEx.matches("a","a", 0, 0);
		Assert.assertTrue(actual);
	}

	@Test
	public void matchStringSingleCharWildCard() {
		boolean actual = RegEx.matches("a","a*", 0, 1);
		Assert.assertTrue(actual);
	}

	@Test
	public void matchStringDoubleCharWildCard() {
		boolean actual = RegEx.matches("ab","a*", 1, 1);
		Assert.assertFalse(actual);
	}

	@Test
	public void matchStringTripleCharWildCard() {
		boolean actual = RegEx.matches("acb","a*b", 2, 2);
		Assert.assertFalse(actual);
	}

	@Test
	public void matchStringTripleCharWildCardOnlyDot() {
		boolean actual = RegEx.matches("bcy","b.y", 2, 2);
		Assert.assertTrue(actual);
	}

	@Test
	public void matchStringFourCharWildCard() {
		boolean actual = RegEx.matches("bcdy","b.*y", 3, 3);
		Assert.assertTrue(actual);
	}

	@Test
	public void matchStringFiveCharWildCard() {
		boolean actual = RegEx.matches("bcdy","a*b.*y", 3, 5);
		Assert.assertTrue(actual);
		boolean actual = RegEx.matches("ablmy","a*b.*y", 4, 5);
		Assert.assertTrue(actual);
	}
}