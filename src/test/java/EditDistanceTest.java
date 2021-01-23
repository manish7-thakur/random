import org.junit.Assert;
import org.junit.Test;

/**
 * cost
 * copy(c) -> 1
 * replace(r) -> 1
 * insert(i) -> 1
 * delete(d) -> 1
 * twiddle(t) -> 1
 */

public class EditDistanceTest {
    @Test
    public void singleCharStringEmptySource() {
        int actual = EditDistance.find("", "n", -1, 0);
        int expected = 1;//insert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singleCharStringTargetEmpty() {
        int actual = EditDistance.find("a", "", 0, -1);
        int expected = 1;//kill
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singleCharIdenticalString() {
        int actual = EditDistance.find("a", "a", 0, 0);
        int expected = 1; //copy
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singleCharNonIdenticalString() {
        int actual = EditDistance.find("a", "b", 0, 0);
        int expected = 1; //Min(replace, delete + insert)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharNonIdenticalString() {
        int actual = EditDistance.find("ab", "bc", 1, 1);
        int expected = 2; //Min(replace + replace, insert + copy + delete)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharReversedString() {
        int actual = EditDistance.find("ab", "ba", 1, 1);
        int expected = 1; //twiddle
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharSTripleCharT() {
        int actual = EditDistance.find("ab", "bac", 1, 2);
        int expected = 2; //insert + twiddle
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tripleCharSTripleCharT() {
        int actual = EditDistance.find("abc", "bac", 2, 2);
        int expected = 2; //copy + twiddle
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourCharSTripleCharT() {
        int actual = EditDistance.find("abcd", "bac", 3, 2);
        int expected = 3; //delete + copy + twiddle
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharSFiveCharT() {
        int actual = EditDistance.find("abcde", "bacef", 4, 4);
        int expected = 4; //delete + copy + twiddle
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharStwoCharT() {
        int actual = EditDistance.find("cdeab", "ba", 4, 1);
        int expected = 2; // twiddle + kill
        Assert.assertEquals(expected, actual);
    }
}