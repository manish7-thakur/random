import org.junit.Assert;
import org.junit.Test;

public class NumberValidatorTest {
    @Test
    public void validateNumber() {
       boolean actual = NumberValidator.isNumber("");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber(".");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber("..");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber("1");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber("+");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber("-");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber("+.");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber("+-1.");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber("+1");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber("-1");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber("+-1");
       Assert.assertFalse(actual);

       actual = NumberValidator.isNumber("+1.");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber(".2");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber("+.2");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber("-.2");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber("+2.0");
       Assert.assertTrue(actual);

       actual = NumberValidator.isNumber("+2.0.");
       Assert.assertFalse(actual);

      actual = NumberValidator.isNumber("2e10");
      Assert.assertTrue(actual);

      actual = NumberValidator.isNumber("2e1e0");
      Assert.assertFalse(actual);

      actual = NumberValidator.isNumber("4e+");
      Assert.assertFalse(actual);

      actual = NumberValidator.isNumber("2e1.0");
      Assert.assertFalse(actual);

      actual = NumberValidator.isNumber("-2e+1.0");
      Assert.assertFalse(actual);

      actual = NumberValidator.isNumber("-2E+1");
      Assert.assertTrue(actual);

      actual = NumberValidator.isNumber("e3");
      Assert.assertFalse(actual);

      actual = NumberValidator.isNumber("-123.456e789");
      Assert.assertTrue(actual);

      actual = NumberValidator.isNumber("7e69e");
       Assert.assertFalse(actual);
    }
}
