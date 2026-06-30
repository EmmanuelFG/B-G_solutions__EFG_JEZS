package org.emmfogo;

public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void showProduct() {
        System.out.printf("Producto %s, precio %d%n", this.name, this.price);
    }
}
