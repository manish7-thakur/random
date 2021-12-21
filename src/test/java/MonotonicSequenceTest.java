import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.List;

public class MonotonicSequenceTest {
    @Test
    public void testLongestMonotonicSequence() {
        int[] seq = new int[]{3, 5};
        List<Integer> actual = MonotonicSequence.find(seq);
        List<Integer> expected = List.of(3);
        Assert.assertEquals(expected, actual);

        seq = new int[]{3, 5, 2};
        actual = MonotonicSequence.find(seq);
        expected = List.of(3, 5);
        Assert.assertEquals(expected, actual);

        seq = new int[]{3, 2, 5};
        actual = MonotonicSequence.find(seq);
        expected = List.of(3, 5);
        Assert.assertEquals(expected, actual);

        seq = new int[]{1, 3, 2, 5};
        actual = MonotonicSequence.find(seq);
        expected = List.of(1, 3, 5);
        Assert.assertEquals(expected, actual);

        seq = new int[]{1, 2, 3, 4, 5, 6};
        actual = MonotonicSequence.find(seq);
        expected = List.of(1, 2, 3, 4, 5);
        Assert.assertEquals(expected, actual);

        seq = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        actual = MonotonicSequence.find(seq);
        expected = List.of(10, 22, 33, 50, 60, 80);
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
