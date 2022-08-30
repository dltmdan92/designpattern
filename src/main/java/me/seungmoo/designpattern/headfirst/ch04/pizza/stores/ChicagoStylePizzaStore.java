package me.seungmoo.designpattern.headfirst.ch04.pizza.stores;

import me.seungmoo.designpattern.headfirst.ch04.pizza.factories.ChicagoPizzaFactory;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    private final ChicagoPizzaFactory factory;

    public ChicagoStylePizzaStore() {
        this.factory = new ChicagoPizzaFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
