package lesson16;

import onlinestore.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>( );
        products.add(new Product("Doll",25, 4));
        products.add(new Product("Cube",70, 10));
        products.add(new Product("Car",150, 7));
        products.add(new Product("Barbie",17, 3));

        List <Product> priceofProduct = getPriceofProduct(products);
        System.out.println(products);
        System.out.println(priceofProduct);
    }

    private static List<Product> getPriceofProduct( List <Product> products) {
        List <Product> priceofProduct = new ArrayList();
        Iterator <Product> iterator = products.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if (product.getPriceOfProduct()>70){
                iterator.remove();
                priceofProduct.add(product);
            }
        }
        return priceofProduct;
    }
   /* private static List<Product> getPriceofProduct2( List <Product> products) {
        List <Product>){
    if
        }
        products.removeIf(Product p) -> ( return getpriceofProduct() > 100;
        return b;))*/


}
