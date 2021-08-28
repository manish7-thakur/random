import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TextJustifierTest {

    @Test
    public void justifyTest() {
      List<String> actual = TextJustifier.fullJustify(new String[]{"what"}, 4);
      List<String> expected = Arrays.asList("what");
      Assert.assertEquals(expected, actual);

       actual = TextJustifier.fullJustify(new String[]{"what"}, 5);
       expected = Arrays.asList("what ");
       Assert.assertEquals(expected, actual);

       actual = TextJustifier.fullJustify(new String[]{"what"}, 10);
       expected = Arrays.asList("what      ");
       Assert.assertEquals(expected, actual);

       actual = TextJustifier.fullJustify(new String[]{"what", "is"}, 7);
       expected = Arrays.asList("what is");
       Assert.assertEquals(expected, actual);

        actual = TextJustifier.fullJustify(new String[]{"what", "is"}, 8);
        expected = Arrays.asList("what  is");
        Assert.assertEquals(expected, actual);

       actual = TextJustifier.fullJustify(new String[]{"what", "is", "the"}, 6);
       expected = Arrays.asList("what  ", "is the");
       Assert.assertEquals(expected, actual);

       actual = TextJustifier.fullJustify(new String[]{"what", "is", "the"}, 7);
       expected = Arrays.asList("what is", "the    ");
       Assert.assertEquals(expected, actual);

       actual = TextJustifier.fullJustify(new String[]{"what", "is", "the"}, 11);
       expected = Arrays.asList("what is the");
       Assert.assertEquals(expected, actual);

       actual = TextJustifier.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
       expected = Arrays.asList("This    is    an", "example  of text", "justification.  ");
       Assert.assertEquals(expected, actual);
    }
}
