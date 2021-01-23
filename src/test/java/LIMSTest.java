import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LIMSTest {
    @Test
    public void twoElemArray() {
        int[] seq = new int[]{3, 5};
        ArrayList<Integer> actual = LIMS.find(seq);
        ArrayList<Integer> expected = new ArrayList();
        expected.add(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeElemArray() {
        int[] seq = new int[]{3, 5, 2};
        ArrayList<Integer> actual = LIMS.find(seq);
        ArrayList<Integer> expected = new ArrayList();
        expected.add(3);
        expected.add(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeElemArrayWithLowMiddle() {
        int[] seq = new int[]{3, 2, 5};
        ArrayList<Integer> actual = LIMS.find(seq);
        ArrayList<Integer> expected = new ArrayList();
        expected.add(3);
        expected.add(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourElemArrayWithLowMiddle() {
        int[] seq = new int[]{1, 3, 2, 5};
        ArrayList<Integer> actual = LIMS.find(seq);
        ArrayList<Integer> expected = new ArrayList();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sixElemArrayWithLowMiddle() {
        int[] seq = new int[]{1, 2, 3, 4, 5, 6};
        ArrayList<Integer> actual = LIMS.find(seq);
        ArrayList<Integer> expected = new ArrayList();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nineElemArrayWithLowMiddle() {
        int[] seq = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        ArrayList<Integer> actual = LIMS.find(seq);
        ArrayList<Integer> expected = new ArrayList();
        expected.add(10);
        expected.add(22);
        expected.add(33);
        expected.add(50);
        expected.add(60);
        expected.add(80);
        Assert.assertEquals(expected, actual);
    }
}