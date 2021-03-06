import org.junit.Assert;
import org.junit.Test;

public class KSetWithSumTFinderTest {
    @Test
    public void emptyArray() {
        boolean actual = KSetWithSumTFinder.isPresentRec(new double[]{}, 5.0, 3);
        Assert.assertFalse(actual);
    }

    @Test
    public void singleElemArray() {
        boolean actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0}, 2.0, 1);
        Assert.assertTrue(actual);
    }

    @Test
    public void doubleElemArray() {
        boolean actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 1.0}, 1.0, 1);
        Assert.assertTrue(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 1.0}, 3.0, 2);
        Assert.assertTrue(actual);
    }

    @Test
    public void tripleElemArray() {
        boolean actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 1.0, 5.0}, 2.0, 2);
        Assert.assertFalse(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 1.0, 5.0}, 7.0, 2);
        Assert.assertTrue(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 1.0, 5.0}, 8.0, 2);
        Assert.assertFalse(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 1.0, 5.0}, 8.0, 3);
        Assert.assertTrue(actual);
    }

    @Test
    public void fourElemArray() {
        boolean actual = KSetWithSumTFinder.isPresentRec(new double[]{3.0, 2.0, 1.0, 5.0}, 3.0, 2);
        Assert.assertTrue(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{3.0, 2.0, 1.0, 5.0}, 6.0, 3);
        Assert.assertTrue(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 3.0, 1.0, 5.0}, 9.0, 2);
        Assert.assertFalse(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 3.0, 1.0, 5.0}, 11.0, 4);
        Assert.assertTrue(actual);
        actual = KSetWithSumTFinder.isPresentRec(new double[]{2.0, 3.0, 1.0, 5.0}, 9.0, 3);
        Assert.assertTrue(actual);
    }

    @Test
    public void countKSetElemsWithSumT() {
        int actual = KSetWithSumTFinder.countWithSumLessOrEqualRec(new double[]{3.0, 2.0, 1.0, 5.0}, 3.0, 3);
        int expected = 0;
        Assert.assertEquals(expected, actual);

        actual = KSetWithSumTFinder.countWithSumLessOrEqualRec(new double[]{3.0, 2.0, 1.0, 5.0}, 6.0, 3);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = KSetWithSumTFinder.countWithSumLessOrEqualRec(new double[]{3.0, 2.0, 1.0, 3.0}, 6.0, 3);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = KSetWithSumTFinder.countWithSumLessOrEqualRec(new double[]{3.0, 2.0, 1.0, 3.0, 5.0, 4.0, 6.0}, 11.0, 4);
        expected = 5;
        Assert.assertEquals(expected, actual);

        actual = KSetWithSumTFinder.countWithSumLessOrEqualRec(new double[]{3.0, 2.0, 1.0, 3.0, 5.0, 4.0, 6.0, 7.0}, 12.0, 5);
        expected = 0;
        Assert.assertEquals(expected, actual);

        actual = KSetWithSumTFinder.countWithSumLessOrEqualRec(new double[]{3.0, 2.0, 1.0, 3.0, 5.0, 4.0, 6.0, 7.0}, 12.0, 3);
        expected = 33;
        Assert.assertEquals(expected, actual);
    }
}