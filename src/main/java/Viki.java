import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Viki {

    public static int findNegativeAndPositive(int[] A) {
        Set<Integer> mem = new HashSet<>();
        for (int n : A) {
            mem.add(n);
        }
        for (int n : A) {
            if (mem.contains(-n)) return Math.abs(n);
        }
        return 0;
    }

    public static int breakChain(int[] A) {
        int i = 1;
        int j = A.length - 2;
        int res = Integer.MAX_VALUE;
        while (j - i > 1) {
            if (A[i] + A[j] < res) res = A[i] + A[j];
            if (A[i] > A[j]) i++;
            else j--;
        }
        return res;
    }

    public static int seatFamily(int N, String S) {
        int res = 0;
        Set<String> reserved = new HashSet<>(Arrays.asList(S.split(" ")));
        for (int i = 1; i <= N; i++) {
            if (!reserved.contains(i + "B") && !reserved.contains(i + "C") && !reserved.contains(i + "D") && !reserved.contains(i + "E")) {
                reserved.add(i + "B");
                reserved.add(i + "C");
                reserved.add(i + "D");
                reserved.add(i + "E");
                res++;
            }
            if ((!reserved.contains(i + "F") && !reserved.contains(i + "G") && !reserved.contains(i + "H") && !reserved.contains(i + "J"))) {
                reserved.add(i + "F");
                reserved.add(i + "G");
                reserved.add(i + "H");
                reserved.add(i + "J");
                res++;
            }
            if (!reserved.contains(i + "D") && !reserved.contains(i + "E") && !reserved.contains(i + "F") && !reserved.contains(i + "G"))
                res++;
        }
        return res;
    }
}
