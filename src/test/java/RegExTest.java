import org.junit.Assert;
import org.junit.Test;

public class RegExTest {
    @Test
    public void matchEmptyString() {
        boolean actual = RegEx.matches("", "", -1, -1);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringSingleCharNoWildCard() {
        boolean actual = RegEx.matches("a", "a", 0, 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringSingleCharWildCard() {
        boolean actual = RegEx.matches("a", "a*", 0, 1);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringDoubleCharWildCard() {
        boolean actual = RegEx.matches("ab", "a*", 1, 1);
        Assert.assertFalse(actual);
    }

    @Test
    public void matchStringTripleCharWildCard() {
        boolean actual = RegEx.matches("acb", "a*b", 2, 2);
        Assert.assertFalse(actual);
    }

    @Test
    public void matchStringTripleCharWildCardOnlyDot() {
        boolean actual = RegEx.matches("bcy", "b.y", 2, 2);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringFourCharWildCard() {
        boolean actual = RegEx.matches("bcdy", "b.*y", 3, 3);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringFiveCharWildCard() {
        boolean actual = RegEx.matches("bcdy", "a*b.*y", 3, 5);
        Assert.assertTrue(actual);
        actual = RegEx.matches("ablmy", "a*b.*y", 4, 5);
        Assert.assertTrue(actual);
        actual = RegEx.matches("ay", "a*b.*y", 1, 5);
        Assert.assertFalse(actual);
        actual = RegEx.matches("ab", "a*b.*y", 1, 5);
        Assert.assertFalse(actual);
    }

    @Test
    public void matchStringSingleCharZeroOrOneOcc() {
        boolean actual = RegEx.matches("", "y?", -1, 1);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringDoubleCharZeroOrOneOcc() {
        boolean actual = RegEx.matches("y", "y?", 0, 1);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringCharTriplePatternZeroOrOneOcc() {
        boolean actual = RegEx.matches("a", "ay?", 0, 2);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringCharFourCharPatternZeroOrOneOcc() {
        boolean actual = RegEx.matches("a", "ay?", 0, 2);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringSingleCharOneOrMoreOcc() {
        boolean actual = RegEx.matches("", "b+", -1, 1);
        Assert.assertFalse(actual);
    }

    @Test
    public void matchStringDoubleCharOneOrMoreOcc() {
        boolean actual = RegEx.matches("b", "b+", 0, 1);
        Assert.assertTrue(actual);
    }

    @Test
    public void matchStringDoubleCharPatternOneOrMoreOcc() {
        boolean actual = RegEx.matches("bb", "b+", 1, 1);
        Assert.assertTrue(actual);
        actual = RegEx.matches("bb", "bb+", 1, 2);
        actual = RegEx.matches("bbb", "b+", 2, 1);
        Assert.assertTrue(actual);
        Assert.assertTrue(actual);
        actual = RegEx.matches("b", "bb+", 0, 2);
        Assert.assertFalse(actual);
        actual = RegEx.matches("ab", "ab+", 0, 2);
        Assert.assertFalse(actual);
    }
}