import org.junit.*;

public class LCSTest {
	@Test
	public void buildSeqOneCrossOne() {
		char[][] path = new char[][]{{'m'}};
		StringBuilder b = new StringBuilder();
		String actual = LCS.buildSeq(path, b, 0, 0, "b");
		String expected = "b";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void buildSeqTwoCrossTwo() {
		char[][] path = new char[][]{
			{'m' ,'u'},
			{'b' ,'m'}};
		StringBuilder b = new StringBuilder();
		String actual = LCS.buildSeq(path, b, 1, 1, "bc");
		String expected = "bc";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void buildSeqTwoCrossThree() {
		char[][] path = new char[][]{
			{'b' ,'u', 'b'},
			{'b' ,'m', 'b'}};
		StringBuilder b = new StringBuilder();
		String actual = LCS.buildSeq(path, b, 1, 1, "bcg");
		String expected = "c";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsSingleCharStrings() {
		String actual = LCS.find("p", "p", 0, 0);
		String expected = "p";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsSingleCharStringsNoMatch() {
		String actual = LCS.find("p", "a", 0, 0);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsTwoCharStringsOneMatch() {
		String actual = LCS.find("ps", "sp", 1, 1);
		String expected = "p";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsTwoCharStringsTwoMatch() {
		String actual = LCS.find("pq", "pq", 1, 1);
		String expected = "pq";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsThreeCharStringsTwoMatch() {
		String actual = LCS.find("pqs", "spq", 2, 2);
		String expected = "pq";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsThreeCharStringsFullMatch() {
		String actual = LCS.find("pqr", "pqr", 2, 2);
		String expected = "pqr";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsFourCharStringsThreeMatch() {
		String actual = LCS.find("pqra", "prqa", 3, 3);
		String expected = "pqa";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsFourCharStringsNoMatch() {
		String actual = LCS.find("pqra", "weud", 3, 3);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsFiveCharStringsOneMatch() {
		String actual = LCS.find("dpqra", "arqpd", 4, 4);
		String expected = "d";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void lcsFiveCharStringsTwoMatch() {
		String actual = LCS.find("pqras", "spkqh", 4, 4);
		String expected = "pq";
		Assert.assertEquals(expected, actual);
	}

}