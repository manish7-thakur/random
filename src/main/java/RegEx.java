public class RegEx {
    public static boolean matches(String s, String p, int i, int j) {
        if ((i == -1 && j == -1) || (i == -1 && j == 1 && p.charAt(j) == '*')) {
            return true;
        }
        if (i == -1 || j == -1) {
            return false;
        }
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            return matches(s, p, i - 1, j - 1);
        } else if (p.charAt(j) == '*') {
            if (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                return matches(s, p, i - 1, j) || matches(s, p, i, j - 2);
            } else {
                return matches(s, p, i, j - 2);
            }
        }
        return false;
    }
}

/*
overlapping sub-problems, use DP.

						(s,p,5,5)
					/      			\*
			(s,p,4,4)				(s,p,4,5) 						|| (s,p,5,3)
			/		\				/	   \*						/			\*
		(s,p,3,3)	(s,p,3,4)  (s,p,3,4)   (s,p,3,5)||(s,p,4,3) 	(s,p,4,2)   (s,p,4,3)||(s,p,5,1)

*/