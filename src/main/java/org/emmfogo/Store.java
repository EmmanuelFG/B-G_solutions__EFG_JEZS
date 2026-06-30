package org.emmfogo;

import org.emmfogo.paymentportal.PaymentMethod;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Store {
    List<Order> unprocessedOrders;
    List<Product> existingProducts;
    Scanner sn = new Scanner(System.in);

    public Store() {
        unprocessedOrders = new ArrayList<>();
        existingProducts = new ArrayList<>();
    }

    public Product createProduct() {
        System.out.println("Product name: ");
        String name = sn.nextLine();

        int price = 0;
        System.out.println("Price");
        try {
            price = sn.nextInt();
            sn.nextLine();
            System.out.println("Product created succesfully");
            return new Product(name, price);
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return null;
        }

    }

    public void createOrder() {
        int answer = 0;
        System.out.println("Payment method \n" +
                "[1] Card \n" +
                "[2] Paypal \n" +
                "Input: ");

        if (!sn.hasNextInt()) {
            System.err.println("Incorrect input");
            sn.nextLine();
        } else {
            answer = sn.nextInt();
        }
        if (answer > 2 || answer < 1) {
            System.err.println("Incorrect input");
        } else {
            PaymentMethod paymentMethod = (answer == 1) ? PaymentMethod.CARD : PaymentMethod.PAYPAL;
            Order order = new Order(paymentMethod);

            System.out.println("How many products do you want to add?");
            Integer amount = verifyNumber();
            sn.nextLine();
            if (amount < 0 || amount >= 100) {
                System.err.println("Incorrect input");
            } else {
                for (int i = 0; i < amount; i++) {
                    Product product = createProduct();
                    if (product != null) {
                        order.addProduct(product);
                    }
                }
            }
            unprocessedOrders.add(order);
        }

    }

    public Integer verifyNumber() {
        if (!sn.hasNextInt()) {
            System.err.println("Incorrect input");
            sn.nextLine();
            return null;
        } else {
            return sn.nextInt();
        }
    }

    public void applyDiscount() {
    }


    public void showOrders() {
        if (unprocessedOrders.isEmpty()) {
            System.out.println("There are no unprocessed orders");
        } else unprocessedOrders.stream().forEach(Order::showOrder);
    }

    public void processAll() {

    }

    public void openStore() {
        int answer = 0;

        System.out.println("Welcome to B&G solutions ＼(^o^)／");

        while (answer != 5) {
            answer = 0;
            System.out.println("What would you like to do?: ");
            System.out.println("[1] Create a new order \n" +
                    "[2] Apply discount to an existing order \n" +
                    "[3] Show all unprocessed orders \n" +
                    "[4] Process all unprocessed orders \n" +
                    "[5] Close the store \n" +
                    "Input:");
            if (!sn.hasNextInt()) {
                System.err.println("Incorrect input");
                sn.nextLine();
            } else {
                answer = sn.nextInt();
            }

            switch (answer) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    applyDiscount();
                    break;
                case 3:
                    showOrders();
                    break;
                case 4:
                    processAll();
                    break;
                case 5:
                    System.out.println("Thank you for using our store (＾∇＾)ﾉ");
                    break;
                default:
                    System.err.println("Incorrect input");
                    break;

            }

        }
    }


}
