import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
    @Test
    public void ReverseEmptyArray() {
        int[] arr = new int[]{1};
        RotateArray.reverse(arr, 0, 0);
        Assert.assertArrayEquals("empty array comparison failed", arr, arr);
    }

    @Test
    public void ReverseTwoElemsArray() {
        int[] arr = new int[]{1, 2};
        RotateArray.reverse(arr, 0, 1);
        Assert.assertArrayEquals("two elem array comparison failed", new int[]{2, 1}, arr);
    }
 
    @Test
    public void ReverseThreeElemsArray() {
        int[] arr = new int[]{1, 2, 3};
        RotateArray.reverse(arr, 0, 2);
        Assert.assertArrayEquals("three elem array comparison failed", new int[]{3, 2, 1}, arr);
    }

    @Test
    public void ReverseFourElemsArray() {
        int[] arr = new int[]{1, 2, 3, 4};
        RotateArray.reverse(arr, 0, 3);
        Assert.assertArrayEquals("three elem array comparison failed", new int[]{4, 3, 2, 1}, arr);
    }
    
}