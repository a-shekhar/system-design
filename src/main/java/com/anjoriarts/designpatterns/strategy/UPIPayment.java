package com.anjoriarts.designpatterns.strategy;

public class UPIPayment implements PaymentStrategy{

    private String vpa;

    public UPIPayment(String vpa){
        this.vpa = vpa;
    }   

    @Override
    public void pay(int amount){
        System.out.println("Payment Done using UPI " + 
            this.vpa + " for amount " + amount);
    }
}
