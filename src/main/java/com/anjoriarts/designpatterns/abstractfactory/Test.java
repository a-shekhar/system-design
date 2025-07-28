package com.anjoriarts.designpatterns.abstractfactory;

public class Test {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("pepperoni");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("pepperoni");
    }
}
