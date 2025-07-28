package com.anjoriarts.designpatterns.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
         if(pizzaType.equals("cheese")){
            return new ChicagoCheesePizza(new ChicagoPizzaIngredientFactory());
        } else if(pizzaType.equals("pepperoni")){
            return new ChicagoPepperoniPizza(new ChicagoPizzaIngredientFactory());
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        } 
    }
    
}
