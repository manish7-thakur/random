import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
    @Test
    public void RotateEmptyArray() {
        int[] arr = new int[]{1};
        RotateArray.rotate(arr, 0, 0);
        Assert.assertArrayEquals("empty array comparison failed", arr, arr);
    }

    @Test
    public void RotateTwoElemsArray() {
        int[] arr = new int[]{1, 2};
        RotateArray.rotate(arr, 0, 1);
        Assert.assertArrayEquals("two elem array comparison failed", new int[]{2, 1}, arr);
    }
}