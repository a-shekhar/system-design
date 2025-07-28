package com.anjoriarts.designpatterns.abstractfactory;

public class ChicagoCheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        System.out.println("ChicagoCheesePizza preparation started...");
    }

    @Override
    public void prepare() {
        pizzaIngredientFactory.createIngredient();
        System.out.println("Pizza has been prepared");
    }
}

