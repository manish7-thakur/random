import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Find a featured product which has most sales (determined by no. of occurance), if max-occ is a tie pick the
 * one which comes last in alphabetically sorted order.
 */
public class FeaturedProductFinder {
    public static String featuredProduct(List<String> products) {
        TreeMap<String, Integer> occMap = new TreeMap<>();
        int maxOcc = 1;
        String res = "";
        for (int i = 0; i < products.size(); i++) {
            int occ = occMap.getOrDefault(products.get(i), 0);
            occMap.put(products.get(i), ++occ);
            if (occ > maxOcc) {
                maxOcc = occ;
            }
        }
        if (maxOcc == 1) {
            return occMap.lastKey();
        } else {
            for (Map.Entry<String, Integer> entry : occMap.entrySet()) {
                if (entry.getValue() >= maxOcc) {
                    res = entry.getKey();
                }
            }
        }
        return res;
    }
}