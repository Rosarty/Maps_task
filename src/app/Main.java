package app;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        DataHandler handler = new DataHandler();
        Outputer outputer = new Outputer();

        Map<Integer, Product> data = provider.getData();
        String prodData = handler.getProduct(data, provider.getId());

        outputer.getOutput(data);
        outputer.getOutput(prodData);
    }
}
