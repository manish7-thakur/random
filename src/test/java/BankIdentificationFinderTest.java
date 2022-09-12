import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BankIdentificationFinderTest {
    @Test
    public void testCreditCardRange() {

        BankIdentificationFinder.CardTypeCache cardTypeCache = BankIdentificationFinder.buildCache(List.of(
                new BankIdentificationFinder.BinRange("500000000000", "599999999999", "mc")
        ));
        Assert.assertEquals("mc", cardTypeCache.get("5555444433331111"));
        Assert.assertEquals("mc", cardTypeCache.get("5000000000001111"));
        Assert.assertNull(cardTypeCache.get("6555444433331111"));

        cardTypeCache = BankIdentificationFinder.buildCache(List.of(
                new BankIdentificationFinder.BinRange("500000000000", "599999999999", "mc"),
                new BankIdentificationFinder.BinRange("4000000000", "41999999999", "visa"),
                new BankIdentificationFinder.BinRange("650000000000", "658999999999", "discover")
        ));
        Assert.assertEquals("mc", cardTypeCache.get("5555444433331111"));
    }
}