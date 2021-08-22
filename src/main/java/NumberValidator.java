public class NumberValidator {
    public static boolean isNumber(String s) {
        if (s.isEmpty() || (s.length() == 1 && !(s.charAt(0) >= '0' && s.charAt(0) <= '9'))) {
            return false;
        }
        boolean containsDot = false;
        boolean isexp = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (i == 0) continue;
                if (!(s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E') || i == s.length() - 1) return false;
            } else if (s.charAt(i) == '.') {
                if (isexp || containsDot) return false;
                if ((i == 0 && !(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'))
                        || (i == s.length() - 1 && !(s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9'))) return false;
                containsDot = true;
            } else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (i == 0 || isexp || i == s.length() - 1) return false;
                if (!((s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9') || s.charAt(i - 1) == '.')) return false;
                isexp = true;
            } else if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
}