package com.anjoriarts.designpatterns.strategy;

public class DebitCardPayment implements PaymentStrategy{

    private String debitCardNumber;

    public DebitCardPayment(String debitCardNumber){
        this.debitCardNumber = debitCardNumber;
    }   

    @Override
    public void pay(int amount){
        System.out.println("Payment Done using debit card " + 
            this.debitCardNumber + " for amount " + amount);
    }
}
