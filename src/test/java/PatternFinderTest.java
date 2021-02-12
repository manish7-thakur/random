import org.junit.Assert;
import org.junit.Test;

public class PatternFinderTest {
    @Test
    public void findPatternEmptyText() {
        int actual = PatternFinder.find("", "a");
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternSingleCharText() {
        int actual = PatternFinder.find("a", "a");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternDoubleCharText() {
        int actual = PatternFinder.find("ab", "b");
        int expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("ab", "ab");
        expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternTripleCharText() {
        int actual = PatternFinder.find("abc", "c");
        int expected = 2;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("cab", "ab");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("abc", "ab");
        expected = 0;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("abc", "ac");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("aac", "ac");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("aaa", "ac");
        expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternFourCharText() {
        int actual = PatternFinder.find("abcd", "d");
        int expected = 3;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("cdab", "ab");
        expected = 2;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("abdc", "acb");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("adbc", "db");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("adabc", "db");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("dddbc", "db");
        expected = 2;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.find("dbdbc", "dbc");
        expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternFiveCharText() {
        int actual = PatternFinder.find("ababe", "abe");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternMultiCharText() {
        int actual = PatternFinder.find("abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392abd@htr(kyus%#392j", "abd@htr(kyus%#392j");
        int expected = 340;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternWithGapThreeCharText() {
        int actual = PatternFinder.findWithGap("abc", "a*b");
        int expected = 0;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("abc", "a*c");
        expected = 0;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("abc", "bc");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("abc", "b*c");
        expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternWithGapFourCharText() {
        int actual = PatternFinder.findWithGap("abft", "a*t");
        int expected = 0;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("abhs", "b*h");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("afgt", "f*t");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("afff", "f*f");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("afff", "f*c");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("afdc", "d*c");
        expected = 2;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("afdc", "d*cc");
        expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternWithGapFiveCharText() {
        int actual = PatternFinder.findWithGap("aburg", "a*u*g");
        int expected = 0;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("uaurg", "a*u*g");
        expected = 1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("uaurg", "a*ug");
        expected = -1;
        Assert.assertEquals(expected, actual);
        actual = PatternFinder.findWithGap("7owjx", "7*ix");
        expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPatternWithGapMultiCharText() {
        int actual = PatternFinder.findWithGap("cabccbacbacab", "ab*ba*c");
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}