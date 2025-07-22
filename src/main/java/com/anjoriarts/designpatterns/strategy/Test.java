package com.anjoriarts.designpatterns.strategy;

public class Test {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.setPaymentStrategy(new CreditCardPayment("1234"));
        payment.initititatePayment(4500);

        payment.setPaymentStrategy(new DebitCardPayment("1345"));
        payment.initititatePayment(4600);

        payment.setPaymentStrategy(new UPIPayment("1234@upi"));
        payment.initititatePayment(4700);


        payment.setPaymentStrategy(new WalletPayment("1234567890"));
        payment.initititatePayment(4800);
    }
}
