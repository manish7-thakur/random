import java.util.*;
import org.junit.*;

public class RomanNumeralsSorterTest {
	@Test
	public void twoItems() {
		List<String> names = Arrays.asList(new String[]{"Peter II", "Peter I"});
		List<String> actual = RomanNumeralsSorter.sortRoman(names);
		List<String> expected = Arrays.asList(new String[]{"Peter I", "Peter II"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter X", "Peter IX"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Peter IX", "Peter X"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Maria IX", "Peter X"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Maria IX", "Peter X"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter V", "Peter IV"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Peter IV", "Peter V"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter V", "Peter VI"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Peter V", "Peter VI"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter V", "Maria VI"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Maria VI", "Peter V"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter XLV", "Peter XLIV"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Peter XLIV", "Peter XLV"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter XLV", "Maria XLIV"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Maria XLIV", "Peter XLV"});
		Assert.assertEquals(expected, actual);
	}

		@Test
	public void threeItems() {
		List<String> names = Arrays.asList(new String[]{"Peter II", "Peter I", "Peter III"});
		List<String> actual = RomanNumeralsSorter.sortRoman(names);
		List<String> expected = Arrays.asList(new String[]{"Peter I", "Peter II", "Peter III"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter X", "Peter IX", "Peter XI"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Peter IX", "Peter X", "Peter XI"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter V", "Peter IV", "Peter VI"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Peter IV", "Peter V", "Peter VI"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter V", "Peter IV", "Maria VI"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Maria VI", "Peter IV", "Peter V"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Peter XLV", "Peter XLIV", "Peter XLVI"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Peter XLIV", "Peter XLV", "Peter XLVI"});
		Assert.assertEquals(expected, actual);

		names = Arrays.asList(new String[]{"Rambo XLV", "Maria XLIV", "Peter XLVI"});
		actual = RomanNumeralsSorter.sortRoman(names);
		expected = Arrays.asList(new String[]{"Maria XLIV", "Peter XLVI", "Rambo XLV"});
		Assert.assertEquals(expected, actual);
	}


		@Test
	public void multiItems() {
		List<String> names = Arrays.asList(new String[]{"Peter II", "Peter I", "Peter II", "Maria IV",
			"Rambo XVI", "Rambo XIV", "Peter XL", "Tony III", "Peter L", "Peter XXX", "Maria III", 
			"Bamboo XIV", "Maria L", "Apple I", "Tony L"});
		List<String> actual = RomanNumeralsSorter.sortRoman(names);
		List<String> expected = Arrays.asList(new String[]{"Apple I", "Bamboo XIV", "Maria III", "Maria IV",
		 "Maria L", "Peter I", "Peter II", "Peter II", "Peter XXX", "Peter XL", "Peter L", "Rambo XIV", "Rambo XVI", "Tony III", "Tony L"});
		Assert.assertEquals(expected, actual);
	}
}