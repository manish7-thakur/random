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

	@Test
	public void sortArray() {
		int[] actual = new int[]{1};
		Quicksort.sort(actual, 0, 0);
		int[] expected = new int[]{1};
		Assert.assertArrayEquals(expected, actual);

		actual = new int[]{2, 1};
		Quicksort.sort(actual, 0, 1);
		expected = new int[]{1, 2};
		Assert.assertArrayEquals(expected, actual);

		actual = new int[]{2, 1, 3};
		Quicksort.sort(actual, 0, 2);
		expected = new int[]{1, 2, 3};
		Assert.assertArrayEquals(expected, actual);

		actual = new int[]{4, 2, 1, 3};
		Quicksort.sort(actual, 0, 3);
		expected = new int[]{1, 2, 3, 4};
		Assert.assertArrayEquals(expected, actual);
	}
}