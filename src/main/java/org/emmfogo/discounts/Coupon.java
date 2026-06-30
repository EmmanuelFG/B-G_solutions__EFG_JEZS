package org.emmfogo.discounts;
import org.emmfogo.paymentportal.ExpirationDate;
import java.util.Random;

public class Coupon {

    private final String code;
    private final int uses;
    private final ExpirationDate validity;
    private final int value;

    public Coupon(int value, int uses, ExpirationDate validity){
        this.code = codeGenerator();
        this.validity = validity;
        this.uses = uses;
        this.value = value;
    }

    public String codeGenerator(){
        String characteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        String code = "";

        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(characteres.length());
            code += characteres.charAt(indice);
        }
        return code;
    }

    public String getCode() {
        return code;
    }

}
