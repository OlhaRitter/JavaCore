package onlinestore;

import java.util.Arrays;
import java.util.Objects;

public class Category {
    private int id;
    private String name;
    private Product product[];

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(String name, Product[] product) {
        this.name = name;
        this.product = product;
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id &&
                Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}
