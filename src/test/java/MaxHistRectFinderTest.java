import org.junit.Assert;
import org.junit.Test;

public class MaxHistRectFinderTest {
    @Test
    public void findMaxRectangleArea() {
       int actual = MaxHistRectFinder.largestRectangleArea(new int[]{1});
       int expected = 1;
       Assert.assertEquals(expected, actual);

       actual = MaxHistRectFinder.largestRectangleArea(new int[]{1, 2});
       expected = 2;
       Assert.assertEquals(expected, actual);

       actual = MaxHistRectFinder.largestRectangleArea(new int[]{1, 3});
       expected = 3;
       Assert.assertEquals(expected, actual);

       actual = MaxHistRectFinder.largestRectangleArea(new int[]{1, 1, 2});
       expected = 3;
       Assert.assertEquals(expected, actual);

       actual = MaxHistRectFinder.largestRectangleArea(new int[]{1, 1, 3, 2});
       expected = 4;
       Assert.assertEquals(expected, actual);

       actual = MaxHistRectFinder.largestRectangleArea(new int[]{2,1,5,6,2,3});
       expected = 10;
       Assert.assertEquals(expected, actual);

       actual = MaxHistRectFinder.largestRectangleArea(new int[]{6, 4, 3, 3});
       expected = 12;
       Assert.assertEquals(expected, actual);
    }
}
