import org.junit.Assert;
import org.junit.Test;


public class PassStrengthTest {
    @Test
    public void testStreagth() {
        int actual = PassStrength.findPasswordStrength("good");
        Assert.assertEquals(16, actual);

        actual = PassStrength.findPasswordStrength("test");
        Assert.assertEquals(19, actual);

    }

}