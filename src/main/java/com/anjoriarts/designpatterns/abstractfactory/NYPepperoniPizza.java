package com.anjoriarts.designpatterns.abstractfactory;

public class NYPepperoniPizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYPepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        System.out.println("NYPepperoniPizza preparation started...");
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createIngredient();
        System.out.println("Pizza has been prepared");
    }
}
