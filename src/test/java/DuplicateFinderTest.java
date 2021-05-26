import org.junit.Assert;
import org.junit.Test;

public class DuplicateFinderTest {
    @Test
    public void findDuplicate() {
        int actual = DuplicateFinder.find(new int[]{1, 1});
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = DuplicateFinder.find(new int[]{2, 1, 2});
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = DuplicateFinder.find(new int[]{3, 1, 2, 3});
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = DuplicateFinder.find(new int[]{1, 2, 4, 3, 1});
        expected = 1;
        Assert.assertEquals(expected, actual);
    }
}