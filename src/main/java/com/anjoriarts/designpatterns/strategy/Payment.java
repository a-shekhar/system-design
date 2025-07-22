package com.anjoriarts.designpatterns.strategy;

// Context class that uses the PaymentStrategy
public class Payment {

    private PaymentStrategy paymentStrategy;

    // setter method to change PaymentStrategy on the fly
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    // initititate payment
    public void initititatePayment(int amount){
        paymentStrategy.pay(amount);
    }
    
}
