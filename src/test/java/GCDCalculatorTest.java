import org.junit.Assert;
import org.junit.Test;

public class GCDCalculatorTest {
    @Test
    public void gcdWithZero() {
        int actual = GCDCalculator.euclidCalc(28, 0);
        int expected = 28;
        Assert.assertEquals(expected, actual);
        actual = GCDCalculator.euclidCalc(0, 23);
        expected = 23;
        Assert.assertEquals(expected, actual);
        actual = GCDCalculator.euclidCalcIter(28, 0);
        expected = 28;
        Assert.assertEquals(expected, actual);
        actual = GCDCalculator.euclidCalcIter(0, 23);
        expected = 23;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdWithNonZero() {
        int actual = GCDCalculator.euclidCalc(24, 30);
        int expected = 6;
        Assert.assertEquals(expected, actual);
        actual = GCDCalculator.euclidCalcIter(24, 30);
        expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euclidCoefficientWithZero() {
        GCDCalculator.Triplets actual = GCDCalculator.euclidCoefficients(28, 0);
        GCDCalculator.Triplets expected = new GCDCalculator.Triplets(28, 1, 0);
        Assert.assertEquals(expected, actual);
        actual = GCDCalculator.euclidCoefficients(0, 28);
        expected = new GCDCalculator.Triplets(28, 0, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euclidCoefficientWithNonZero() {
        GCDCalculator.Triplets actual = GCDCalculator.euclidCoefficients(99, 78);
        GCDCalculator.Triplets expected = new GCDCalculator.Triplets(3, -11, 14);
        Assert.assertEquals(expected, actual);
    }
}