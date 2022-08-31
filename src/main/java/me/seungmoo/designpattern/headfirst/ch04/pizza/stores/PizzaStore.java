package me.seungmoo.designpattern.headfirst.ch04.pizza.stores;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.factories.PizzaIngredientFactory;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.*;

/**
 * DIP 원칙
 * PizzaStore는 고수준 구성 요소
 * Pizza 구상 클래스(ex. ChicagoStyleCheesePizza 등)는 저수준 구성 요소
 * PizzaStore(고수준 구성 요소)는 저수준 구성 요소에 의존해서는 안된다.
 * 고수준 구성 요소는 항상 추상화(Pizza 추상 클래스 or interface)에 의존해야 한다. (구상 클래스 X)
 *
 * 팩토리 메서드 패턴은 DIP 원칙을 적용하기에 좋은 패턴이다.
 */
public abstract class PizzaStore {
    protected final PizzaIngredientFactory ingredientFactory;

    protected PizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

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
