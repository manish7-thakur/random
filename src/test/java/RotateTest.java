import org.junit.Assert;
import org.junit.Test;

public class RotateTest {
    @Test
    public void MultiElemWithEmptyStringArraySearch() {
        Assert.assertArrayEquals(new int[]{1}, Rotate.findPositionsForIter(new int[]{1}, 1));
        Assert.assertArrayEquals(new int[]{2, 1}, Rotate.findPositionsForIter(new int[]{1, 2}, 2));
        Assert.assertArrayEquals(new int[]{3, 1, 2}, Rotate.findPositionsForIter(new int[]{3, 2, 4}, 3));
        Assert.assertArrayEquals(new int[]{1, 4, 2, 3}, Rotate.findPositionsForIter(new int[]{4, 3, 2, 4}, 4));
        Assert.assertArrayEquals(new int[]{5, 6, 4, 1, 2}, Rotate.findPositionsForIter(new int[]{1, 2, 2, 3, 4, 5}, 5));
    }
}