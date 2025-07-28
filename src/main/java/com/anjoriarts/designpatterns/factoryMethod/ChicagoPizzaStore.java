package com.anjoriarts.designpatterns.factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
         if(pizzaType.equals("cheese")){
            return new ChicagoCheesePizza();
        } else if(pizzaType.equals("pepperoni")){
            return new ChicagoPepperoniPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        } 
    }
    
}
