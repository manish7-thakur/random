import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MissingRangeFinderTest {
    @Test
    public void emptyRanges() {
        int l = -1;
        int h = 2;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(l + "->" + h);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singleRange() {
        int l = -1;
        int h = 2;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{0}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(l + "");
        expected.add(1 + "->" + 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singleRangeSameAsLow() {
        int l = 0;
        int h = 2;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{0}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(1 + "->" + 2);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void twoRange() {
        int l = -1;
        int h = 2;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{0, 1}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(-1 + "");
        expected.add(2 + "");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoRangeSameAsLowHigh() {
        int l = 0;
        int h = 1;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{0, 1}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeRanges() {
        int l = -2;
        int h = 6;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{0, 1, 3}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(-2 + "->" + -1);
        expected.add(2 + "");
        expected.add(4 + "->" + 6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourRanges() {
        int l = 0;
        int h = 8;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{0, 2, 5, 6}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(1 + "");
        expected.add(3 + "->" + 4);
        expected.add(7 + "->" + 8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourRanges() {
        int l = 0;
        int h = 99;
        ArrayList<String> actual = MissingRangeFinder.find(new int[]{0, 1, 3, 50, 75}, l, h);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(2 + "");
        expected.add(4 + "->" + 49);
        expected.add(51 + "->" + 74);
        expected.add(76 + "->" + 99);
        Assert.assertEquals(expected, actual);
    }
}