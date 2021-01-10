public class RegEx {
	public static boolean matches(String s, String p, int i , int j) {
		if(i == -1) {
			return true;
		}
		if(i != -1 && j == -1) {
			return false;
		}
		if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
			return matches(s, p, i-1, j-1);
		}
		if(p.charAt(j) == '*') {
			if(s.charAt(i) == p.charAt(j-1) || p.charAt(j-1) == '.') {
				return matches(s,p, i-1, j);
			} else {
				return matches(s,p, i, j-2);
			}
		}
		return false;
	}
}