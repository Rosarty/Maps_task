package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProvider {
    public String getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id: ");
        return scanner.nextLine().trim();
    }

    public Map<Integer, Product> getData() {
        Map<Integer, Product> map = new HashMap<>();
        map.put(101, new Product("Bread", " 55 ", " 13,5 "));
        map.put(105, new Product("Banana", "30 ", " 14 "));
        map.put(103, new Product("Strawberry", " 71 ", " 35 "));
        map.put(106, new Product("Onion", " 35 ", " 3,5 "));
        return map;
    }
}
