import org.junit.*;

public class MinMaxFinderTest {
	@Test
	public void findMinMax() {
		MinMaxFinder.Pair actual = MinMaxFinder.find(new int[]{1});
		MinMaxFinder.Pair expected = new MinMaxFinder.Pair(1,1);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{1, 2});
		expected = new MinMaxFinder.Pair(1,2);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{2, 1});
		expected = new MinMaxFinder.Pair(1,2);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{2, 3, 1});
		expected = new MinMaxFinder.Pair(1,3);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{1, 2, 3});
		expected = new MinMaxFinder.Pair(1,3);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{1, 2, 3, 4});
		expected = new MinMaxFinder.Pair(1,4);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{4, 1, 2, 2});
		expected = new MinMaxFinder.Pair(1,4);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{4, 1, 2, 5, 6});
		expected = new MinMaxFinder.Pair(1,6);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{4, -1, 2, 5, 6});
		expected = new MinMaxFinder.Pair(-1,6);
		Assert.assertEquals(expected, actual);

		actual = MinMaxFinder.find(new int[]{4, -1, 2, 5, -23,83,274,925,34,37,-26, 6});
		expected = new MinMaxFinder.Pair(-26,925);
		Assert.assertEquals(expected, actual);
	}
}