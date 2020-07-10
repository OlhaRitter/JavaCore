package onlinestore;

import onlinestore.dao.CategoryDAO;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static final Scanner SCANNER = new Scanner(System.in);
public static final CategoryDAO CATEGORY_DAO = new CategoryDAO();
    public static final ProductDAO PRODUCT_DAO = new ProductDAO();
    public static void main(String[] args) {
        System.out.println("Enter options: " + Arrays.toString(Operations.values()));
        String value = SCANNER.next();
        Operations operations = Operations.valueOf(value);
        switch (operations) {
            case SHOW_CATALOGS:
                showCatalogs();
                break;
            case BUY:
                buy();
                break;
            case LOGIN:
                login();
                break;
            case SHOW_PRODUCTS:
                showProducts();
                break;
        }
    }

    public static void showCatalogs() {
       List<Category> categories =CATEGORY_DAO.findAll();
        System.out.println(categories);
    };
    public static void showProducts() {
        System.out.println("Enterb category id ");
        if(SCANNER.hasNextInt()){
            int categoryid= SCANNER.nextInt();
            List<Product>products=PRODUCT_DAO.findAll(categoryid);
            System.out.println(products);
        }else {
            System.out.println("not an INT");
        }
    };

    public static void login() {

    };

    public static void buy() {
    };
}
