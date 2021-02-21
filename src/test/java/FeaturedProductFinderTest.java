import java.util.*;
import org.junit.*;

public class FeaturedProductFinderTest {
	@Test
	public void twoItems() {
		List<String> items = Arrays.asList(new String[]{"redshirt", "yellowshirt"});
		String actual = FeaturedProductFinder.featuredProduct(items);
		String expected = "yellowshirt";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void threeItems() {
		List<String> items = Arrays.asList(new String[]{"redshirt", "yellowshirt", "zerPants"});
		String actual = FeaturedProductFinder.featuredProduct(items);
		String expected = "zerPants";
		Assert.assertEquals(actual, expected);

		items = Arrays.asList(new String[]{"yellowshirt", "yellowshirt", "zerPants"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "yellowshirt";
		Assert.assertEquals(actual, expected);

		items = Arrays.asList(new String[]{"yellowshirt", "yellowshirt", "yellowshirt"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "yellowshirt";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void fourItems() {
		List<String> items = Arrays.asList(new String[]{"redshirt", "yellowshirt", "whippedjeans", "orangesuit"});
		String actual = FeaturedProductFinder.featuredProduct(items);
		String expected = "yellowshirt";
		Assert.assertEquals(actual, expected);

		items = Arrays.asList(new String[]{"yellowshirt", "yellowshirt", "whippedjeans", "whippedjeans"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "yellowshirt";
		Assert.assertEquals(actual, expected);

		items = Arrays.asList(new String[]{"whippedjeans", "yellowshirt", "whippedjeans", "whippedjeans"});
		actual = FeaturedProductFinder.featuredProduct(items);
		expected = "whippedjeans";
		Assert.assertEquals(actual, expected);
	}
}