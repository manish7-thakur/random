import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RomanNumeralsSorterTest {
    @Test
    public void twoItems() {
        List<String> names = Arrays.asList("Peter II", "Peter I");
        List<String> actual = RomanNumeralsSorter.sortRoman(names);
        List<String> expected = Arrays.asList("Peter I", "Peter II");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter X", "Peter IX");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Peter IX", "Peter X");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Maria IX", "Peter X");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Maria IX", "Peter X");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter V", "Peter IV");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Peter IV", "Peter V");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter V", "Peter VI");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Peter V", "Peter VI");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter V", "Maria VI");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Maria VI", "Peter V");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter XLV", "Peter XLIV");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Peter XLIV", "Peter XLV");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter XLV", "Maria XLIV");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Maria XLIV", "Peter XLV");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeItems() {
        List<String> names = Arrays.asList("Peter II", "Peter I", "Peter III");
        List<String> actual = RomanNumeralsSorter.sortRoman(names);
        List<String> expected = Arrays.asList("Peter I", "Peter II", "Peter III");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter X", "Peter IX", "Peter XI");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Peter IX", "Peter X", "Peter XI");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter V", "Peter IV", "Peter VI");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Peter IV", "Peter V", "Peter VI");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter V", "Peter IV", "Maria VI");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Maria VI", "Peter IV", "Peter V");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Peter XLV", "Peter XLIV", "Peter XLVI");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Peter XLIV", "Peter XLV", "Peter XLVI");
        Assert.assertEquals(expected, actual);

        names = Arrays.asList("Rambo XLV", "Maria XLIV", "Peter XLVI");
        actual = RomanNumeralsSorter.sortRoman(names);
        expected = Arrays.asList("Maria XLIV", "Peter XLVI", "Rambo XLV");
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void multiItems() {
        List<String> names = Arrays.asList("Peter II", "Peter I", "Peter II", "Maria IV",
                "Rambo XVI", "Rambo XIV", "Peter XL", "Tony III", "Peter L", "Peter XXX", "Maria III",
                "Bamboo XIV", "Maria L", "Apple I", "Tony L");
        List<String> actual = RomanNumeralsSorter.sortRoman(names);
        List<String> expected = Arrays.asList("Apple I", "Bamboo XIV", "Maria III", "Maria IV",
                "Maria L", "Peter I", "Peter II", "Peter II", "Peter XXX", "Peter XL", "Peter L", "Rambo XIV", "Rambo XVI", "Tony III", "Tony L");
        Assert.assertEquals(expected, actual);
    }
}