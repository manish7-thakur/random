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
        int actual = FirstNonRepeatingChar.findFirst("aac");
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fourCharString() {
        int actual = FirstNonRepeatingChar.findFirst("abac");
        int expected = 1;
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
        int actual = FirstNonRepeatingChar.findFirst("babca");
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}