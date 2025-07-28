package com.anjoriarts.designpatterns.abstractfactory;

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
