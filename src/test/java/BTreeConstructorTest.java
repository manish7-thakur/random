import org.junit.*;

public class BTreeConstructorTest {
	@Test
	public void singleNode() {
		TreeNode root = BTreeConstructor.fromPreorder(new int[] {3});
		Assert.assertEquals(3, root.value);
	}

	@Test
	public void doubleNodesRightSubtree() {
		TreeNode root = BTreeConstructor.fromPreorder(new int[] {3, 5});
		Assert.assertEquals(3, root.value);
		Assert.assertEquals(5, root.right.value);
		Assert.assertNull(root.left);
	}

	@Test
	public void doubleNodesLeftSubtree() {
		TreeNode root = BTreeConstructor.fromPreorder(new int[] {3, 2});
		Assert.assertEquals(3, root.value);
		Assert.assertEquals(2, root.left.value);
	}

	@Test
	public void tripleNodesRightSkewed() {
		TreeNode root = BTreeConstructor.fromPreorder(new int[] {3, 4, 5});
		Assert.assertEquals(3, root.value);
		Assert.assertEquals(4, root.right.value);
		Assert.assertEquals(5, root.right.right.value);
	}

	@Test
	public void tripleNodesLeftSkewed() {
		TreeNode root = BTreeConstructor.fromPreorder(new int[] {5, 4, 3});
		Assert.assertEquals(5, root.value);
		Assert.assertEquals(4, root.left.value);
		Assert.assertEquals(3, root.left.left.value);
	}

	@Test
	public void fourNodes() {
		TreeNode root = BTreeConstructor.fromPreorder(new int[] {3, 2, 4, 5});
		Assert.assertEquals(3, root.value);
		Assert.assertEquals(2, root.left.value);
		Assert.assertEquals(4, root.right.value);
		Assert.assertEquals(5, root.right.right.value);
		root = BTreeConstructor.fromPreorder(new int[] {3, 2, 5, 4});
		Assert.assertEquals(3, root.value);
		Assert.assertEquals(2, root.left.value);
		Assert.assertEquals(5, root.right.value);
		Assert.assertEquals(4, root.right.left.value);
		root = BTreeConstructor.fromPreorder(new int[] {3, 4, 5, 6});
		Assert.assertEquals(3, root.value);
		Assert.assertEquals(4, root.right.value);
		Assert.assertEquals(5, root.right.right.value);
		Assert.assertEquals(6, root.right.right.right.value);
		root = BTreeConstructor.fromPreorder(new int[] {6, 5, 4, 3});
		Assert.assertEquals(6, root.value);
		Assert.assertEquals(5, root.left.value);
		Assert.assertEquals(4, root.left.left.value);
		Assert.assertEquals(3, root.left.left.left.value);
	}

	@Test
	public void sixNodes() {
		TreeNode root = BTreeConstructor.fromPreorder(new int[] {10,13, 12,11, 14, 15});
		Assert.assertEquals(10, root.value);
		Assert.assertNull(root.left);
		Assert.assertEquals(13, root.right.value);
		Assert.assertEquals(14, root.right.right.value);
		Assert.assertEquals(12, root.right.left.value);
		Assert.assertEquals(15, root.right.right.right.value);
		Assert.assertEquals(11, root.right.left.left.value);
	}
}