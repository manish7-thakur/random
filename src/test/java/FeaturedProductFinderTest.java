import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FeaturedProductFinderTest {
    @Test
    public void twoItems() {
        List<String> items = Arrays.asList("redshirt", "yellowshirt");
        String actual = FeaturedProductFinder.featuredProduct(items);
        String expected = "yellowshirt";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeItems() {
        List<String> items = Arrays.asList("redshirt", "yellowshirt", "zerPants");
        String actual = FeaturedProductFinder.featuredProduct(items);
        String expected = "zerPants";
        Assert.assertEquals(expected, actual);

        items = Arrays.asList("yellowshirt", "yellowshirt", "zerPants");
        actual = FeaturedProductFinder.featuredProduct(items);
        expected = "yellowshirt";
        Assert.assertEquals(expected, actual);

        items = Arrays.asList("yellowshirt", "yellowshirt", "yellowshirt");
        actual = FeaturedProductFinder.featuredProduct(items);
        expected = "yellowshirt";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourItems() {
        List<String> items = Arrays.asList("redshirt", "yellowshirt", "whippedjeans", "orangesuit");
        String actual = FeaturedProductFinder.featuredProduct(items);
        String expected = "yellowshirt";
        Assert.assertEquals(expected, actual);

        items = Arrays.asList("yellowshirt", "yellowshirt", "whippedjeans", "whippedjeans");
        actual = FeaturedProductFinder.featuredProduct(items);
        expected = "yellowshirt";
        Assert.assertEquals(expected, actual);

        items = Arrays.asList("whippedjeans", "yellowshirt", "whippedjeans", "whippedjeans");
        actual = FeaturedProductFinder.featuredProduct(items);
        expected = "whippedjeans";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiItems() {
        List<String> items = Arrays.asList("redshirt", "yellowshirt", "pyjamas", "whippedjeans", "orangesuit",
                "whippedjeans", "blackjeans", "whippedjeans", "pyjamas", "yellowshirt", "redshirt", "pyjamas");
        String actual = FeaturedProductFinder.featuredProduct(items);
        String expected = "whippedjeans";
        Assert.assertEquals(expected, actual);
    }
}