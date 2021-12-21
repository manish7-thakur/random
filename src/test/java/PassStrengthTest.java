import org.junit.Assert;
import org.junit.Test;

public class PassStrengthTest {
    @Test
    public void testStreagth() {
      int actual = PassStrength.findsStrength("GOOD");
      Assert.assertEquals(16, actual);

      actual = PassStrength.findsStrength("GOODO");
      Assert.assertEquals(26, actual);

      actual = PassStrength.findsStrength("TEST");
      Assert.assertEquals(19, actual);
    }
}
