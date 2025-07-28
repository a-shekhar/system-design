package com.anjoriarts.designpatterns.factory;

public class PizzaStore {

    public Pizza orderPizza(String pizzaType){

        Pizza pizza = null;

        if(pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }else if(pizzaType.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }      
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
