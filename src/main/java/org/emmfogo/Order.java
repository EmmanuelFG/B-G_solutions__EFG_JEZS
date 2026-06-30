package org.emmfogo;

import org.emmfogo.paymentportal.PaymentMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private final String discount;
    private final int id;
    private final List<Product> products;
    private final PaymentMethod paymentMethod;
    private int totalPrice;

    public Order(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        Random r = new Random();
        id = r.nextInt(999);
        this.products = new ArrayList<>();
        discount = null;
        totalPrice = 0;

    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();

    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void showOrder() {
        System.out.println();
        System.out.println("Id: " + this.id);
        if (products.isEmpty()) {
            System.out.println("The order is empty");
        } else {

            products.stream().forEach(Product::showProduct);
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Payment Method: " + paymentMethod);
            System.out.println("Discount: ");
        }

    }
}
