import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinCoinFinder {

    public static int minCoinFinder(int num) {
        int[] mem = new int[num + 1];
        char[][] path = new char[12][num + 1];
        int res = CoinDeterminerRec(num, mem, path);
        return res;
    }

    public static Map<Integer, Integer> minCoinFinderVal(int num) {
        int[] mem = new int[num + 1];
        char[][] path = new char[12][num + 1];
        CoinDeterminerRec(num, mem, path);
        Map<Integer, Integer> coins = findCoins(path, num);
        return coins;
    }

    static Map<Integer, Integer> findCoins(char[][] path, int num) {
        Map<Integer, Integer> coins = new HashMap<>();
        int[] coinsVal = {11, 9, 7, 5, 1};
        int coinIdx = 0;
        while (num > 0) {
            if (path[coinsVal[coinIdx]][num] == 't') {
                int i = coins.getOrDefault(coinsVal[coinIdx], 0);
                coins.put(coinsVal[coinIdx], ++i);
                num -= coinsVal[coinIdx];
            } else {
                coinIdx++;
            }
        }
        return coins;
    }

    static int CoinDeterminerRec(int num, int[] mem, char[][] path) {
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
            coin11C = 1 + CoinDeterminerRec(num - 11, mem, path);
        }
        if (num >= 9) {
            coin9C = 1 + CoinDeterminerRec(num - 9, mem, path);
        }
        if (num >= 7) {
            coin7C = 1 + CoinDeterminerRec(num - 7, mem, path);
        }
        if (num >= 5) {
            coin5C = 1 + CoinDeterminerRec(num - 5, mem, path);
        }
        coin1C = 1 + CoinDeterminerRec(num - 1, mem, path);
        mem[num] = min(coin11C, coin9C, coin7C, coin5C, coin1C);
        if (mem[num] == coin11C) {
            path[11][num] = 't';
        } else if (mem[num] == coin9C) {
            path[9][num] = 't';
        } else if (mem[num] == coin7C) {
            path[7][num] = 't';
        } else if (mem[num] == coin5C) {
            path[5][num] = 't';
        } else {
            path[1][num] = 't';
        }
        return mem[num];
    }

    private static int min(int... values) {
        Arrays.sort(values);
        return values[0];
    }
}