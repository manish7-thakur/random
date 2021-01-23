import org.junit.*;

//cost
//copy(c) -> 1
//replace(r) -> 1
//insert(i) -> 1
//delete(d) -> 1 
//twiddle(t) -> 1
public class EditDistanceTest {
	@Test
	public void singleCharStringEmptySource() {
		int actual = EditDistance.find("", "n", -1, 0);
		int expected = 1;//insert
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void singleCharStringTargetEmpty() {
		int actual = EditDistance.find("a", "", 0, -1);
		int expected = 1;//delete
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void singleCharIdenticalString() {
		int actual = EditDistance.find("a", "a", 0, 0);
		int expected = 1; //copy
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void singleCharNonIdenticalString() {
		int actual = EditDistance.find("a", "b", 0, 0);
		int expected = 1; //Min(replace, delete + insert)
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void doubleCharNonIdenticalString() {
		int actual = EditDistance.find("ab", "bc", 1, 1);
		int expected = 2; //Min(replace + replace, insert + copy + delete)
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void doubleCharreversedString() {
		int actual = EditDistance.find("ab", "ba", 1, 1);
		int expected = 1; //twiddle
		Assert.assertEquals(expected, actual);
	}
}