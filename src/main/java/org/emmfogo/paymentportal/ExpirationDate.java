package org.emmfogo.paymentportal;

public class ExpirationDate {
    private int month;
    private int year;

    public ExpirationDate(int month, int year) {
        if (year < 26) throw new RuntimeException("the entered year is invalid");
        if (month < 1 || month > 12) throw new RuntimeException("the entered month is invalid");
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        String month = Integer.toString(this.month);
        String year = Integer.toString(this.year);
        String date = month + "/" + year;
        return date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
