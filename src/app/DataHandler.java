package app;

import java.util.Map;

public class DataHandler {
    public String getProduct(Map<Integer, Product> map,
                             String strId) {
        Integer id = Integer.parseInt(strId);

        if (map.containsKey(id)) {
            return "Product : id " + strId + ", " +
                    map.get(id).toString();
        } else return "No data!";
    }
}
