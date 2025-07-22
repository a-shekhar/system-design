package com.anjoriarts.designpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy{

    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }   

    @Override
    public void pay(int amount){
        System.out.println("Payment Done using credit card " + 
            this.creditCardNumber + " for amount " + amount);
    }
}
