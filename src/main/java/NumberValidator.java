public class NumberValidator {
    public static boolean isNumber(String s) {
        if (s.isEmpty()) return false;
        int expIdx = s.indexOf('e');
        if (expIdx != -1) {
            return isValidDecimal(s.substring(0, expIdx), false) && isValidDecimal(s.substring(expIdx + 1), true);
        }
        expIdx = s.indexOf('E');
        if(expIdx != -1) {
          return isValidDecimal(s.substring(0, expIdx), false) && isValidDecimal(s.substring(expIdx + 1), true);
        }
        return isValidDecimal(s, false);
    }

    static boolean isValidDecimal(String s, boolean isexp) {
        if(s.isEmpty() || (s.length() == 1 && !(s.charAt(0) >= '0' && s.charAt(0) <= '9'))) {
          return false;
        }
        boolean containsDot = false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) continue;
            else if (s.charAt(i) == '.') {
                if(isexp) return false;
                if (containsDot) return false;
                if(i == s.length() - 1 && !(s.charAt(i-1) >= '0' && s.charAt(i-1) <= '9')) return false;
                containsDot = true;
            } else if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
}
