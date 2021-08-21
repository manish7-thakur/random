public class NumberValidator {
    public static boolean isNumber(String s) {
        if (s.isEmpty()) return false;
        if (s.contains("e")) {
            String[] parts = s.split("e");
            if (parts.length != 2) return false;
            return isValidDecimal(parts[0]) && isValidDecimal(parts[1]);
        }
        if (!isValidDecimal(s)) {
            return false;
        }
        return true;
    }

    static boolean isValidDecimal(String s) {
        if(s.isEmpty()){
          return false;
        }
        boolean containsDot = false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) continue;
            else if (s.charAt(i) == '.') {
                if (containsDot) return false;
                containsDot = true;
            } else if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
}
