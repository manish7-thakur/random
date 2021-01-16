import java.util.*;

public class TripletSum {
    static class Pair {
        int i, j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object other) {
            Pair o = (Pair) other;
            return (this.i == o.i && this.j == o.j) || (this.i == o.j && this.j == o.i);
        }

        public boolean contains(int k) {
            return this.i == k || this.j == k;
        }
    }

    public static int countTriplets(int[] arr, int n) {
        int count = 0;
        Map<Pair, Integer> sMap = new HashMap<>();
        Set<String> tSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < n) {
                    sMap.put(new Pair(i,j), sum);
                }
            }
        }
        for (Map.Entry<Pair, Integer> e : sMap.entrySet()) {
            for (int i = 0; i < arr.length; i++) {
                Pair key = e.getKey();
                String tStr = mkString(key.i, key.j, i);
                if (!key.contains(i) && !tSet.contains(tStr) && e.getValue() + arr[i] < n) {
                    tSet.add(tStr);
                    count++;
                }
            }
        }
        return count;
    }

    private static String mkString(int i, int j, int k) {
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(i);
        list.add(j);
        list.add(k);
        Collections.sort(list);
        return list.toString();
    }
}