import org.junit.*;

public class DistinctSubsequenceFinderTest {
  @Test
  public void findDistinctSubsequences() {
    int actual = DistinctSubsequenceFinder.numDistinct("a", "a");
    int expected = 1;
    Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("ab", "a");
   expected = 1;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("ba", "a");
   expected = 1;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("aa", "a");
   expected = 2;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("ab", "ba");
   expected = 0;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("aba", "aa");
   expected = 1;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("abc", "ca");
   expected = 0;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("abab", "ab");
   expected = 3;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("babab", "bab");
   expected = 4;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("rabbbit", "rabbit");
   expected = 3;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("babgbag", "bag");
   expected = 5;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("babgbag", "bag");
   expected = 5;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("abbbabababababababbababbabababbab", "abasabxab");
   expected = 0;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("abbbabaabbababbaabababbbabaabababbaabababbabababababbababbabababbab", "abbbbababab");
   expected = 1098724087;
   Assert.assertEquals(expected, actual);

   actual = DistinctSubsequenceFinder.numDistinct("xslledayhxhadmctrliaxqpokyezcfhzaskeykchkmhpyjipxtsuljkwkovmvelvwxzwieeuqnjozrfwmzsylcwvsthnxujvrkszqwtglewkycikdaiocglwzukwovsghkhyidevhbgffoqkpabthmqihcfxxzdejletqjoxmwftlxfcxgxgvpperwbqvhxgsbbkmphyomtbjzdjhcrcsggleiczpbfjcgtpycpmrjnckslrwduqlccqmgrdhxolfjafmsrfdghnatexyanldrdpxvvgujsztuffoymrfteholgonuaqndinadtumnuhkboyzaqguwqijwxxszngextfcozpetyownmyneehdwqmtpjloztswmzzdzqhuoxrblppqvyvsqhnhryvqsqogpnlqfulurexdtovqpqkfxxnqykgscxaskmksivoazlducanrqxynxlgvwonalpsyddqmaemcrrwvrjmjjnygyebwtqxehrclwsxzylbqexnxjcgspeynlbmetlkacnnbhmaizbadynajpibepbuacggxrqavfnwpcwxbzxfymhjcslghmajrirqzjqxpgtgisfjreqrqabssobbadmtmdknmakdigjqyqcruujlwmfoagrckdwyiglviyyrekjealvvigiesnvuumxgsveadrxlpwetioxibtdjblowblqvzpbrmhupyrdophjxvhgzclidzybajuxllacyhyphssvhcffxonysahvzhzbttyeeyiefhunbokiqrpqfcoxdxvefugapeevdoakxwzykmhbdytjbhigffkmbqmqxsoaiomgmmgwapzdosorcxxhejvgajyzdmzlcntqbapbpofdjtulstuzdrffafedufqwsknumcxbschdybosxkrabyfdejgyozwillcxpcaiehlelczioskqtptzaczobvyojdlyflilvwqgyrqmjaeepydrcchfyftjighntqzoo", "rwmimatmhydhbujebqehjprrwfkoebcxxqfktayaaeheys");
   expected = 543744000;
   Assert.assertEquals(expected, actual);
  }
}
