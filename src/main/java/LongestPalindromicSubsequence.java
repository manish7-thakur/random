public class LongestPalindromicSubsequence {
    public static int find(String s, int i) {
        char[][] path = new char[i+1][i+1];
        return findNow(s, 0, i, path);
    }

    public static String findSeq(String s, int i) {
        char[][] path = new char[i+1][i+1];
        findNow(s, 0, i, path);
        StringBuilder b = new StringBuilder();
        return buildNow(path, 0, i, s, b);
    }

    static int findNow(String s, int i, int j, char[][] path) {
        if (i == j) {
            path[i][j] = 'm';
            return 1;
        }
        if (i > j) {
            return 0;
        }
        if (s.charAt(i) == s.charAt(j)) {
            path[i][j] = 'm';
            path[j][i] = 'm';
            return 2 + findNow(s, i + 1, j - 1, path);
        }
        int v1  = findNow(s, i, j - 1, path);
        int v2 = findNow(s, i + 1, j, path);
        if(v1 > v2) {
            path[i][j] = 'l';
            return v1;
        } else {
            path[i][j] = 'd';
            return v2;
        }
    }

    static String buildSubSequence(char[][] path, int i, int j, String s) {
        StringBuilder b = new StringBuilder();
        return buildNow(path, i, j, s, b);
    }
    static String buildNow(char[][] path, int i, int j, String s, StringBuilder b){
        if(i > s.length() -1 || j < 0) {
            return b.toString();
        }
        if(path[i][j] == 'm') {
            b.append(s.charAt(j));
            return buildNow(path, i+1, j-1,s,b);
        } else if(path[i][j] == 'd') {
            return buildNow(path, i +1, j, s, b);
        } else {
            return buildNow(path, i, j -1, s,b);
        }

    }
}