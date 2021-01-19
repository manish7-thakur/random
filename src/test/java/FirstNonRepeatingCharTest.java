import org.junit.Assert;
import org.junit.Test;

public class FirstNonRepeatingCharTest {
    @Test
    public void emptyString() {
        int actual = FirstNonRepeatingChar.findFirst("");
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneCharString() {
        int actual = FirstNonRepeatingChar.findFirst("a");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoCharString() {
        int actual = FirstNonRepeatingChar.findFirst("ab");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeCharString() {
        int actual = FirstNonRepeatingChar.findFirst("aat");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourCharString() {
        int actual = FirstNonRepeatingChar.findFirst("tbbc");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharStringRepeating() {
        int actual = FirstNonRepeatingChar.findFirst("babab");
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharStringNonRepeating() {
        int actual = FirstNonRepeatingChar.findFirst("batca");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveCharStringNonRepeating2() {
        int actual = FirstNonRepeatingChar.findFirst("leetc");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sevenCharStringRepeating() {
        int actual = FirstNonRepeatingChar.findFirst("abctcba");
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}