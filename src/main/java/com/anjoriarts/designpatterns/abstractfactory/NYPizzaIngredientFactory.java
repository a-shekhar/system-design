package com.anjoriarts.designpatterns.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public void createIngredient() {
       System.out.println("Create NY style Pizza Ingredients"); 
    }
    
}
