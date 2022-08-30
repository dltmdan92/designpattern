package me.seungmoo.designpattern.headfirst.ch04.pizza.stores;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.*;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        // new 연산자 대신 팩토리 객체의 메서드를 사용했다.
        Pizza pizza = createPizza(type);

        // 불변의 영역
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
