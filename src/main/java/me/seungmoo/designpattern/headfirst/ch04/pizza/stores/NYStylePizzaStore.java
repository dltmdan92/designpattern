package me.seungmoo.designpattern.headfirst.ch04.pizza.stores;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.factories.NYPizzaIngredientFactory;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.*;

/**
 * 추상 클래스 PizzaStore를 상속받는 Factory class
 */
public class NYStylePizzaStore extends PizzaStore {

    public NYStylePizzaStore() {
        super(new NYPizzaIngredientFactory());
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza("뉴욕 스타일 피즈 피자", ingredientFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza("뉴욕 스타일 야채 피자", ingredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza("뉴욕 스타일 조개 피자", ingredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza("뉴욕 스타일 페퍼로니 피자", ingredientFactory);
                break;
        }

        return pizza;
    }
}
