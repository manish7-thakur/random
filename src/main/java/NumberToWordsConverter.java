public class NumberToWordsConverter {
  static String[] ones = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
  static String[] tens = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  static String[] tys = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Eighteen"};

  static public String numberToWords(int num) {
    StringBuilder b = new StringBuilder();
    if(num < 10) b.append(ones[num]);
    else if(num >= 10  && num < 20) b.append(tens[num % 10]);
    else if(num >= 20 && num < 100) {
      b.append(tys[num / 10]);
      int one = num % 10;
      if(one > 0) {
        b. append(" ");
        b.append(ones[one]);
      }
    }
    return b.toString();
  }
}
