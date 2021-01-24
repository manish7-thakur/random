import java.util.Arrays;

public class EditDistance {
    public static String find(String s1, String s2, int i, int j) {
        char[][] path = new char[i + 1][j + 1];
        StringBuilder b = new StringBuilder();
        findNow(s1, s2, i, j, path);
        getOps(path, i, j, b);
        return b.toString();
    }

    static int findNow(String s1, String s2, int i, int j, char[][] path) {
        if (i < 0 && j < 0) {
            return 0;
        }
        if (i < 0) {
            return 2 * (j + 1); // Cost of Inserting rem chars in s2
        }
        if (j < 0) {
            return Math.min(2 * (i + 1), Integer.MAX_VALUE); // min of delete, kill
        }
        int twiddle = Integer.MAX_VALUE;
        int copy = Integer.MAX_VALUE;
        if (i > 0 && j > 0 && s1.charAt(i) == s2.charAt(j - 1) && s1.charAt(i - 1) == s2.charAt(j)) {
            twiddle = Integer.MAX_VALUE;
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            copy = -1 + findNow(s1, s2, i - 1, j - 1, path);
        }
        int replace = 1 + findNow(s1, s2, i - 1, j - 1, path);
        int insert = 2 + findNow(s1, s2, i - 1, j, path);
        int delete = 2 + findNow(s1, s2, i, j - 1, path);
        int min = findMin(twiddle, replace, insert, delete, copy);
        if (min == replace) {
            path[i][j] = 'r';
            return replace;
        } else if (min == copy) {
            path[i][j] = 'c';
            return copy;
        } else if (min == insert) {
            path[i][j] = 'i';
            return insert;
        } else if (min == delete) {
            path[i][j] = 'd';
            return delete;
        }
        path[i][j] = 't';
        return twiddle;
    }

    static int findMin(int... values) {
        Arrays.sort(values);
        return values[0];
    }

    static String getOps(char[][] path, int i, int j, StringBuilder b) {
        if (i < 0 && j < 0) {
            return b.toString();
        }
        if (i < 0) {
            b.append('i');
            return getOps(path, i, j - 1, b);

        }
        if (j < 0) {
            b.append('d');
            return getOps(path, i - 1, j, b);
        }
        if (path[i][j] == 'i') {
            b.append('i');
            return getOps(path, i, j - 1, b);
        } else if (path[i][j] == 'c' || path[i][j] == 'r') {
            b.append(path[i][j]);
            return getOps(path, i - 1, j - 1, b);
        } else if (path[i][j] == 'd') {
            b.append('d');
            return getOps(path, i - 1, j, b);
        }
        b.append('t');
        return getOps(path, i - 2, j - 2, b);
    }

}