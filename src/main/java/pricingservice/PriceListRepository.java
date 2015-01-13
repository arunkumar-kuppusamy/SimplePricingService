package pricingservice;

import java.util.HashMap;
import java.util.Map;

public class PriceListRepository {

    private Map<Integer, PriceList> priceListsInCategories = new HashMap<>();

    public void add(PriceList priceList, int category) {
        priceListsInCategories.put(category, priceList);
    }

    public PriceList get(int category) {
        return priceListsInCategories.get(category);
    }

    public void clear() {
        priceListsInCategories.clear();
    }
}
