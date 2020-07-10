package onlinestore.dao;

import onlinestore.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CategoryDAO {

    public static final String SELECT_CATEGORY = "select * from category";
    public static final String CREATE_CATEGORY = "INSERT INTO category (name) VALUES(?)";
    public static final String DELETE_CATEGORY = "DELETE FROM category WHERE id=?";
    public static final String UPDATE_CATEGORY = "UPDATE category SET name =? WHERE id=?";

    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery(SELECT_CATEGORY);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(name);
                categories.add(category);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }

    public void create(Category category) {
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(CREATE_CATEGORY)) {
            statement.setString(1, category.getName());
            statement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete(int id) {
     try (Connection connection = ConnectorDB.getConnection();
                 PreparedStatement statement = connection.prepareStatement(DELETE_CATEGORY)) {
                statement.setInt(1, id);
               statement.execute();
           } catch (SQLException e) {
                System.out.println(e.getMessage());
           }}

    public void delete(Category category) {
        delete(category.getId());
    }
    public void update(Category category) {
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_CATEGORY)) {
            statement.setString(1, category.getName());
            statement.setInt(2, category.getId());
            statement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}