import org.junit.*;
import java.util.*;

public class StringManiaTest {
  @Test
  public void longestSubstringLengthWithoutRepeatingChars() {
    int actual = StringMania.lengthOfLongestSubstring("a");
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("ab");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aa");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aaa");
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aba");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aab");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aabac");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("ababcdab");
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aababc");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = StringMania.lengthOfLongestSubstring("aabaagdradsbvcgsdrvcavcfsrecavdsfdrewvcgsetjtlyobcwvsdaecsbcvcadsecwvcscwdfdsdvacsewcsd");
    expected = 13;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void longestRepeatingCharacterReplacement() {
    int actual = StringMania.characterReplacement("w", 0);
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("wp", 0);
    expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WP", 1);
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAP", 1);
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAPTP", 2);
    expected = 5;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WUAPTP", 2);
    expected = 4;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAPTPT", 3);
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = StringMania.characterReplacement("WPAPTPTWPEK", 5);
    expected = 9;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void minimumWindowSubstringContainingAllChars() {
    String actual = StringMania.minWindow("b", "a");
    String expected = "";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("a", "a");
    expected = "a";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("a", "aa");
    expected = "";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("abaa", "aa");
    expected = "aa";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("aabc", "ba");
    expected = "ab";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("aabc", "ba");
    expected = "ab";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("aacbcba", "ab");
    expected = "ba";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("addcdad", "ac");
    expected = "cda";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("adobecodebanc", "abc");
    expected = "banc";
    Assert.assertEquals(expected, actual);

    actual = StringMania.minWindow("addcdaddsgaedsewdardfaesdadsesdfsdea", "rds");
    expected = "sewdar";
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void checkAnagrams() {
    boolean actual = StringMania.isAnagram("a" , "b");
    Assert.assertFalse(actual);

    actual = StringMania.isAnagram("a" , "ba");
    Assert.assertFalse(actual);

    actual = StringMania.isAnagram("ab" , "ba");
    Assert.assertTrue(actual);

    actual = StringMania.isAnagram("ab" , "baa");
    Assert.assertFalse(actual);

    actual = StringMania.isAnagram("adjsdjyajab" , "bayjjsjddaa");
    Assert.assertTrue(actual);
  }

  @Test
  public void groupAnagramsInAList() {
    List<List<String>> actual = StringMania.groupAnagrams(new String[]{""});
    List<List<String>> expected = List.of(List.of(""));
    Assert.assertEquals(expected, actual);

    actual = StringMania.groupAnagrams(new String[]{"ab", "ba"});
    expected = List.of(List.of("ab", "ba"));
    Assert.assertEquals(expected, actual);

    actual = StringMania.groupAnagrams(new String[]{"tea", "eat", "pop", "top"});
    expected = List.of(List.of("tea", "eat"), List.of("top"), List.of("pop"));
    Assert.assertEquals(expected, actual);

    actual = StringMania.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    expected = List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat"));
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void checkStringForPlaindrome() {
    boolean actual = StringMania.isPalindrome("");
    Assert.assertTrue(actual);

    actual = StringMania.isPalindrome("ab");
    Assert.assertFalse(actual);

    actual = StringMania.isPalindrome(" ");
    Assert.assertTrue(actual);

    actual = StringMania.isPalindrome("a ");
    Assert.assertTrue(actual);

    actual = StringMania.isPalindrome("a b A");
    Assert.assertTrue(actual);

    actual = StringMania.isPalindrome("ab_a");
    Assert.assertTrue(actual);

    actual = StringMania.isPalindrome("a mAn b namA");
    Assert.assertTrue(actual);

    actual = StringMania.isPalindrome("A man, a plan, a canal: Panama");
    Assert.assertTrue(actual);
  }
  @Test
  public void longestPalindromicSubstring() {
    String actual = StringMania.longestPalindrome("a");
    String expected = "a";
    Assert.assertEquals(expected, actual);

    actual = StringMania.longestPalindrome("ba");
    expected = "b";
    Assert.assertEquals(expected, actual);

    actual = StringMania.longestPalindrome("baa");
    expected = "aa";
    Assert.assertEquals(expected, actual);

    actual = StringMania.longestPalindrome("ababca");
    expected = "aba";
    Assert.assertEquals(expected, actual);

    actual = StringMania.longestPalindrome("abcabcca");
    expected = "cc";
    Assert.assertEquals(expected, actual);

    actual = StringMania.longestPalindrome("abcabcjakebadssasasdgasdasdhca");
    expected = "sasas";
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void countTotalPalindromicSubstrings() {
    int actual = StringMania.countPalindromicSubstrings("a");
    int expected = 1;
    Assert.assertEquals(expected, actual);

    actual = StringMania.countPalindromicSubstrings("ba");
    expected = 2;
    Assert.assertEquals(expected, actual);

    actual = StringMania.countPalindromicSubstrings("aa");
    expected = 3;
    Assert.assertEquals(expected, actual);

    actual = StringMania.countPalindromicSubstrings("aaa");
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = StringMania.countPalindromicSubstrings("aaaa");
    expected = 10;
    Assert.assertEquals(expected, actual);

    actual = StringMania.countPalindromicSubstrings("aabb");
    expected = 6;
    Assert.assertEquals(expected, actual);

    actual = StringMania.countPalindromicSubstrings("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    expected = 8385;
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void sortSmallCaseAheadUpperCaseAheadEvenDigitsAheadOddDigits() {
    String actual = StringMania.sortChars("aA");
    String expected = "aA";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("Aa");
    expected = "aA";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("ba");
    expected = "ab";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("Bab");
    expected = "abB";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("21");
    expected = "21";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("234");
    expected = "243";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("2yW14");
    expected = "yW241";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("X32yWx14");
    expected = "xyWX2413";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("X23W2yWx3Xx141");
    expected = "xxyWWXX2241133";
    Assert.assertEquals(expected, actual);

    actual = StringMania.sortChars("X183HudJF823KITh68sdtW225yW44HDx3XWx1471");
    expected = "ddhstuxxyDFHHIJKTWWWXX222444688811133357";
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void removeAdjacentDuplicates() {
    String actual = StringMania.removeDuplicates("a", 2);
    String expected = "a";
    Assert.assertEquals(expected, actual);

    actual = StringMania.removeDuplicates("aab", 2);
    expected = "b";
    Assert.assertEquals(expected, actual);

    actual = StringMania.removeDuplicates("abcd", 2);
    expected = "abcd";
    Assert.assertEquals(expected, actual);

    actual = StringMania.removeDuplicates("aa", 2);
    expected = "";
    Assert.assertEquals(expected, actual);

    actual = StringMania.removeDuplicates("abbac", 2);
    expected = "c";
    Assert.assertEquals(expected, actual);

    actual = StringMania.removeDuplicates("rcabbace", 2);
    expected = "re";
    Assert.assertEquals(expected, actual);

    actual = StringMania.removeDuplicates("deeedbbcccbdaa", 3);
    expected = "aa";
    Assert.assertEquals(expected, actual);

    actual = StringMania.removeDuplicates("pbbcggttciiippooaais", 2);
    expected = "ps";
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void letterCombinationsOfGivenDigits() {
    List<String> actual = StringMania.letterCombinations("");
    List<String> expected = List.of();
    Assert.assertEquals(expected, actual);

    actual = StringMania.letterCombinations("2");
    expected = List.of("a", "b", "c");
    Assert.assertEquals(expected, actual);

    actual = StringMania.letterCombinations("23");
    expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
    Assert.assertEquals(expected, actual);

    actual = StringMania.letterCombinations("345");
    expected = List.of("dgj", "dgk", "dgl", "dhj", "dhk", "dhl", "dij", "dik", "dil", "egj", "egk", "egl", "ehj", "ehk", "ehl", "eij", "eik", "eil", "fgj", "fgk", "fgl", "fhj", "fhk", "fhl", "fij", "fik", "fil");
    Assert.assertEquals(expected, actual);
  }
}
