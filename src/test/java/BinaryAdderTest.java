import org.junit.Assert;
import org.junit.Test;

public class BinaryAdderTest {
    @Test
    public void addSingleBit() {
        int[] a = new int[]{1};
        int[] b = new int[]{1};
        int[] actual = BinaryAdder.add(a, b);
        int[] expected = new int[]{1, 0};
        Assert.assertArrayEquals(expected, actual);

        a = new int[]{0};
        b = new int[]{1};
        actual = BinaryAdder.add(a, b);
        expected = new int[]{0, 1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addDoubleBits() {
        int[] a = new int[]{1, 0};
        int[] b = new int[]{1, 0};
        int[] actual = BinaryAdder.add(a, b);
        int[] expected = new int[]{1, 0, 0};
        Assert.assertArrayEquals(expected, actual);

        a = new int[]{1, 0};
        b = new int[]{1, 1};
        actual = BinaryAdder.add(a, b);
        expected = new int[]{1, 0, 1};
        Assert.assertArrayEquals(expected, actual);

        a = new int[]{1, 1};
        b = new int[]{1, 1};
        actual = BinaryAdder.add(a, b);
        expected = new int[]{1, 1, 0};
        Assert.assertArrayEquals(expected, actual);

        a = new int[]{0, 1};
        b = new int[]{0, 1};
        actual = BinaryAdder.add(a, b);
        expected = new int[]{0, 1, 0};
        Assert.assertArrayEquals(expected, actual);

        a = new int[]{0, 1};
        b = new int[]{1, 0};
        actual = BinaryAdder.add(a, b);
        expected = new int[]{0, 1, 1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTripleBits() {
        int[] a = new int[]{1, 0, 1};
        int[] b = new int[]{1, 0, 1};
        int[] actual = BinaryAdder.add(a, b);
        int[] expected = new int[]{1, 0, 1, 0};
        Assert.assertArrayEquals(expected, actual);

        a = new int[]{0, 1, 1};
        b = new int[]{1, 0, 1};
        actual = BinaryAdder.add(a, b);
        expected = new int[]{1, 0, 0, 0};
        Assert.assertArrayEquals(expected, actual);

        a = new int[]{1, 1, 1};
        b = new int[]{1, 1, 1};
        actual = BinaryAdder.add(a, b);
        expected = new int[]{1, 1, 1, 0};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addBinaryString() {
      String actual = BinaryAdder.add("0,1");
      String expected = "1";
      Assert.assertEquals(expected, actual);

      actual = BinaryAdder.add("00,11");
      expected = "11";
      Assert.assertEquals(expected, actual);

      actual = BinaryAdder.add("1,11");
      expected = "100";
      Assert.assertEquals(expected, actual);

      actual = BinaryAdder.add("111,11");
      expected = "1010";
      Assert.assertEquals(expected, actual);

      actual = BinaryAdder.add("111,1");
      expected = "1000";
      Assert.assertEquals(expected, actual);
    }
}
