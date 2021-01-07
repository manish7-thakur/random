import java.util.*;

public class LongestPalindrome {
	
	public static String longestPlaindrome(String s) {
		Map<Character, ArrayList<Integer>> idxMap = new HashMap<>(); 
		String res = "" + s.charAt(0);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			ArrayList<Integer> idxList = idxMap.getOrDefault(c, new ArrayList<Integer>());
			idxList.add(i);
			idxMap.put(c, idxList);
		}
		for(Map.Entry<Character, ArrayList<Integer>> entry : idxMap.entrySet()) {
			ArrayList<Integer> idxList = entry.getValue();
			int idxListSize = idxList.size();
			if(idxListSize > 1) {
				for(int i = 0; i < idxListSize; i++) {
					for(int j = i+1; j < idxListSize; j++) {
						int l = idxList.get(i);
						int r = idxList.get(j);
 						if(isPalindrome(s, l, r) && r - l + 1 > res.length()) {
							res = s.substring(l, r +1);
						}
					}
				}
			}
		}
		return res;
	}

	public static boolean isPalindrome(String s, int i, int j) {
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}