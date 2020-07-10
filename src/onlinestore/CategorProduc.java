package onlinestore;

import java.util.Scanner;

public class CategorProduc {
    public static void main(String[] args) {
        Product product1 = new Product("milk", 32, 3);
        Product product2 = new Product("potato", 15, 4);
        Product product3 = new Product("cucumber", 25, 6);
        Product product4 = new Product("pepper", 17, 2);

        Product[] product = {product1, product2, product3, product4};
       Category category = new Category("Food", product);
        Basket basket = new Basket(product);
    }
    void compareNamber(){
        System.out.println("");
    };
}
