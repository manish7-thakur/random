import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPermutatorTest {
    @Test
    public void generate() {

        ArrayList<String> actual = StringPermutator.permutate("A");
        ArrayList<String> expected = new ArrayList(Arrays.asList("A"));
        Assert.assertEquals(expected, actual);

        actual = StringPermutator.permutate("AB");
        expected = new ArrayList(Arrays.asList("AB", "BA"));
        Assert.assertEquals(expected, actual);

        actual = StringPermutator.permutate("ABC");
        expected = new ArrayList(Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"));
        Assert.assertEquals(expected, actual);
    }
}