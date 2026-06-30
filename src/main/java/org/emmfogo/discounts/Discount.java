package org.emmfogo.discounts;
import org.emmfogo.Product;

public class Discount {
    private final int percentage;
    private Product product;

    public Discount(int percentage, Product product){
        if(percentage<0 || percentage>100) throw new RuntimeException("The discount percentage applied cannot exceed 100%");
        this.percentage = percentage;
        this.product = product;
    }

    public void apply(){
        int discount = (percentage/100)*product.getPrice();
        int total = product.getPrice() - discount;
        System.out.println(product.getName()+ " has a discount of "+percentage+"%");
        product.setPrice(total);
    }
}
