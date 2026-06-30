package org.emmfogo;

import org.emmfogo.paymentportal.PaymentMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private final List<Product> products;
    private final String discount;
    private final int id;
    private PaymentMethod paymentMethod;
    private int totalPrice;

    public Order(PaymentMethod paymentMethod) {
        Random r = new Random();
        id = r.nextInt(999);
        this.products = new ArrayList<>();
        discount = null;

    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();

    }


    public void showOrder() {
        System.out.println(this.id);
        if (products.isEmpty()) {
            System.out.println("The order is empty");
        } else {
            products.stream().forEach(Product::showProduct);
            System.out.println("Price: " + totalPrice);
            System.out.println("Payment Method: ");
            System.out.println("Discount: ");
        }

    }
}
