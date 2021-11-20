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
        expected = List.of(List.of(-1,0,1), List.of(-1, 2, -1));
        Assert.assertEquals(expected, actual);

        actual = TripletSum.threeSum(new int[]{-1, 23, 3, 2, -4, 2, -34, 20, 4, 2, -3, 2, 34, 72, -38, 3, 3, -27, 2, -3, 48, 3, -30, 1, 2, -1, -4});
        expected = List.of(List.of(-1, 2, -1), List.of(-1, 4, -3), List.of(23, 4, -27), List.of(3, -4, 1), List.of(2, -4, 2), List.of(2, -3, 1), List.of(-4, 34, -30), List.of(-34, 72, -38), List.of(4, 34, -38));
        Assert.assertEquals(expected, actual);
    }
}
