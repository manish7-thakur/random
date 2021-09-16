import org.junit.*;

public class ExpressionEvaluatorTest {
  @Test
  public void evaluateStringExp() {
    int actual = ExpressionEvaluator.evaluate("1+1");
    int expected = 2;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.evaluate("1-2");
    expected = -1;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.evaluate("23*321");
    expected = 7383;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.evaluate("11*4-20");
    expected = 24;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.evaluate("12/4-123");
    expected = -120;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.evaluate("11+22/2");
    expected = 22;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.evaluate("54*44/4");
    expected = 594;
    Assert.assertEquals(expected, actual);

    actual = ExpressionEvaluator.evaluate("54*44-4*453-367/35*24+34-572*322/34-25+28");
    expected = -5067;
    Assert.assertEquals(expected, actual);

  }
}
