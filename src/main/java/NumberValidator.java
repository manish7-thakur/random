public class NumberValidator {
    public static boolean isNumber(String s) {
        if (s.isEmpty() || (s.length() == 1 && !Character.isDigit(s.charAt(0)))) {
            return false;
        }
        boolean containsDot = false;
        boolean isexp = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '+':
                case '-':
                    if (i == 0) continue;
                    char previous = s.charAt(i - 1);
                    if (!(Character.toLowerCase(previous) == 'e') || i == s.length() - 1) return false;
                    break;
                case '.':
                    if (isexp || containsDot) return false;
                    if (i == 0 && !Character.isDigit(s.charAt(i + 1)) || i == s.length() - 1 && !Character.isDigit(s.charAt(i - 1)))
                        return false;
                    containsDot = true;
                    break;
                case 'e':
                case 'E':
                    if (i == 0 || isexp || i == s.length() - 1) return false;
                    previous = s.charAt(i - 1);
                    if (!(Character.isDigit(previous) || previous == '.')) return false;
                    isexp = true;
                    break;
                default:
                    if (!Character.isDigit(c)) return false;
                    break;
            }
        }
        return true;
    }
}
