import java.util.*;

public class RodCutter {
    public static int maxProfit(int[] prices, int n) {
    	char[][] path = new char[n+1][n+1];
        return findProfit(prices, n, 1, path);
    }

    static int findProfit(int[] prices, int n, int i, char[][] path) {
        if (n == 0 || i > n) {
            return 0;
        }
        int v1 = prices[i] + findProfit(prices, n - i, i, path);
        int v2 = findProfit(prices, n, i + 1, path);
        if(v1 > v2) {
        	path[n][i] = 'c'; //cut here
        	return v1;
        } else {
        	path[n][i] = 'n'; //no cut
        	return v2;
        }
    }

    static ArrayList<Integer> buildSoln(char[][] path, ArrayList<Integer> soln, int n, int i) {
    	if(n == 0 || i > n) {
    		return soln;
    	}
    	if(path[n][i] == 'c') {
    		soln.add(i);
    		return buildSoln(path, soln, n-i, i);
    	} else {
    		return buildSoln(path, soln, n, i+1);
    	}
    }

    public static ArrayList<Integer> maxProfitSoln(int[] prices, int n) {
    	char[][] path = new char[n+1][n+1];
    	findProfit(prices, n, 1, path);
    	ArrayList soln = new ArrayList<Integer>();
    	return buildSoln(path, soln, n, 1);
    }
}	