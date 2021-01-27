public class LongestPalindromicSubsequence {
	public static int find(String s, int i) {
		return findNow(s, 0, i);
	}
	static int findNow(String s, int i, int j) {
		if(i == j) {
			return 1;
		}
		if(i > j) {
			return 0;
		}
		int k = i ;
		for(; k < j && s.charAt(k) != s.charAt(j); k++);
			if(k == j) {
				return findNow(s, i, j-1);
			}
			return Math.max(2 + findNow(s, k+1, j-1), findNow(s, i, j-1));
	}
}