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

    actual = ExpressionEvaluator.evaluate("43-34-12");
    expected = -3;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("43-34-12");
    expected = -3;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("3-2+1");
    expected = 2;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("23-2+1-42+32");
    expected = 12;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("367/35*24");
    expected = 251.65;
    Assert.assertEquals(expected, actual, 0.5);

    actual = ExpressionEvaluator.evaluate("54*44-4*453-367/35*24+34");
    expected = 326.65;
    Assert.assertEquals(expected, actual, 0.5);

  }
}
