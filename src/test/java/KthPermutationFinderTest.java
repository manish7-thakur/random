import org.junit.Assert;
import org.junit.Test;

public class KthPermutationFinderTest {
    @Test
    public void findKthPermutationFor() {
        String actual = KthPermutationFinder.getPermutation(1, 1);
        String expected = "1";
        Assert.assertEquals(expected, actual);

        actual = KthPermutationFinder.getPermutation(2, 1);
        expected = "12";
        Assert.assertEquals(expected, actual);

        actual = KthPermutationFinder.getPermutation(2, 2);
        expected = "21";
        Assert.assertEquals(expected, actual);

        actual = KthPermutationFinder.getPermutation(3, 1);
        expected = "123";
        Assert.assertEquals(expected, actual);

        actual = KthPermutationFinder.getPermutation(3, 3);
        expected = "213";
        Assert.assertEquals(expected, actual);

        actual = KthPermutationFinder.getPermutation(3, 6);
        expected = "321";
        Assert.assertEquals(expected, actual);

        actual = KthPermutationFinder.getPermutation(4, 9);
        expected = "2314";
        Assert.assertEquals(expected, actual);
    }
}
