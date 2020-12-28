import org.junit.Assert;
import org.junit.Test;

public class DigitSplitterTest {
    @Test
    public void ExtractSingleDigit() {
        int[] arr = DigitSplitter.split(3);
        Assert.assertArrayEquals(new int[]{3}, arr);
    }

    @Test
    public void ExtractDoubleDigits10() {
        int[] arr = DigitSplitter.split(10);
        Assert.assertArrayEquals(new int[]{1, 0}, arr);
    }

    @Test
    public void ExtractDoubleDigits() {
        int[] arr = DigitSplitter.split(32);
        Assert.assertArrayEquals(new int[]{3, 2}, arr);
    }

    @Test
    public void ExtractTripleDigits() {
        int[] arr = DigitSplitter.split(324);
        Assert.assertArrayEquals(new int[]{3, 2, 4}, arr);
    }

    @Test
    public void ExtractTripleDigits100() {
        int[] arr = DigitSplitter.split(100);
        Assert.assertArrayEquals(new int[]{1, 0, 0}, arr);
    }
}
