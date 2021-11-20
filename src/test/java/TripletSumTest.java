import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class TripletSumTest {
    @Test
    public void testCountOfTriplets() {
        int actual = TripletSum.countTriplets(new int[]{}, 9);
        int expected = 0;
        Assert.assertEquals(expected, actual);

        actual = TripletSum.countTriplets(new int[]{2, 3, 1}, 9);
        expected = 1;
        Assert.assertEquals(expected, actual);

        actual = TripletSum.countTriplets(new int[]{-1, 5, 4, 1}, 6);
        expected = 2;
        Assert.assertEquals(expected, actual);

        actual = TripletSum.countTriplets(new int[]{-2, 0, 1, 3}, 2);
        expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testlistUniqueTriplets() {
        List<List<Integer>> actual = TripletSum.threeSum(new int[]{});
        Assert.assertTrue(actual.isEmpty());

        actual = TripletSum.threeSum(new int[]{-1, 0, 1});
        List<List<Integer>> expected = List.of(List.of(-1, 0, 1));
        Assert.assertEquals(expected, actual);

        actual = TripletSum.threeSum(new int[]{-1,0,1,2,-1,-4});
        expected = List.of(List.of(-1,0,1), List.of(-1,-1,2));
        Assert.assertEquals(expected, actual);

        actual = TripletSum.threeSum(new int[]{-1, 23, 3, 2, -4, 2, -34, 20, 4, 2, -3, 2, 34, 72, -38, 3, 3, -27, 2, -3, 48, 3, -30, 1, 2, -1, -4});
        expected = List.of(List.of(-1, -1, 2), List.of(-3, -1, 4), List.of(-27, 4, 23), List.of(-4, 1, 3), List.of(-4, 2, 2), List.of(-3, 1, 2), List.of(-30, -4, 34), List.of(-38, -34, 72), List.of(-38, 4, 34));
        Assert.assertEquals(expected, actual);
    }
}
