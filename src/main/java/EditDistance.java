public class EditDistance {
	public static int find(String s1, String s2, int i, int j) {
		if(i < 0 || j < 0) {
			return 0;
		}
		if(i >= 1 && j >= 1 && s1.charAt(i) == s2.charAt(j -1) && s1.charAt(i-1) == s2.charAt(j)) {
			return 2 + find(s1, s2, i-1, j-2);
		} else if(s1.charAt(i) != s2.charAt(j)) {
			return 1 + find(s1, s2, i-1, j-1);
		} 
		return 0;

	}
}