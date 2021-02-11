public class PatternFinder {
	/**
	* Find the first occ of pattern in the given text, all characters in the pattern must be unique
	*/
	static int find(String text, String pat) {
		char patFirstChar = pat.charAt(0);
		for(int i = 0; i < text.length() - pat.length() + 1; i++) {
			if(patFirstChar == text.charAt(i)) {
				int k = 0;
				for(k = 0; k < pat.length() && pat.charAt(k) == text.charAt(i+k); k++);
				if(k >= pat.length()) {
					return i;
				}
				i += k-1;
			}
		}
		return -1;
	}
}