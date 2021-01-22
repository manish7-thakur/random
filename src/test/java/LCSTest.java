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
}