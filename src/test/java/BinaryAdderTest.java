import java.util.*;
import org.junit.*;

public class BinaryAdderTest {
	@Test 
	public void addSingleBit() {
		int[] a = new int[]{1};
		int[] b = new int[]{1};
		int[] actual = BinaryAdder.add(a, b);
		int[] expected = new int[]{1, 0};
		Assert.assertArrayEquals(expected, actual);

		a = new int[]{0};
		b = new int[]{1};
		actual = BinaryAdder.add(a, b);
		expected = new int[]{0, 1};
		Assert.assertArrayEquals(expected, actual);
	}

		@Test 
	public void addDoubleBits() {
		int[] a = new int[]{1, 0};
		int[] b = new int[]{1, 0};
		int[] actual = BinaryAdder.add(a, b);
		int[] expected = new int[]{1, 0, 0};
		Assert.assertArrayEquals(expected, actual);

		a = new int[]{1, 0};
		b = new int[]{1, 1};
		actual = BinaryAdder.add(a, b);
		expected = new int[]{1, 0, 1};
		Assert.assertArrayEquals(expected, actual);

		a = new int[]{1, 1};
		b = new int[]{1, 1};
		actual = BinaryAdder.add(a, b);
		expected = new int[]{1, 1, 0};
		Assert.assertArrayEquals(expected, actual);

		a = new int[]{0, 1};
		b = new int[]{0, 1};
		actual = BinaryAdder.add(a, b);
		expected = new int[]{0, 1, 0};
		Assert.assertArrayEquals(expected, actual);

		a = new int[]{0, 1};
		b = new int[]{1, 0};
		actual = BinaryAdder.add(a, b);
		expected = new int[]{0, 1, 1};
		Assert.assertArrayEquals(expected, actual);
	}
}