package com.anjoriarts.designpatterns.abstractfactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public void createIngredient() {
       System.out.println("Create Chicago style Pizza Ingredients"); 
    }
    
}
