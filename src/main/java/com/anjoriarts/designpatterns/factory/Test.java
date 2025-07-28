package com.anjoriarts.designpatterns.factory;

public class Test {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(pizzaFactory);
        store.orderPizza("cheese");
        store.orderPizza("pepperoni");
    }
}
