package org.emmfogo;

import java.util.ArrayList;
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

    public void createProduct() {
        System.out.println("Product name: ");
        String name = sn.nextLine();
        sn.nextLine();
        int price = 0;
        System.out.println("Price");
        if (sn.hasNextInt()) {
            price = sn.nextInt();
            existingProducts.add(new Product(name, price));
            System.out.println("Product created succesfully");
        } else {
            System.err.println("Incorrect input");
        }
    }

    public void openStore() {
        int answer = 0;

        System.out.println("Welcome to B&G solutions ＼(^o^)／");

        while (answer != 6) {
            answer = 0;
            System.out.println("What would you like to do?: ");
            System.out.println("[1] Add a new product \n" +
                    "[2] Create a new order \n" +
                    "[3] Apply discount to an existing order \n" +
                    "[4] Show all unprocessed orders \n" +
                    "[5] Process all unprocessed orders \n" +
                    "[6] Close the store \n" +
                    "Input:");
            if (!sn.hasNextInt()) {
                System.err.println("Incorrect input");
                sn.nextLine();
            } else {
                answer = sn.nextInt();
            }

            switch (answer) {
                case 1:
                    createProduct();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thank you for using our store (＾∇＾)ﾉ");
                    break;
                default:
                    System.err.println("Incorrect input");
                    break;

            }

        }
    }


}
