import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.List;

public class MonotonicSequenceTest {
    @Test
    public void testLongestMonotonicSequence() {
        int[] seq = new int[]{5, 4};
        int actual = MonotonicSequence.findRec(seq);
        int expected = 1;
        Assert.assertEquals(expected, actual);

        seq = new int[]{4, 5};
        actual = MonotonicSequence.findRec(seq);
        expected = 2;
        Assert.assertEquals(expected, actual);

        seq = new int[]{2, 3, 5};
        actual = MonotonicSequence.findRec(seq);
        expected = 3;
        Assert.assertEquals(expected, actual);

        seq = new int[]{3, 2, 5, 6};
        actual = MonotonicSequence.findRec(seq);
        expected = 3;
        Assert.assertEquals(expected, actual);

        seq = new int[]{1, 3, 2, 3, 5};
        actual = MonotonicSequence.findRec(seq);
        expected = 4;
        Assert.assertEquals(expected, actual);

        seq = new int[]{2, 2, 1, 2, 5, 3, 4, 6};
        actual = MonotonicSequence.findRec(seq);
        expected = 5;
        Assert.assertEquals(expected, actual);

        seq = new int[]{10, 33, 9, 21, 22, 50, 41, 60, 80};
        actual = MonotonicSequence.findRec(seq);
        expected = 6;
        Assert.assertEquals(expected, actual);

        seq = new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        actual = MonotonicSequence.findRec(seq);
        expected = 6;
        Assert.assertEquals(expected, actual);

        seq = new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15, 64, 26, 28, 46, 53, 37, 83, 85, 34, 84, 160, 43, 283, 73, 367, 46,
           92, 401, 33, 47,27, 93, 548, 473, 496, 466, 744, 822, 75, 74, 583, 483, 49, 59, 59, 96, 36, 475, 73, 64, 36, 93, 27, 6, 288, 64, 73, 83, 38, 3462,
           85, 384, 583,48, 83,39, 462, 466, 636, 473, 58, 374, 73, 39, 362, 468, 4638, 2738, 4663};
        actual = MonotonicSequence.findRec(seq);
        expected = 24;
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
