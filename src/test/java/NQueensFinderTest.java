import java.util.*;
import org.junit.*;

public class NQueensFinderTest {
  @Test
  public void findNQueensSolutions() {
    List<List<String>> actual = NQueensFinder.solveNQueens(4);
    List<String> sol1 = new ArrayList<>(Arrays.asList(".Q..","...Q","Q...","..Q."));
    List<String> sol2 =  new ArrayList<>(Arrays.asList("..Q.","Q...","...Q",".Q.."));
    List<List<String>> expected = new ArrayList<>(Arrays.asList(sol1, sol2));
    Assert.assertEquals(expected, actual);
  }
}
