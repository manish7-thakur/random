public class NumberValidator {
    public static boolean isNumber(String s) {
        if (s.isEmpty()) return false;
        if (s.contains("e")) {
            String[] parts = s.split("e");
            if (parts.length != 2) return false;
            return isValidDecimal(parts[0], false) && isValidDecimal(parts[1], true);
        } else if(s.contains("E")) {
          String[] parts = s.split("E");
          if (parts.length != 2) return false;
          return isValidDecimal(parts[0], false) && isValidDecimal(parts[1], true);
        }
        return isValidDecimal(s, false);
    }

    static boolean isValidDecimal(String s, boolean isexp) {
        if(s.isEmpty()){
          return false;
        }
        boolean containsDot = false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) continue;
            else if (s.charAt(i) == '.') {
                if(isexp) return false;
                if (containsDot) return false;
                containsDot = true;
            } else if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
}
