package org.emmfogo.discounts;
import org.emmfogo.Order;
import org.emmfogo.paymentportal.ExpirationDate;

public class CouponPercentage extends Coupon {
    private final int percentage;

    public CouponPercentage(int uses, ExpirationDate validity, int percentage) {
        super(uses, validity);
        this.percentage=percentage;
    }

    public void apply(Order order){
        int discount = (percentage/100)* order.getTotalPrice();
        int total = order.getTotalPrice() - discount;
        System.out.println("The order with id"+ order.getId() + " has a discount of "+percentage+"%");
        order.setTotalPrice(total);
    }
}
