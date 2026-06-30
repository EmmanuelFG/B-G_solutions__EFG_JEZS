package org.emmfogo.paymentportal;

public class Paypal {
    private final String account;
    private final String password;

    public Paypal(String account, String password) {
        validatorAccount(account);
        this.account = account;
        this.password = password;
    }

    public void validatorAccount(String account) {
        for (int i = 0; i < account.length(); i++) {
            if (account.charAt(i) == '@') {
                return;
            }
        }
        throw new RuntimeException("Invalid email");
    }

    public String getAccount() {
        return account;
    }

}
