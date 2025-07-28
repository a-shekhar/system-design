package com.anjoriarts.designpatterns.factoryMethod;

public abstract class PizzaStore {
        
    public Pizza orderPizza(String pizzaType){
        
        Pizza pizza = createPizza(pizzaType);
            
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType);
}
