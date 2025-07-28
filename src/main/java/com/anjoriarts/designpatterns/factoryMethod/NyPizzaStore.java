package com.anjoriarts.designpatterns.factoryMethod;

import com.anjoriarts.designpatterns.factoryMethod.Pizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        if(pizzaType.equals("cheese")){
            return new NYCheesePizza();
        } else if(pizzaType.equals("pepperoni")){
            return new NYPepperoniPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        } 
    }
    
}
