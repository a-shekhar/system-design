package com.anjoriarts.designpatterns.abstractfactory;

public class NYCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        System.out.println("NYCheesePizza preparation started...");
    }


    @Override
    public void prepare() {
        pizzaIngredientFactory.createIngredient();
        System.out.println("Pizza has been prepared");
    }
}

