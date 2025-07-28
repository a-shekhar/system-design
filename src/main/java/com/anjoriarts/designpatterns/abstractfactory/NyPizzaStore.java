package com.anjoriarts.designpatterns.abstractfactory;

public class NyPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        if(pizzaType.equals("cheese")){
            return new NYCheesePizza(new NYPizzaIngredientFactory());
        } else if(pizzaType.equals("pepperoni")){
            return new NYPepperoniPizza(new NYPizzaIngredientFactory());
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        } 
    }
    
}
