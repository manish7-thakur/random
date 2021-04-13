import org.junit.Assert;
import org.junit.Test;

public class SelectionProcedureTest {
    @Test
    public void partitionArray() {
        int actual = SelectionProcedure.partition(new int[]{1}, 0, 0);
        int expected = 0;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.partition(new int[]{2, 1}, 0, 1);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.partition(new int[]{3, 1, 2}, 0, 2);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.partition(new int[]{3, 4, 1, 2}, 0, 3);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.partition(new int[]{5, 4, 1, 2}, 0, 3);
        expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findKthSmallest() {
        int actual = SelectionProcedure.findKthSmallest(new int[]{1}, 0);
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.findKthSmallest(new int[]{1, 2}, 1);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.findKthSmallest(new int[]{3, 1, 2}, 1);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.findKthSmallest(new int[]{3, 4, 1, 2}, 3);
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.findKthSmallest(new int[]{3, 4, 1, 2}, 0);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = SelectionProcedure.findKthSmallest(new int[]{332, 432, 23, 482, 48, 120, 392, 392, 3, 43, 24, 211, 222}, 5);
        expected = 120;
        Assert.assertEquals(expected, actual);
    }
}