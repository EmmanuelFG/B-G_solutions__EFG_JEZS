package org.emmfogo.discounts;

import org.emmfogo.Order;
import org.emmfogo.paymentportal.ExpirationDate;

public class CouponFixed extends Coupon {
    private final int value;

    public CouponFixed(int uses, ExpirationDate validity, int value) {

        super(uses, validity);
        this.value = value;
    }

    public void apply(Order order){
        int total = order.getTotalPrice() - value;
        order.setTotalPrice(total);
    }
}
