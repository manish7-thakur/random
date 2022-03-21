import org.junit.Assert;
import org.junit.Test;

public class VikiTest {
    @Test
    public void findValueWithBothPositiveAndNegative() {
        int actual = Viki.findNegativeAndPositive(new int[]{-1, 1});
        int expected = 1;
        Assert.assertEquals(expected, actual);

        actual = Viki.findNegativeAndPositive(new int[]{1, -1});
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = Viki.findNegativeAndPositive(new int[]{1, 2, 3, -2, 1});
        expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideChainThreePiecesWithMinCost() {
        int actual = Viki.breakChain(new int[]{5, 2, 4, 6, 3, 7});
        int expected = 5;
        Assert.assertEquals(expected, actual);

        actual = Viki.breakChain(new int[]{5, 2, 3, 6, 4, 7});
        expected = 6;
        Assert.assertEquals(expected, actual);

        actual = Viki.breakChain(new int[]{5, 1, 2, 3, 4, 7});
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = Viki.breakChain(new int[]{5, 1, 1, 1, 1, 7});
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = Viki.breakChain(new int[]{5, 1, 2, 3, 4, 7});
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = Viki.breakChain(new int[]{5, 4, 3, 2, 1, 7});
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = Viki.breakChain(new int[]{5, 1, 2, 2, 1, 7});
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = Viki.breakChain(new int[]{5, 2, 1, 2, 3, 7});
        expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMaxFamilySeatingAmongNRowsWithReservedSeats() {

        int actual = Viki.seatFamily(1, "");
        int expected = 2;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(1, "1B 1J");
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(1, "1B");
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(1, "1B 1C 1H 1J");
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "");
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "1C");
        expected = 3;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "1C 2F");
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "1B 2J");
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "1A 2K");
        expected = 4;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(1, "1E 1F");
        expected = 0;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "1E 1F");
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "1E 1F 2E 2F");
        expected = 0;
        Assert.assertEquals(expected, actual);

        actual = Viki.seatFamily(2, "1E 1F 2J");
        expected = 1;
        Assert.assertEquals(expected, actual);

    }
}
