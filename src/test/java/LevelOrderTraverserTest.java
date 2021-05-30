import java.util.*;
import org.junit.*;
public class LevelOrderTraverserTest {
	@Test
	public void levelOrderBinaryTree() {
		List<Integer> actual = LevelOrderTraverser
		.traverse(new TreeNode(1, new TreeNode(6, null, null), new TreeNode(5, null, null)));
		List<Integer> expected = List.of(1, 6, 5);
		Assert.assertEquals(actual, expected);

		actual = LevelOrderTraverser
		.traverse(new TreeNode(1, new TreeNode(6, new TreeNode(4, null, null), null), new TreeNode(5, null, new TreeNode(7, null, null))));
		expected = List.of(1, 6, 5, 4, 7);
		Assert.assertEquals(actual, expected);

		actual = LevelOrderTraverser
		.traverse(new TreeNode(1, new TreeNode(6, new TreeNode(4, new TreeNode(8, new TreeNode(9, null, null), null), null), null), new TreeNode(5, null, new TreeNode(7, null, null))));
		expected = List.of(1, 6, 5, 4, 7, 8, 9);
		Assert.assertEquals(actual, expected);
	}
}