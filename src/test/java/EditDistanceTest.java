import org.junit.Assert;
import org.junit.Test;
import java.util.*;

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

    @Test
    public void opsInsert() {
        char[][] path = new char[][]{{'i'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 0, 0, b);
        String expected = "ik";
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void opsDoubleCopy() {
        char[][] path = new char[][]{
            {'c', 'd'},
            {'k', 'c'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "cc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsDeleteCopy() {
        char[][] path = new char[][]{
            {'r', 'c'},
            {'k', 'd'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "dc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsReplaceCopy() {
        char[][] path = new char[][]{
            {'c', 'c'},
            {'k', 'r'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "rc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsTwiddleCopy() {
        char[][] path = new char[][]{
            {'c', 'c', 'd'},
            {'k', 'r', 'i'},
            {'k', 'i', 't'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 2, 2, b);
        String expected = "tc";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void opsDoubleInsertKill() {
        char[][] path = new char[][]{
            {'c', 'c'},
            {'i', 'i'}};
        StringBuilder b = new StringBuilder();
        String actual = EditDistance.getOps(path, 1, 1, b);
        String expected = "iik";
        Assert.assertEquals(expected, actual);
    }
}