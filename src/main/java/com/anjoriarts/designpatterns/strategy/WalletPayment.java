package com.anjoriarts.designpatterns.strategy;

public class WalletPayment implements PaymentStrategy{

    private String phoneNo;

    public WalletPayment(String phoneNo){
        this.phoneNo = phoneNo;
    }   

    @Override
    public void pay(int amount){
        System.out.println("Payment Done using wallet " + 
            this.phoneNo + " for amount " + amount);
    }
}
