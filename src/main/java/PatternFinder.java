public class PatternFinder {
	static int find(String text, String pat) {
		for(int i = 0; i < text.length() - pat.length() + 1; i++) {
			if(pat.charAt(0) == text.charAt(i)) {
				int j = i;
				int k = 0;
				while(k < pat.length() && pat.charAt(k) == text.charAt(j)) {
					k++;
					j++;
				}
				if(k >= pat.length()) {
					return i;
				}
			}
		}
		return -1;
	}
}