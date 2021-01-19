public class BTreeConstructor {
    public static TreeNode fromPreorder(int[] elems) {
        TreeNode root = new TreeNode(elems[0], null, null);
        build(elems, root, 0, elems.length - 1);
        return root;
    }

    private static void build(int[] elems, TreeNode root, int i, int j) {
        if (i >= j) {
            return;
        }
        int idx = findRightSubtreeRoot(elems, i, j);
        if (idx <= j) {
            root.right = new TreeNode(elems[idx], null, null);
        }
        if (i + 1 != idx) {
            root.left = new TreeNode(elems[i + 1], null, null);
        }
        if (root.right != null) {
            build(elems, root.right, idx, j);
        }
        if (root.left != null) {
            build(elems, root.left, i + 1, idx - 1);
        }
    }

    static int findRightSubtreeRoot(int[] elems, int i, int j) {
        int k = i + 1;
        for (; k <= j && elems[k] < elems[i]; k++) ;
        return k;
    }
}

/*
we solve both parts after division so the recurrance relation would be:
T(n) = 2T(n/2) + n => nlogn
Better than nlog(height) for BST
*/