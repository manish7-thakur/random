public class LCS {
	public static String find(String s1, String s2, int i, int j) {
		char[][] path = new char[i+1][j+1];
		findNow(s1, s2, i, j, path);
		StringBuilder b = new StringBuilder();
		return buildSeq(path, b , path.length - 1, path[0].length - 1, s1);
	}

	static int findNow(String s1, String s2, int i, int j, char[][] path) {
		if(i < 0 || j < 0) {
			return 0;
		}
		if(s1.charAt(i) == s2.charAt(j)) {
			path[i][j] = 'm';
			return 1 + findNow(s1, s2, i -1, j-1, path);
		} else {
			 int v1 = findNow(s1, s2, i, j-1, path);
			 int v2 = findNow(s1, s2, i - 1, j, path);
			 if(v1 > v2) {
			 	path[i][j] = 'b';
			 	return v1;
			 } else {
			 	path[i][j] = 'u';
			 	return v2;
			 }
		}

	}

	static String buildSeq(char[][] path, StringBuilder b, int i, int j, String s) {
		if( i < 0 || j < 0) {
			return b.toString();
		}
		if(path[i][j] == 'm') {
			b.insert(0, s.charAt(i));
			buildSeq(path, b, i - 1, j -1, s);
		} else if(path[i][j] == 'b') {
			buildSeq(path, b, i, j -1, s);
		} else {
			buildSeq(path, b, i -1, j, s);
		}
		return b.toString();
	}
}