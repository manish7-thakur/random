import org.junit.Assert;
import org.junit.Test;

public class GCDCalculatorTest {
    @Test
    public void gcdWithZero() {
        int actual = GCDCalculator.euclidCalc(28, 0);
        int expected = 28;
        Assert.assertEquals(actual, expected);
        actual = GCDCalculator.euclidCalc(0, 23);
        expected = 23;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void gcdWithNonZero() {
        int actual = GCDCalculator.euclidCalc(24, 30);
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }
}