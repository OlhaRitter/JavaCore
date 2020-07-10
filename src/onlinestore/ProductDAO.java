package onlinestore;

import onlinestore.dao.ConnectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public static final String FROM_PRODUCT_WHERE_CATEGORY_ID = "SELECT * from product WHERE category_id=?";
    public static final String FROM_PRODUCT = "SELECT * from product WHERE category_id=?";

    public List<Product> findAll(int categoryID) {
        List<Product> result = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(FROM_PRODUCT)) {
            statement.setInt(1,categoryID);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int rate = resultSet.getInt("rate");
                Product product = new Product(id, name, price, rate);
                result.add(product);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }}
