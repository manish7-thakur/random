import org.junit.*;
import java.util.*;

public class ConnectedComponentsTest {
  @Test
  public void mergeAccountsWithCommonElem() {
    List<List<String>> actual = ConnectedComponents.mergeAccounts(List.of(List.of("jack", "a", "b")));
    List<List<String>> expected = List.of(List.of("jack", "a", "b"));
    Assert.assertEquals(expected, actual);

    actual = ConnectedComponents.mergeAccounts(List.of(List.of("jack", "a", "b"), List.of("jack", "b")));
    expected = List.of(List.of("jack", "a", "b"));
    Assert.assertEquals(expected, actual);
  }
}
