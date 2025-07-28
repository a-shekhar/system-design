package com.anjoriarts.designpatterns.factory;

public class SimplePizzaFactory {
    Pizza pizza = null;

    public Pizza createPizza(String pizzaType){
        if(pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }else if(pizzaType.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        } 
        
        return pizza;
    }
}
