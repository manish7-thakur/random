import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

class BankIdentificationFinder {

    /**
     * An entity to hold bin range details. A bin range is a pair of 12 digit numbers that
     * mark the boundaries of the range which is maped to other bin range properties such
     * as a card type. The range boundaries are inclusive.
     */
    static final class BinRange {
        final String start;
        final String end;
        final String cardType;

        BinRange(String start, String end, String cardType) {
            this.start = start;
            this.end = end;
            this.cardType = cardType;
        }
    }

    interface CardTypeCache {
        /**
         * @param cardNumber 12 to 23 digit card number.
         * @return the card type for this cardNumber or null if the card number does not
         * fall into any valid bin ranges.
         */
        String get(String cardNumber);
    }

    static class MapBasedCardTypeCache implements CardTypeCache {

        public MapBasedCardTypeCache(List<BinRange> binRanges) {
            for (BinRange bin : binRanges) {
                prefixLength = Math.min(prefixLength, bin.start.length());
                map.put(bin.start, bin);
            }
        }

        private NavigableMap<String, BinRange> map = new TreeMap<>();
        private int prefixLength = Integer.MAX_VALUE;

        @Override
        public String get(String cardNumber) {
            String key = cardNumber.substring(0, prefixLength);
            String floor = map.floorKey(key);
            String ceil = map.ceilingKey(key);
            if (floor != null) {
                BinRange bin = map.get(floor);
                if (isBinMatch(cardNumber, bin)) return bin.cardType;

            }

            if (ceil != null) {
                BinRange bin = map.get(ceil);
                if (isBinMatch(cardNumber, bin)) return bin.cardType;

            }
            return null;
        }

        public boolean isBinMatch(String cardNo, BinRange bin) {
            return cardNo.compareTo(bin.start) >= 0 && cardNo.compareTo(bin.end) <= 0;
        }
    }

    /**
     * @param binRanges the list of card bin ranges to build a cache from.
     * @return an implementation of CardTypeCache.
     */
    public static CardTypeCache buildCache(List<BinRange> binRanges) {
        return new MapBasedCardTypeCache(binRanges);
    }

}