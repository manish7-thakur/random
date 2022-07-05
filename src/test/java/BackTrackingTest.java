import org.junit.*;
import java.util.*;

public class BackTrackingTest {
  @Test
  public void generateValidParenthesisWithLength() {
    List<String> actual = BackTracking.generateParenthesis(1);
    List<String> expected = List.of("()");
    Assert.assertEquals(expected, actual);
  }
}
