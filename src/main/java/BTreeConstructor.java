public class BTreeConstructor {
    public static TreeNode fromPreorder(int[] elems) {
        return build(elems, 0, elems.length - 1);
    }

    private static TreeNode build(int[] elems, int i, int j) {
        if (i > j) {
            return null;
        }
        TreeNode root = new TreeNode(elems[i], null, null);
        int idx = findRightSubtreeRoot(elems, i, j);
        root.right = build(elems, idx, j);
        root.left = build(elems, i + 1, idx - 1);
        return root;
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