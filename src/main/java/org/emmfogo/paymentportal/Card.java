package org.emmfogo.paymentportal;

public class Card {
    private final String number;
    private final int csv;
    private final ExpirationDate date;

    public Card(String number, int csv, ExpirationDate date) {
        validatorPayment(number, csv);
        this.number = number;
        this.csv = csv;
        this.date = date;
    }

    public void validatorPayment(String number, int csv) {
        if (csv < 100 || csv > 999) throw new RuntimeException("invalid csv");
        if (number.length() != 16) throw new RuntimeException("the number must be at least 16 digits");
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c < '0' || c > '9') throw new RuntimeException("invalid number");
        }
        switch (number.charAt(0)) {
            case '1':
                System.out.println("welcome to your airline corporate card");
                break;
            case '2':
                throw new RuntimeException("Invalid card");
            case '3':
                System.out.println("welcome your american express or dinner club card");
                break;
            case '4':
                System.out.println("welcome your visa card");
                break;
            case '5':
                System.out.println("welcome your mastercard card");
                break;
            case '6':
                System.out.println("welcome your maestro card");
                break;
            case '9':
                System.out.println("welcome your government card");
                break;
            default:
                System.out.println("unknown card");
                break;
        }
    }

    public String getNumber() {
        return number.substring(12);
    }
}
