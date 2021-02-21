import java.util.*;
import org.junit.*;

public class FeaturedProductFinderTest {
	@Test
	public void twoItems() {
		List<String> items = Arrays.asList(new String[]{"redshirt", "yellowshirt"});
		String actual = FeaturedProductFinder.featuredProduct(items);
		String expected = "yellowshirt";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void threeItems() {
		List<String> items = Arrays.asList(new String[]{"redshirt", "yellowshirt", "zerPants"});
		String actual = FeaturedProductFinder.featuredProduct(items);
		String expected = "zerPants";
		Assert.assertEquals(expected, actual);

		items = Arrays.asList(new String[]{"yellowshirt", "yellowshirt", "zerPants"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "yellowshirt";
		Assert.assertEquals(expected, actual);

		items = Arrays.asList(new String[]{"yellowshirt", "yellowshirt", "yellowshirt"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "yellowshirt";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void fourItems() {
		List<String> items = Arrays.asList(new String[]{"redshirt", "yellowshirt", "whippedjeans", "orangesuit"});
		String actual = FeaturedProductFinder.featuredProduct(items);
		String expected = "yellowshirt";
		Assert.assertEquals(expected, actual);

		items = Arrays.asList(new String[]{"yellowshirt", "yellowshirt", "whippedjeans", "whippedjeans"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "yellowshirt";
		Assert.assertEquals(expected, actual);

		items = Arrays.asList(new String[]{"whippedjeans", "yellowshirt", "whippedjeans", "whippedjeans"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "whippedjeans";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void multiItems() {
		List<String> items = Arrays.asList(new String[]{"redshirt", "yellowshirt", "pyjamas", "whippedjeans", "orangesuit",
			"whippedjeans", "blackjeans", "whippedjeans", "pyjamas", "yellowshirt", "redshirt", "pyjamas"});
		String actual = FeaturedProductFinder.featuredProduct(items);
		String expected = "whippedjeans";
		Assert.assertEquals(expected, actual);
	}
}