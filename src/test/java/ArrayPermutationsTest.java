import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutationsTest {
    @Test
    public void generatePermutations() {
        ArrayList<String> actual = ArrayPermutations.permute(new char[]{'a', 'b'}, 2);
        List<String> expected = Arrays.asList("ab");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permute(new char[]{'a', 'b', 'c'}, 2);
        expected = Arrays.asList("ab", "ac", "bc");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permute(new char[]{'a', 'b', 'c'}, 3);
        expected = Arrays.asList("abc");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permute(new char[]{'a', 'b', 'c'}, 1);
        expected = Arrays.asList("a", "b", "c");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permute(new char[]{'a', 'b', 'c', 'd'}, 3);
        expected = Arrays.asList("abc", "abd", "acd", "bcd");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateCombinations() {
        ArrayList<String> actual = ArrayPermutations.allCombinations(new char[]{'a', 'b'});
        List<String> expected = Arrays.asList("aa", "ab", "ba", "bb");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.allCombinations(new char[]{'a', 'b', 'c'});
        expected = Arrays.asList("aaa", "aab", "aac", "aba", "abb", "abc", "aca", "acb", "acc", "baa", "bab", "bac", "bba", "bbb", "bbc", "bca", "bcb", "bcc", "caa", "cab", "cac", "cba", "cbb", "cbc", "cca", "ccb", "ccc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateArrayPermutations() {
      var actual = ArrayPermutations.permute(new int[]{2});
      var expected = List.of(List.of(2));
      Assert.assertEquals(expected, actual);

      actual = ArrayPermutations.permute(new int[]{2, 1});
      expected = List.of(List.of(1, 2), List.of(2, 1));
      Assert.assertEquals(expected, actual);

      actual = ArrayPermutations.permute(new int[]{1, 2, 3});
      expected = List.of(List.of(3, 2, 1), List.of(2, 3, 1), List.of(3, 1, 2), List.of(1, 3, 2), List.of(1, 2, 3), List.of(2, 1, 3));
      Assert.assertEquals(expected, actual);

      actual = ArrayPermutations.permute(new int[]{4, 1, 2, 3});
      expected = List.of(List.of(3, 2, 1, 4), List.of(2, 3, 1, 4), List.of(3, 1, 2, 4), List.of(1, 3, 2, 4), List.of(1, 2, 3, 4), List.of(2, 1, 3, 4), List.of(3, 2, 4, 1), List.of(2, 3, 4, 1), List.of(3, 4, 2, 1), List.of(4, 3, 2, 1), List.of(4, 2, 3, 1), List.of(2, 4, 3, 1), List.of(3, 4, 1, 2), List.of(4, 3, 1, 2), List.of(3, 1, 4, 2), List.of(1, 3, 4, 2), List.of(1, 4, 3, 2), List.of(4, 1, 3, 2), List.of(4, 2, 1, 3), List.of(2, 4, 1, 3), List.of(4, 1, 2, 3), List.of(1, 4, 2, 3), List.of(1, 2, 4, 3), List.of(2, 1, 4, 3));
      Assert.assertEquals(expected, actual);
    }
}
