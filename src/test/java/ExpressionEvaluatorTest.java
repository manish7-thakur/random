import org.junit.*;

public class ExpressionEvaluatorTest {
  @Test
  public void evaluateStringExp() {
    double actual = ExpressionEvaluator.evaluate("1+1");
    double expected = 2;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("1-2");
    expected = -1;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("3-2+1");
    expected = 2;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("43-34-12");
    expected = -3;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("23-2+1-42+32");
    expected = 12;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("23*321");
    expected = 7383;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("11*4-20");
    expected = 24;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("12/4-123");
    expected = -120;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("11+22/2");
    expected = 22;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("54*44/4");
    expected = 594;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("367/35*24");
    expected = 251.65;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("35*24/367");
    expected = 2.28;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("54*44-4*453-367/35*24+34");
    expected = 346.32;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("54*44-4*453-367/35*24+34-572*322/34-25+28");
    expected = -5067.83;
    Assert.assertEquals(expected, actual, 0.5);
  }
  @Test
  public void testBasicWithAdditionAndSubstraction() {
    int actual = ExpressionEvaluator.calculate("-1");
    int expected = -1;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate("1-1");
    expected = 0;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate("1-1-2");
    expected = -2;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate("-11+1-2");
    expected = -12;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate("-1341+3451-5232+4732");
    expected = 1610;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate("-1+ 31-2+ 4");
    expected = 32;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate("-13 ");
    expected = -13;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate(" -14");
    expected = -14;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate(" -144 ");
    expected = -144;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.calculate(" -11 +31 -22+ 40 ");
    expected = 38;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testResolveBrackets() {
    int actual = ExpressionEvaluator.resolveBrackets("(1 + 2)");
    int expected = 3;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.resolveBrackets("-(1)");
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.resolveBrackets("-1 + 2");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.resolveBrackets("(-10 + 20)+ 1");
    expected = 11;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.resolveBrackets("-(-10 + 20)");
    expected = -10;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.resolveBrackets("-(-10 -20)");
    expected = 30;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.resolveBrackets("(-10 -20)");
    expected = -30;
    Assert.assertEquals(expected, actual);
  }
}
