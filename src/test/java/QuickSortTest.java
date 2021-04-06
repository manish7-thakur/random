import org.junit.*;

public class QuickSortTest {
	@Test
	public void partitonArray() {
		int actual = Quicksort.partition(new int[]{1});
		int expected = 0;
		Assert.assertEquals(expected, actual);

		actual = Quicksort.partition(new int[]{2, 1});
		expected = 1;
		Assert.assertEquals(expected, actual);

		actual = Quicksort.partition(new int[]{3, 2, 1});
		expected = 2;
		Assert.assertEquals(expected, actual);

		actual = Quicksort.partition(new int[]{1, 2, 3});
		expected = 0;
		Assert.assertEquals(expected, actual);

		actual = Quicksort.partition(new int[]{2, 1, 3});
		expected = 1;
		Assert.assertEquals(expected, actual);

		actual = Quicksort.partition(new int[]{3, 2, 1, 4});
		expected = 2;
		Assert.assertEquals(expected, actual);
	}
}