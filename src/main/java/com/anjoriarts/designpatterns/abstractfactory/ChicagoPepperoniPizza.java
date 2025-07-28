package com.anjoriarts.designpatterns.abstractfactory;

public class ChicagoPepperoniPizza extends Pizza{
    
    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        System.out.println("ChicagoPepperoniPizza preparation started...");
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createIngredient();
        System.out.println("Pizza has been prepared");
    }
}
