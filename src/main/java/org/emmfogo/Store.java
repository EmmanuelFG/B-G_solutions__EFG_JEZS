package org.emmfogo;

import java.util.List;
import java.util.Scanner;


public class Store {
    List<Order> unprocessedOrders;
    List<Product> existingProducts;

    Scanner sn = new Scanner(System.in);

    public void createProduct() {
        System.out.println("Product name: ");
        String name = sn.nextLine();
        int price = 0;
        sn.nextLine();

        if (sn.hasNextInt()) {
            price = sn.nextInt();
        } else {
            System.err.println("Incorrect input");
        }

    }

    public void openStore() {
        int answer = 0;

        System.out.println("Welcome to B&G solutions");

        while (answer != 6) {
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
        }
    }


}
