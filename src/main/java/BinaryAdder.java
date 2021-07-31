import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BinaryAdder {
    static int[] add(int[] a, int[] b) {
        int carr = 0;
        int[] res = new int[b.length + 1];
        for (int i = a.length - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carr;
            res[i + 1] = sum % 2;
            if (sum >= 2) {
                carr = 1;
            } else {
                carr = 0;
            }
        }
        if (carr == 1) {
            res[0] = 1;
        }
        return res;
    }

    public static String add(String input) {
        String[] ops = input.split(",");
        String op1 = ops[0];
        String op2 = ops[1];
        int[] res = new int[op1.length() > op2.length() ? op1.length() : op2.length()];
        int carry = 0;
        int i = op1.length() - 1;
        int j = op2.length() - 1;
        int r = res.length - 1;
        while (i >= 0 && j >= 0) {
            int sum = Character.digit(op1.charAt(i), 2) + Character.digit(op2.charAt(j), 2) + carry;
            res[r] = sum % 2;
            carry = sum >= 2 ? 1 : 0;
            i--;
            j--;
            r--;
        }
        while (i >= 0) {
            int sum = Character.digit(op1.charAt(i), 2) + carry;
            res[r] = sum % 2;
            carry = sum >= 2 ? 1 : 0;
            i--;
            j--;
            r--;
        }
        while (j >= 0) {
            int sum = Character.digit(op2.charAt(j), 2) + carry;
            res[r] = sum % 2;
            carry = sum >= 2 ? 1 : 0;
            i--;
            j--;
            r--;
        }
        String binString = Arrays.toString(res).replace("[", "").replace("]", "").replace(", ", "");
        return carry == 1 ? "1" + binString : binString;
    }

    public static void main(String[] args) throws IOException {
        String line = "15.94;16.00";
        String[] inp = line.split(";");
        Double pp = Double.valueOf(inp[0]);
        Double ch = Double.valueOf(inp[1]);
        ArrayList<String> res = new ArrayList();
        if (pp > ch) {
            res.add("ERROR");
        } else if (pp == ch) {
            res.add("ZERO");
        } else {
            Double returnVal = ch - pp;
            int dollars = returnVal.intValue();
            DecimalFormat format = new DecimalFormat(".##");
            Double cents = Double.parseDouble(format.format(returnVal));
            System.out.println(Math.floor(9.62 * 100) / 100);
            System.out.println(String.format("%1$", "00"));
            while (dollars > 0) {
                if (dollars >= 50) {
                    res.add("FIFTY");
                    dollars -= 50;
                } else if (dollars >= 20) {
                    res.add("TWENTY");
                    dollars -= 20;
                } else if (dollars >= 10) {
                    res.add("TEN");
                    dollars -= 10;
                } else if (dollars >= 5) {
                    res.add("FIVE");
                    dollars -= 5;
                } else if (dollars >= 2) {
                    res.add("TWO");
                    dollars -= 2;
                } else {
                    res.add("ONE");
                    dollars -= 1;
                }
            }
            final double THRESHOLD = .00;
            while (cents > THRESHOLD) {
                if (cents >= .50) {
                    res.add("HALF DOLLAR");
                    cents -= .50;
                } else if (cents >= .25) {
                    res.add("QUARTER");
                    cents -= .25;
                } else if (cents >= .10) {
                    res.add("DIME");
                    cents -= .10;
                } else if (cents >= .05) {
                    res.add("NICKEL");
                    cents -= .05;
                } else {
                    res.add("PENNY");
                    cents -= .01;
                }
                cents = Double.parseDouble(format.format(cents));
            }
        }
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        StringBuilder b = new StringBuilder();
        for (String value : res) {
            b.append(value);
            b.append(",");
        }
        String rsString = "";
        if (b.length() > 0)
            rsString = b.substring(0, b.length() - 1);
        System.out.println(rsString);
    }
}
