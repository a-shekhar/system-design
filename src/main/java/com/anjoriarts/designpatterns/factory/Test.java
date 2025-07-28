package com.anjoriarts.designpatterns.factory;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza("cheese");
        store.orderPizza("pepperoni");
    }
}
