import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TextJustifierTest {
    @Test
    public void justifyTest() {
        List<String> actual = TextJustifier.fullJustify(new String[]{"what"}, 5);
        List<String> expected = Arrays.asList("what ");
        Assert.assertEquals(expected, actual);

        actual = TextJustifier.fullJustify(new String[]{"what", "is"}, 7);
        expected = Arrays.asList("what is");
        Assert.assertEquals(expected, actual);

        actual = TextJustifier.fullJustify(new String[]{"what", "is"}, 8);
        expected = Arrays.asList("what  is");
        Assert.assertEquals(expected, actual);
    }
}
