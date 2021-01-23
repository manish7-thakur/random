public class EditDistance {
	public static int find(String s1, String s2, int i, int j) {
		if(i < 0 && j < 0) {
			return 0;
		}
		if(i < 0) {
			return 1+ find(s1, s2, i, j-1); // Insert
		}
		if(j < 0) {
			return 1 + find(s1, s2, i-1, j); // Delete
		}
		if(s1.charAt(i) != s2.charAt(j)) {
			if(i > 0 && j > 0 && s1.charAt(i) == s2.charAt(j-1) && s1.charAt(i-1) == s2.charAt(j)) {
				return 1 + find(s1,s2,i-2,j-2);
			}
			return Math.min(Math.min(1+ find(s1,s2,i-1,j-1), 1 + find(s1, s2, i-1, j)), 1+ find(s1, s2, i, j-1));
		} 
		return 1 + find(s1, s2, i-1, j-1); // Copy

	}
}