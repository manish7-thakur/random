import org.junit.*;

public class TripletSumTest {
    @Test
    public void EmptyArrayTest() {
        int actual = TripletSum.countTriplets(new int[]{}, 9);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ArrayWithThreeElemTest() {
        int actual = TripletSum.countTriplets(new int[]{2, 3, 1}, 9);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

   @Test
    public void ArrayWithFourElemTest() {
        int actual = TripletSum.countTriplets(new int[]{-1, 5, 4, 1}, 6);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}