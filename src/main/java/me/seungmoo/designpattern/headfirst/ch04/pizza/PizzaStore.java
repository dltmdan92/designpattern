package me.seungmoo.designpattern.headfirst.ch04.pizza;

import me.seungmoo.designpattern.headfirst.ch04.pizza.factory.SimplePizzaFactory;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.*;

public class PizzaStore {

    private final SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        // new 연산자 대신 팩토리 객체의 메서드를 사용했다.
        Pizza pizza = factory.createPizza(type);

        // 불변의 영역
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
