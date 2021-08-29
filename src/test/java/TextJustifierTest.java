import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TextJustifierTest {
  @Test
  public void justifyString() {
    String actual = TextJustifier.justify(0 , 0, 4, 4, new String[] {"what"}, false);
    String expected = "what";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 0, 8, 4, new String[] {"what"}, false);
    expected = "what    ";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 1, 7, 6, new String[] {"what", "is"}, false);
    expected = "what is";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 1, 7, 6, new String[] {"what", "is"}, true);
    expected = "what is";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 1, 8, 6, new String[] {"what", "is"}, true);
    expected = "what is ";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 1, 8, 6, new String[] {"what", "is"}, false);
    expected = "what  is";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 1, 10, 6, new String[] {"what", "is"}, false);
    expected = "what    is";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 1, 10, 6, new String[] {"what", "is"}, true);
    expected = "what is   ";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 2, 11, 9, new String[] {"what", "is", "the"}, false);
    expected = "what is the";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 2, 12, 9, new String[] {"what", "is", "the"}, false);
    expected = "what  is the";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 2, 14, 9, new String[] {"what", "is", "the"}, false);
    expected = "what   is  the";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 3, 16, 13, new String[] {"what", "is", "the", "time"}, false);
    expected = "what is the time";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 3, 17, 13, new String[] {"what", "is", "the", "time"}, false);
    expected = "what  is the time";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 3, 19, 13, new String[] {"what", "is", "the", "time"}, false);
    expected = "what  is  the  time";
    Assert.assertEquals(expected, actual);

    actual = TextJustifier.justify(0 , 3, 19, 13, new String[] {"what", "is", "the", "time"}, true);
    expected = "what is the time   ";
    Assert.assertEquals(expected, actual);
  }

  // @Test
  // public void justifyText() {
  //     List<String> actual = TextJustifier.fullJustify(new String[]{"what"}, 4);
  //     List<String> expected = Arrays.asList("what");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what"}, 5);
  //     expected = Arrays.asList("what ");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what"}, 10);
  //     expected = Arrays.asList("what      ");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what", "is"}, 7);
  //     expected = Arrays.asList("what is");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what", "is"}, 8);
  //     expected = Arrays.asList("what  is");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what", "is", "the"}, 6);
  //     expected = Arrays.asList("what  ", "is the");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what", "is", "the"}, 7);
  //     expected = Arrays.asList("what is", "the    ");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what", "is", "the"}, 11);
  //     expected = Arrays.asList("what is the");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"what", "is", "the"}, 16);
  //     expected = Arrays.asList("what    is   the");
  //     Assert.assertEquals(expected, actual);
  //
  //     actual = TextJustifier.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
  //     expected = Arrays.asList("This    is    an", "example  of text", "justification.  ");
  //     Assert.assertEquals(expected, actual);
  // }
}
