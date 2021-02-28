import java.util.Arrays;

public class MinCoinFinder {

    public static int minCoinFinder(int num) {
        int[] mem = new int[num + 1];
        int res = CoinDeterminerRec(num, mem);
        return res;
    }

    static int CoinDeterminerRec(int num, int[] mem) {
        if (num <= 0) {
            return 0;
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
            coin11C = 1 + CoinDeterminerRec(num - 11, mem);
        }
        if (num >= 9) {
            coin9C = 1 + CoinDeterminerRec(num - 9, mem);
        }
        if (num >= 7) {
            coin7C = 1 + CoinDeterminerRec(num - 7, mem);
        }
        if (num >= 5) {
            coin5C = 1 + CoinDeterminerRec(num - 5, mem);
        }
        coin1C = 1 + CoinDeterminerRec(num - 1, mem);
        mem[num] = min(coin11C, coin9C, coin7C, coin5C, coin1C);
        return mem[num];
    }

    private static int min(int... values) {
        Arrays.sort(values);
        return values[0];
    }
}