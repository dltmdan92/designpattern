package me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public ClamPizza(String name, PizzaIngredientFactory ingredientFactory) {
        super(name);
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비 중: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
