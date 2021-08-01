import java.util.*;
import org.junit.*;

public class NQueensFinderTest {
  @Test
  public void findNQueensSolutions() {
   List<List<String>> actual = NQueensFinder.solveNQueens(1);
   List<String> sol1 = new ArrayList<>(Arrays.asList("Q"));
   List<List<String>> expected = new ArrayList<>(Arrays.asList(sol1));
   Assert.assertEquals(expected, actual);

   actual = NQueensFinder.solveNQueens(2);
   Assert.assertTrue(actual.isEmpty());

   actual = NQueensFinder.solveNQueens(3);
   Assert.assertTrue(actual.isEmpty());

   actual = NQueensFinder.solveNQueens(4);
   sol1 = new ArrayList<>(Arrays.asList(".Q..","...Q","Q...","..Q."));
   List<String> sol2 =  new ArrayList<>(Arrays.asList("..Q.","Q...","...Q",".Q.."));
   expected = new ArrayList<>(Arrays.asList(sol1, sol2));
   Assert.assertEquals(expected, actual);

   actual = NQueensFinder.solveNQueens(5);
   sol1 = new ArrayList<>(Arrays.asList("Q....","..Q..","....Q",".Q...","...Q."));
   sol2 =  new ArrayList<>(Arrays.asList(".Q...","...Q.","Q....","..Q..", "....Q"));
   List<String> sol3 =  new ArrayList<>(Arrays.asList("..Q..", "Q....", "...Q.", ".Q...", "....Q"));
   List<String> sol4 =  new ArrayList<>(Arrays.asList("...Q.", "Q....", "..Q..", "....Q", ".Q..."));
   expected = new ArrayList<>(Arrays.asList(sol1, sol2, sol3, sol4));
   Assert.assertEquals(expected, actual);

    actual = NQueensFinder.solveNQueens(6);
    Assert.assertTrue(actual.isEmpty());

    actual = NQueensFinder.solveNQueens(7);
    sol1 = new ArrayList<>(Arrays.asList(".....Q.", "Q......", "..Q....", "....Q..", "......Q", ".Q.....", "...Q..."));
    expected = new ArrayList<>(Arrays.asList(sol1));
    Assert.assertEquals(expected, actual);

    actual = NQueensFinder.solveNQueens(8);
    Assert.assertTrue(actual.isEmpty());

    actual = NQueensFinder.solveNQueens(9);
    Assert.assertTrue(actual.isEmpty());
  }
}
