import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutationsTest {
    @Test
    public void generatePermutations() {
        ArrayList<String> actual = ArrayPermutations.permutate(new char[]{'a', 'b'}, 2);
        List<String> expected = Arrays.asList("ab");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permutate(new char[]{'a', 'b', 'c'}, 2);
        expected = Arrays.asList("ab", "ac", "bc");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permutate(new char[]{'a', 'b', 'c'}, 3);
        expected = Arrays.asList("abc");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permutate(new char[]{'a', 'b', 'c'}, 1);
        expected = Arrays.asList("a", "b", "c");
        Assert.assertEquals(expected, actual);

        actual = ArrayPermutations.permutate(new char[]{'a', 'b', 'c', 'd'}, 3);
        expected = Arrays.asList("abc", "abd", "acd", "bcd");
        Assert.assertEquals(expected, actual);
    }
}