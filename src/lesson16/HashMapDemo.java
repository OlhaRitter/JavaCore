package lesson16;

import onlinestore.Product;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Product> products = new HashMap<>();
        products.put("Doll",new Product("Doll", 25, 4));
        products.put("Cube",new Product("Cube", 70, 10));
        products.put("Car",new Product("Car", 150, 7));
        products.put("Barbie",new Product("Barbie", 17, 3));

        printKeys(products);
        printValues(products);
        printKeyValue(products);
    }

    private static void printKeyValue(Map<String, Product> products) {
        Set<Map.Entry<String, Product>> set = products.entrySet();
        for (Map.Entry<String, Product> entry:set){
            System.out.println("Key is " + entry.getKey()+ " value is "+ entry.getValue());
        }
    }

    private static void printValues(Map<String, Product> products) {
        Collection<Product> values = products.values();
        values.forEach(v-> System.out.println("Values is "+v));
    }

    private static void printKeys(Map<String, Product> products) {
        Set<String> keys = products.keySet();
        keys. forEach(k-> System.out.println("Key is " + k));
    }

}
