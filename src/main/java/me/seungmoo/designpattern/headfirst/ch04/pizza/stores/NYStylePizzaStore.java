package me.seungmoo.designpattern.headfirst.ch04.pizza.stores;

import me.seungmoo.designpattern.headfirst.ch04.pizza.factories.NYPizzaFactory;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    private final NYPizzaFactory factory;

    public NYStylePizzaStore() {
        this.factory = new NYPizzaFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
