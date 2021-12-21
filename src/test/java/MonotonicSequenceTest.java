import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.List;

public class MonotonicSequenceTest {
    @Test
    public void testLongestMonotonicSequence() {
        int[] seq = new int[]{5, 4};
        int actual = MonotonicSequence.find(seq);
        int expected = 1;
        Assert.assertEquals(expected, actual);

        seq = new int[]{4, 5};
        actual = MonotonicSequence.find(seq);
        expected = 2;
        Assert.assertEquals(expected, actual);

        seq = new int[]{2, 3, 5};
        actual = MonotonicSequence.find(seq);
        expected = 3;
        Assert.assertEquals(expected, actual);

        seq = new int[]{3, 2, 5, 6};
        actual = MonotonicSequence.find(seq);
        expected = 3;
        Assert.assertEquals(expected, actual);

        seq = new int[]{1, 3, 2, 3, 5};
        actual = MonotonicSequence.find(seq);
        expected = 4;
        Assert.assertEquals(expected, actual);

        seq = new int[]{2, 2, 1, 2, 5, 3, 4, 6};
        actual = MonotonicSequence.find(seq);
        expected = 5;
        Assert.assertEquals(expected, actual);

        seq = new int[]{10, 33, 9, 21, 22, 50, 41, 60, 80};
        actual = MonotonicSequence.find(seq);
        expected = 6;
        Assert.assertEquals(expected, actual);

        seq = new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        actual = MonotonicSequence.find(seq);
        expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinCharFlips() {
      int actual = MonotonicSequence.minFlipsMonoIncr("0");
      int expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("10");
      expected = 1;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("11");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("00");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("0011");
      expected = 0;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("1100");
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("010101");
      expected = 2;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("0101010000");
      expected = 3;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("11001011011");
      expected = 4;
      Assert.assertEquals(expected, actual);

      actual = MonotonicSequence.minFlipsMonoIncr("100110");
      expected = 2;
      Assert.assertEquals(expected, actual);
    }
}
