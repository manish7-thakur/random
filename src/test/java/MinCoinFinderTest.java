import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class MinCoinFinderTest {
   @Test
   public void findValue() {
       int actual = MinCoinFinder.minCoinFinder(1);
       int expected = 1;
       Assert.assertEquals(expected, actual);

       Map<Integer, Integer> expectedCoins = new HashMap<>();
       Map<Integer, Integer> actualCoins = MinCoinFinder.minCoinFinderVal(1);
       expectedCoins.put(1, 1);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(2);
       expected = 2;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(2);
       expectedCoins.clear();
       expectedCoins.put(1, 2);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(5);
       expected = 1;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(5);
       expectedCoins.clear();
       expectedCoins.put(5, 1);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(6);
       expected = 2;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(6);
       expectedCoins.clear();
       expectedCoins.put(5, 1);
       expectedCoins.put(1, 1);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(11);
       expected = 1;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(11);
       expectedCoins.clear();
       expectedCoins.put(11, 1);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(16);
       expected = 2;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(16);
       expectedCoins.clear();
       expectedCoins.put(11, 1);
       expectedCoins.put(5, 1);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(25);
       expected = 3;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(25);
       expectedCoins.clear();
       expectedCoins.put(11, 1);
       expectedCoins.put(9, 1);
       expectedCoins.put(5, 1);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(55);
       expected = 5;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(55);
       expectedCoins.clear();
       expectedCoins.put(11, 5);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(65);
       expected = 7;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(65);
       expectedCoins.clear();
       expectedCoins.put(11, 5);
       expectedCoins.put(9, 1);
       expectedCoins.put(1, 1);
       Assert.assertEquals(expectedCoins, actualCoins);

       actual = MinCoinFinder.minCoinFinder(98);
       expected = 10;
       Assert.assertEquals(expected, actual);

       actualCoins = MinCoinFinder.minCoinFinderVal(98);
       expectedCoins.clear();
       expectedCoins.put(11, 8);
       expectedCoins.put(9, 1);
       expectedCoins.put(1, 1);
       Assert.assertEquals(expectedCoins, actualCoins);
   }
}
