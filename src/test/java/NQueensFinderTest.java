import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        sol1 = new ArrayList<>(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        List<String> sol2 = new ArrayList<>(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        expected = new ArrayList<>(Arrays.asList(sol1, sol2));
        Assert.assertEquals(expected, actual);

        actual = NQueensFinder.solveNQueens(5);
        sol1 = new ArrayList<>(Arrays.asList("Q....", "..Q..", "....Q", ".Q...", "...Q."));
        sol2 = new ArrayList<>(Arrays.asList("Q....", "...Q.", ".Q...", "....Q", "..Q.."));
        List<String> sol3 = new ArrayList<>(Arrays.asList(".Q...", "...Q.", "Q....", "..Q..", "....Q"));
        List<String> sol4 = new ArrayList<>(Arrays.asList(".Q...", "....Q", "..Q..", "Q....", "...Q."));
        List<String> sol5 = new ArrayList<>(Arrays.asList("..Q..", "Q....", "...Q.", ".Q...", "....Q"));
        List<String> sol6 = new ArrayList<>(Arrays.asList("..Q..", "....Q", ".Q...", "...Q.", "Q...."));
        List<String> sol7 = new ArrayList<>(Arrays.asList("...Q.", "Q....", "..Q..", "....Q", ".Q..."));
        List<String> sol8 = new ArrayList<>(Arrays.asList("...Q.", ".Q...", "....Q", "..Q..", "Q...."));
        List<String> sol9 = new ArrayList<>(Arrays.asList("....Q", ".Q...", "...Q.", "Q....", "..Q.."));
        List<String> sol10 = new ArrayList<>(Arrays.asList("....Q", "..Q..", "Q....", "...Q.", ".Q..."));

        expected = new ArrayList<>(Arrays.asList(sol1, sol2, sol3, sol4, sol5, sol6, sol7, sol8, sol9, sol10));
        Assert.assertEquals(expected, actual);

        actual = NQueensFinder.solveNQueens(6);
        sol1 = new ArrayList<>(Arrays.asList(".Q....", "...Q..", ".....Q", "Q.....", "..Q...", "....Q."));
        sol2 = new ArrayList<>(Arrays.asList("..Q...", ".....Q", ".Q....", "....Q.", "Q.....", "...Q.."));
        sol3 = new ArrayList<>(Arrays.asList("...Q..", "Q.....", "....Q.", ".Q....", ".....Q", "..Q..."));
        sol4 = new ArrayList<>(Arrays.asList("....Q.", "..Q...", "Q.....", ".....Q", "...Q..", ".Q...."));
        expected = new ArrayList<>(Arrays.asList(sol1, sol2, sol3, sol4));
        Assert.assertEquals(expected, actual);
    }
}
