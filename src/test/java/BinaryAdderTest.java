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
}