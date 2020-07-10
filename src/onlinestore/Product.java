package onlinestore;

public class Product {
    private int id;
    private String name;
    private int price;
    private int rate;

    public Product(int id, String name, int price, int rate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public Product(String name, int price, int rate) {
             this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getNameOfProduct() {
        return name;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.name = nameOfProduct;
    }

    public int getPriceOfProduct() {
        return price;
    }

    public void setPriceOfProduct(int priceOfProduct) {
        this.price = price;
    }

    public int getRatingOfProduct() {
        return rate;
    }

    public void setRatingOfProduct(int ratingOfProduct) {
        this.rate = ratingOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameOfProduct='" + name + '\'' +
                ", priceOfProduct=" + price +
                ", ratingOfProduct=" + rate +
                '}';
    }
}