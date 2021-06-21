import org.junit.*;

import java.util.*;

public class SubstringConcatFinderTest {
    @Test
    public void findWordsPermutations() {
        List actual = SubstringConcatFinder.find("foo", new String[]{"foo"});
        List expected = new ArrayList();
        expected.add(0);
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("foobar", new String[]{"foo", "bar"});
        expected = new ArrayList();
        expected.add(0);
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("foofoobar", new String[]{"foo", "bar"});
        expected = new ArrayList();
        expected.add(3);
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("barfoobar", new String[]{"foo", "bar"});
        expected = new ArrayList();
        expected.add(0);
        expected.add(3);
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("barfoothebarfoo", new String[]{"foo", "bar", "the"});
        expected = new ArrayList();
        expected.add(0);
        expected.add(3);
        expected.add(6);
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});
        expected = new ArrayList();
        expected.add(6);
        expected.add(9);
        expected.add(12);
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("barfoothebarfooliftfoothebar", new String[]{"foo", "bar", "the"});
        expected = new ArrayList();
        expected.add(0);
        expected.add(3);
        expected.add(6);
        expected.add(19);
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        expected = new ArrayList();
        Assert.assertEquals(expected, actual);

        actual = SubstringConcatFinder.find("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"});
        expected = new ArrayList();
        expected.add(8);
        Assert.assertEquals(expected, actual);
    }
}