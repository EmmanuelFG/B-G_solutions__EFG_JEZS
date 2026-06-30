package org.emmfogo;

public class Product {
    private String name;
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void showProduct() {
        System.out.printf("Product %s, price %d%n", this.name, this.price);
    }
}
