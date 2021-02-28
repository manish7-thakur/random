import java.util.Arrays;

public class MinCoinFinder {

    public static int minCoinFinder(int num) {
        int[] mem = new int[num + 1];
        int res = CoinDeterminerRec(num, 0, mem);
        return res;
    }

    static int CoinDeterminerRec(int num, int count, int[] mem) {
        if (num <= 0) {
            return count;
        }
        if (mem[num] != 0) {
            return mem[num];
        }

        int coin11C = Integer.MAX_VALUE;
        int coin9C = Integer.MAX_VALUE;
        int coin7C = Integer.MAX_VALUE;
        int coin5C = Integer.MAX_VALUE;
        int coin1C = Integer.MAX_VALUE;
        if (num >= 11) {
            coin11C = CoinDeterminerRec(num - 11, count + 1, mem);
        }
        if (num >= 9) {
            coin9C = CoinDeterminerRec(num - 9, count + 1, mem);
        }
        if (num >= 7) {
            coin7C = CoinDeterminerRec(num - 7, count + 1, mem);
        }
        if (num >= 5) {
            coin5C = CoinDeterminerRec(num - 5, count + 1, mem);
        }
        coin1C = CoinDeterminerRec(num - 1, count + 1, mem);
        mem[num] = min(coin11C, coin9C, coin7C, coin5C, coin1C);
        return mem[num];
    }

    private static int min(int... values) {
        Arrays.sort(values);
        return values[0];
    }
}