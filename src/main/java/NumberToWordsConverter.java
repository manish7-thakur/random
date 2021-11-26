public class NumberToWordsConverter {
  static String[] under20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  static String[] under100 = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

  static public String convert(int num) {
    if(num < 20) return under20[num];
    else if(num < 100) return under100[num / 10] + " " + convert(num % 10);
    else if(num < 1000) return convert(num / 100) + " Hundred " + convert(num % 100);
    else if(num < 1000000) return convert(num / 1000) + " Thousand " + convert(num % 1000);
    else if(num < 1000000000) return convert(num / 1000000) + " Million " + convert(num % 1000000);
    else return convert(num / 1000000000) + " Billion " + convert(num % 1000000000);
  }

  static public String numberToWords(int num) {
    if(num == 0) return "Zero";
    return convert(num).replace("  ", " ").trim();
  }
}
