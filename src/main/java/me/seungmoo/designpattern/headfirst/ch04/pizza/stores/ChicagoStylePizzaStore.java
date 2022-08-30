package me.seungmoo.designpattern.headfirst.ch04.pizza.stores;

import me.seungmoo.designpattern.headfirst.ch04.pizza.factories.ChicagoPizzaFactory;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;

/**
 * 추상 클래스 PizzaStore를 상속받는 Factory class
 */
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
