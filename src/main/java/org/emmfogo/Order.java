package org.emmfogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private final List<Product> products;
    private final String discount;
    private final int id;
    private String paymentMethod;
    private int totalPrice;

    public Order(String paymentMethod) {
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
            System.out.println("El pedido se encuentra vacío");
        } else {
            products.stream().forEach(Product::showProduct);
            System.out.println("Precio Acumulado: " + totalPrice);
            System.out.println("Medio de pago: ");
            System.out.println("Descuento: ");
        }

    }
}
