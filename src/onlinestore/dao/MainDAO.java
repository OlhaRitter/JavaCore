package onlinestore.dao;

import onlinestore.Category;
import onlinestore.Product;
import onlinestore.ProductDAO;

import java.util.List;

public class MainDAO {
    public static void main(String[] args) {
        CategoryDAO categoryDAO = new CategoryDAO();
        Category category = new Category(5,"House where");

        categoryDAO.update(category);

        List<Category> categories = categoryDAO.findAll();
        System.out.println(categories);

        /*ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.findAll(1);
        System.out.println(products);
    }*/
//categoryDAO.delete(6);

}}
