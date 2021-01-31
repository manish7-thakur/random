import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class RodCutterTest {
    @Test
    public void zeroLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 0);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void zeroLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 0);
        ArrayList expected = new ArrayList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 1);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 1);
        ArrayList expected = new ArrayList();
        expected.add(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 2);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 2);
        ArrayList expected = new ArrayList();
        expected.add(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 3);
        int expected = 8;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void threeLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 3);
        ArrayList expected = new ArrayList();
        expected.add(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 4);
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 4);
        ArrayList expected = new ArrayList();
        expected.add(2);
        expected.add(2);
        Assert.assertEquals(expected, actual);
    }

        @Test
    public void sevenLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 7);
        int expected = 18; 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sevenLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 7);
        ArrayList expected = new ArrayList();
        expected.add(2);
        expected.add(2);
        expected.add(3); // also 1,6
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tenLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 10);
        int expected = 30;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tenLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30}, 10);
        ArrayList expected = new ArrayList();
        expected.add(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void thirteenLengthRod() {
        int actual = RodCutter.maxProfit(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 31, 32, 33}, 13);
        int expected = 38;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void thirteenLengthRodSoln() {
        ArrayList actual = RodCutter.maxProfitSoln(new int[]{0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 31, 32, 33}, 13);
        ArrayList expected = new ArrayList();
        expected.add(3);
        expected.add(10);
        Assert.assertEquals(expected, actual);
    }
}