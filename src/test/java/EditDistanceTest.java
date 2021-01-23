import org.junit.*;

//cost
//copy(c) -> 0
//replace(r) -> 1
//insert(i) -> 1
//delete(d) -> 1 
//twiddle(t) -> 2
public class EditDistanceTest {
	@Test
	public void singleCharString() {
		int actual = EditDistance.find("a", "n", 0, 0);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void singleCharIdenticalString() {
		int actual = EditDistance.find("a", "a", 0, 0);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void doubleCharReversedString() {
		int actual = EditDistance.find("ax", "xa", 1, 1);
		int expected = 2; //twiddle
		Assert.assertEquals(expected, actual);
	}
}