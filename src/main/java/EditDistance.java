import java.util.*;
public class EditDistance {
    public static int find(String s1, String s2, int i, int j) {
        if (i < 0 && j < 0) {
            return 0;
        }
        if (i < 0) {
            return 1 + find(s1, s2, i, j - 1); // Insert
        }
        if (j < 0) {
            return 1; // Kill as target is achieved
        }
        if (s1.charAt(i) != s2.charAt(j)) {
            if (i > 0 && j > 0 && s1.charAt(i) == s2.charAt(j - 1) && s1.charAt(i - 1) == s2.charAt(j)) {
                return 1 + find(s1, s2, i - 2, j - 2);
            }
            //Min (replace, insert->delete, delete -> insert)
            return 1 +  Math.min(Math.min(find(s1, s2, i - 1, j - 1), find(s1, s2, i - 1, j)), find(s1, s2, i, j - 1));
        }
        return 1 + find(s1, s2, i - 1, j - 1); // Copy
    }

    static String getOps(char[][] path, int i, int j, StringBuilder b) {
        if(i < 0) {
            return b.toString();
            }
        if(j< 0) {
            if(i < 0) {
            return b.toString();
            }
            b.append('k');
            return b.toString();
        }
        if(path[i][j] == 'i') {
            b.append('i');
            return getOps(path, i, j-1, b);
        } else if(path[i][j] == 'c' || path[i][j] == 'r') {
            b.append(path[i][j]);
            return getOps(path, i - 1, j-1, b);
        } else if(path[i][j] == 'd') {
            b.append('d');
            return getOps(path, i -1, j, b);
        } else if(path[i][j] == 't') {
            b.append('t');
            return getOps(path, i -2, j-2, b);
        }
        return b.toString();
        
    }

}