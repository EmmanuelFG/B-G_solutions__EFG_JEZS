package org.emmfogo.paymentportal;

import org.emmfogo.Order;

import java.util.Scanner;

import static org.emmfogo.paymentportal.PaymentMethod.CARD;
import static org.emmfogo.paymentportal.PaymentMethod.PAYPAL;

public class PaymentPortal {
    private Order order;
    private PaymentMethod paymentMethod;
    private static final Scanner scanner = new Scanner(System.in);

    public PaymentPortal(Order order, PaymentMethod paymentMethod) {
        if (paymentMethod == CARD) {
            System.out.println("please enter the numbers, without dots or spaces");
            String number = input("enter your card number");
            int csv = Integer.parseInt(input("enter the csv of your card"));
            int year = Integer.parseInt(input("enter the expiration year of your card"));
            int month = Integer.parseInt(input("enter the expiration month of your card"));
            ExpirationDate date = new ExpirationDate(month, year);
            Card card = new Card(number, csv, date);
            //Emma no revise su rama :) order.total seria como el total a cobrar.
            System.out.println("Successful payment of" + "order.total" + "with your card ending in" + card.getNumber()); //
        } else if (paymentMethod == PAYPAL) {
            String account = input("Enter the email registered in your paypal account");
            String password = input("Enter your password");
            System.out.println("Successful payment of" + "order.total" + "with your payapal account");
        }
    }

    public static String input(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
